package com.ileiwe.service.instructor;

import com.ileiwe.data.dto.InstructorPartyDto;
import com.ileiwe.data.model.Instructor;
import com.ileiwe.service.exception.UserAlreadyExistsException;

/**
 * @author oluwatobi
 * @version 1.0
 * @date on 29/10/2021
 * inside the package - com.ileiwe.service.instructor
 */
public interface InstructorService {
    Instructor save(InstructorPartyDto dto) throws UserAlreadyExistsException;

}
