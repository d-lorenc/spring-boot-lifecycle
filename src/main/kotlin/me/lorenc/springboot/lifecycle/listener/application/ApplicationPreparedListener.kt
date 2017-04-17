package me.lorenc.springboot.lifecycle.listener.application

import org.springframework.boot.context.event.ApplicationPreparedEvent
import org.springframework.context.ApplicationListener

class ApplicationPreparedListener : ApplicationListener<ApplicationPreparedEvent> {

    override fun onApplicationEvent(event: ApplicationPreparedEvent) {
        println(">>>>>>>>>>ApplicationPreparedListener")

        println(">>>>>>>>>> - context active: ${event.applicationContext.isActive}")
        println(">>>>>>>>>> - config property: ${event.applicationContext.environment.getProperty("config.prop")}")
    }
}
