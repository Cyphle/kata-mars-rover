package com.marsrover.config

import com.marsrover.domain.application.MoveRoverForward
import com.marsrover.infrastructure.api.RoverAdapter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfiguration {

    @Bean
    fun roverAdapter(moveRoverForward: MoveRoverForward) = RoverAdapter(moveRoverForward)

}
