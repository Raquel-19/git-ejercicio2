package com.example.service;

import com.example.Attendee;
import com.example.Event;
import com.example.EventType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class EventNotificationServiceImplTest {

    private static final String MSG_ANNOUNCE = "The next big event is coming!";

    @Mock
    EventNotificationService eventNotificationService;

    @InjectMocks
    EventNotificationServiceImpl eventNotificationServiceImpl;


    @Test
    @DisplayName("Confirmar comunicado con Mockito ")
    void announce() {


    }


    @Test
    @DisplayName("Confirmar asistencia con Mockito")
    void confirmAttendance() {

    }
}