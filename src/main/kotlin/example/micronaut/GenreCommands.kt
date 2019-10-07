package example.micronaut

import javax.validation.constraints.NotBlank

data class GenreSaveCommand(
        @NotBlank
        val name: String
)

data class GenreUpdateCommand(
        val id: Long,

        @NotBlank
        val name: String
)