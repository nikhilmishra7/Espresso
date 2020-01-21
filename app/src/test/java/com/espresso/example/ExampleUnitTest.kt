package com.espresso.example

import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(JUnit4::class)
class ExampleUnitTest {

    @Test
    fun sum_isCorrect() {
        val computation = Computation()
        assertEquals(4, computation.Sum(2, 2))
    }

    @Test
    fun multiply_isCorrect() {
        val computation = Computation()
        assertEquals(4, computation.Multiply(2, 2))
    }

}
