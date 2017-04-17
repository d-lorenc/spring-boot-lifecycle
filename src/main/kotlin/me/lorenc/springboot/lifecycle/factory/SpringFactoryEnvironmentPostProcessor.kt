package me.lorenc.springboot.lifecycle.factory

import org.springframework.boot.SpringApplication
import org.springframework.boot.env.EnvironmentPostProcessor
import org.springframework.core.env.ConfigurableEnvironment

open class SpringFactoryEnvironmentPostProcessor : EnvironmentPostProcessor {

    override fun postProcessEnvironment(environment: ConfigurableEnvironment, application: SpringApplication) {
        println(">>>>>>>>>>SpringFactoryEnvironmentPostProcessor:postProcessEnvironment")

        println(">>>>>>>>>> - config property: ${environment.getProperty("config.prop")}")

        val isCloudProfileActive = environment.acceptsProfiles("cloud ")
        println(">>>>>>>>>> - cloud profile active: $isCloudProfileActive")

    }
}
