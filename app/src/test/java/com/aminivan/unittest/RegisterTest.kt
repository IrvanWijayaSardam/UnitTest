package com.aminivan.unittest

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class RegisterTest {

    lateinit var regist : Register

    @Before
    fun setUp(){
        regist = Register()
    }

    @Test
    fun validateRegistrationInput() {
        val result = regist.validateRegistrationInput("irvan","aminivan@gmail.com","sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsjhdfgsdfhjkgfsdsdfhjksgdfvhjsdfvsdhjfgvhjdsfgvhjdskfgvudshjkfgsdhjfgvdshjfg","awikawok hjsdfg vdshjfg dvshjfg vdshjfg vhjsd fg")
        assertEquals("password lebih dari 50", result, false)
    }

}