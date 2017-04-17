package me.lorenc.springboot.lifecycle.listener.application

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent
import org.springframework.context.ApplicationListener

class ApplicationEnvironmentPreparedListener : ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    override fun onApplicationEvent(event: ApplicationEnvironmentPreparedEvent) {
        println(">>>>>>>>>>ApplicationEnvironmentPreparedListener")

        println(">>>>>>>>>> - config property: ${event.environment.getProperty("config.prop")}")

        val isCloudProfileActive = event.environment.acceptsProfiles("cloud ")
        println(">>>>>>>>>> - cloud profile active: $isCloudProfileActive")
    }
}
