package dev.kata.schedule

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doThrow
import org.mockito.kotlin.mock

class BusScheduleShould {

    val startingTime = Instant.now()


    @Test
    fun `should throws an expection given an invalid format`() {
        assertThrows {
            generateByText("")
        } //TODO: format not valid

    }

    @Test
    fun `should build the schedule given an input`() {
            val actual = generateByText("""
                V  D  EA RA ED RD  S
                61 E   0  1  2  3  A
            """, startingTime)

        val actual = generateByText("""
                V  D  EA RA ED RD  S
                61 E   0  1  2  3  A
                61 E   4  5  6  7  A
            """, startingTime)

        val actual = generateByText("""
                V  D  EA RA ED RD  S
                61 E   0  1  2  3  A
                61 E   4  5  6  7  B
                61 W   4  5  6  7  B
            """, startingTime)

        val actual = generateByText("""
                V  D  EA RA  ED  RD   S
                61 E   0  1   2   3   A
                61 E   4  5   6   7   B
                61 W   4  5   6   7   B
                61 W   8  9  10  11   C
            """, startingTime)


        }

    }


}