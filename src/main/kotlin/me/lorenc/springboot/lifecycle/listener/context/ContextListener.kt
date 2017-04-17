package me.lorenc.springboot.lifecycle.listener.context

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.event.ContextClosedEvent
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.context.event.ContextStartedEvent
import org.springframework.context.event.ContextStoppedEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class ContextListener(
        @Value("\${config.prop}") private var configProp: String
) {

    @EventListener
    fun contextStarted(event: ContextStartedEvent) {
        println(">>>>>>>>>>ContextListener:contextStarted")
        println(">>>>>>>>>> - config property: $configProp")
    }

    @EventListener
    fun contextRefreshed(event: ContextRefreshedEvent) {
        println(">>>>>>>>>>ContextListener:contextRefreshed")
        println(">>>>>>>>>> - config property: $configProp")
    }

    @EventListener
    fun contextStopped(event: ContextStoppedEvent) {
        println(">>>>>>>>>>ContextListener:contextStopped")
    }

    @EventListener
    fun contextClosed(event: ContextClosedEvent) {
        println(">>>>>>>>>>ContextListener:contextClosed")
    }
}
