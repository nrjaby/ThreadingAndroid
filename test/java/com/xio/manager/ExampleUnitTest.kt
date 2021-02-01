package com.xio.manager

import android.content.Context
import org.hamcrest.core.Is.`is`
import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`


/**
 * Example local unit HomePageAppCallbackListener, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val TEST_STRING = "HELLO WORLD!"

    @Mock
    var mMockContext: Context? = null


    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    @Throws(Exception::class)
    fun addition_isNotCorrect() {
        assertEquals("Numbers isn't equals!", 5, 2
                + 3)
    }

    @Test(expected = NullPointerException::class)
    fun nullStringTest() {
        val str: String? = null
        assertTrue(str!!.isEmpty())
    }

    fun readStringFromContext() {
        //Returns the TEST_STRING when getString(R.string.hello_world) is called
        `when`(mMockContext?.getString(com.xio.manager.R.string.text_hello_word)).thenReturn(TEST_STRING)

        //Creates an object of the ClassUnderTest with the mock context
        val objectUnderTest = ClassUnderTest(mMockContext)


        //Stores the return value of getHelloWorldString() in result
        val result = objectUnderTest.helloWorldString
        //Asserts that result is the value of TEST_STRING
        assertThat(result, `is`(TEST_STRING))

    }


}
