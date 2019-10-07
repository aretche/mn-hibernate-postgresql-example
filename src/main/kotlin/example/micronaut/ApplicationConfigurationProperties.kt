package example.micronaut

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("application")
class ApplicationConfigurationProperties: ApplicationConfiguration {

    private val defaultMax = 10

    override var max: Int? = defaultMax
        set(max) {
            if (max != null) {
                field = max
            }
        }
}