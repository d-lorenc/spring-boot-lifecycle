package me.lorenc.springboot.lifecycle.factory

import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.ConfigurableApplicationContext

class SpringFactoryApplicationContextInitializer : ApplicationContextInitializer<ConfigurableApplicationContext> {

    override fun initialize(applicationContext: ConfigurableApplicationContext) {
        println(">>>>>>>>>>SpringFactoryApplicationContextInitializer:initialize")

        println(">>>>>>>>>> - context active: ${applicationContext.isActive}")
        println(">>>>>>>>>> - config property: ${applicationContext.environment.getProperty("config.prop")}")

    }
}
