package me.lorenc.springboot.lifecycle.listener.application

import org.springframework.boot.context.event.ApplicationStartingEvent
import org.springframework.context.ApplicationListener

class ApplicationStartingListener : ApplicationListener<ApplicationStartingEvent> {

    override fun onApplicationEvent(event: ApplicationStartingEvent) {
        println(">>>>>>>>>>ApplicationStartingListener")

        println(">>>>>>>>>> - source: ${event.source}")
        println(">>>>>>>>>> - args: ${event.args.asList()}")
    }
}
