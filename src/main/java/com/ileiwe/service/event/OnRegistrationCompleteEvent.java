package com.ileiwe.service.event;

import com.ileiwe.data.model.LearningParty;
import lombok.Data;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author oluwatobi
 * @version 1.0
 * @date on 08/11/2021
 * inside the package - com.ileiwe.service.event
 */

@Getter
public class OnRegistrationCompleteEvent extends ApplicationEvent {

    private LearningParty appUser;

    public OnRegistrationCompleteEvent(LearningParty source) {
        super(source);
        this.appUser = source;
    }
}
