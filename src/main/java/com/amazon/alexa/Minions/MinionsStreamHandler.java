package com.amazon.alexa.Minions;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.alexa.Minions.handlers.CancelandStopIntentHandler;
import com.amazon.alexa.Minions.handlers.HelloWorldIntentHandler;
import com.amazon.alexa.Minions.handlers.HelpIntentHandler;
import com.amazon.alexa.Minions.handlers.SessionEndedRequestHandler;
import com.amazon.alexa.Minions.handlers.LaunchRequestHandler;

public class MinionsStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                // Add your skill id below
                //.withSkillId("")
                .build();
    }

    public MinionsStreamHandler() {
        super(getSkill());
    }

}
