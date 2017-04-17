package me.lorenc.springboot.lifecycle.listener.application

import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class ApplicationReadyListener : ApplicationListener<ApplicationReadyEvent> {

    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        println(">>>>>>>>>>ApplicationReadyListener")

        println(">>>>>>>>>> - context active: ${event.applicationContext.isActive}")
        println(">>>>>>>>>> - config property: ${event.applicationContext.environment.getProperty("config.prop")}")
    }
}
