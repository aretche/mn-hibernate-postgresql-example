package example.micronaut

import javax.validation.constraints.NotNull

interface ApplicationConfiguration {
    @get:NotNull
    val max: Int?
}