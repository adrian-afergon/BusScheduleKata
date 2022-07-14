package dev.kata.schedule

data class BusStop (
    val stopCode: String,
    val expectedArrival: Instant,
    val realArrival: Instant,
    val expectedDeparture: Instant,
    val realDeparture: Instant
        )

data class Voyage (
    val direction: String,
    val voyageNumber: Int,
    val line: String,
    val busStops: List<BusStop>
        )

data class BusSchedule (
    val busCode: String,
    val voyages: List<Voyage>
        )

fun generateByText(input: String, startingTime: Instant): BusSchedule {
    TODO("Not implemented yet")
}