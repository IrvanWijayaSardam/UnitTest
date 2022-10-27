package com.aminivan.unittest

class Register{
    private val existingUsers = listOf("20SA1106","aminivan@gmail.com","inipassword","inipassword")

    /**
     * the input is not valid if...
     * ...the userName/password is empty
     * ...the userName is already taken
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than 2 digits
     */

    fun validateRegistrationInput(
        name: String,
        email: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (name.isEmpty() || email.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }
        if (name in existingUsers){
            return false
        }
        if (email in existingUsers){
            return false
        }
        if (password != confirmedPassword){
            return false
        }
        if (password.count { it.isDigit() } < 6){
            return false
        }
        if (password.count { it.isDigit() } > 50){
            return false
        }
        return true
    }

}