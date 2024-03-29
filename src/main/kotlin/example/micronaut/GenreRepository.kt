package example.micronaut

import example.micronaut.domain.Genre
import javax.validation.constraints.NotBlank

interface GenreRepository {

    fun findById(id: Long): Genre?

    fun save(@NotBlank name: String): Genre

    fun deleteById(id: Long)

    fun findAll(args: SortingAndOrderArguments): List<Genre>

    fun update(id: Long, @NotBlank name: String): Int
}