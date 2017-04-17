package me.lorenc.springboot.lifecycle.bean

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.Lifecycle
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class LifecycleBean(
        @Value("\${config.prop}") private var configProp: String
) : Lifecycle {

    private var running: Boolean = false

    @PostConstruct
    fun init() {
        println(">>>>>>>>>>LifecycleBean:PostConstruct")
        println(">>>>>>>>>> - config property: $configProp")
        start()
    }

    override fun isRunning(): Boolean {
        println(">>>>>>>>>>LifecycleBean:isRunning: $running")
        return running
    }

    override fun start() {
        running = true
        println(">>>>>>>>>>LifecycleBean:start")
    }

    override fun stop() {
        running = false
        println(">>>>>>>>>>LifecycleBean:stop")
    }
}
