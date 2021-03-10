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

        Event event = new Event(1l, "AA", EventType.BUSINESS, eventNotificationServiceImpl);
        List<Attendee> attendees = new ArrayList<>();
        Attendee attendee = new Attendee(
                1l,
                "name",
                "nam@email"
        );
        event.addAttendee(attendee);
        eventNotificationServiceImpl.announce(event);
        System.out.println(attendee.getNotifications());
    }


    @Test
    @DisplayName("Confirmar asistencia con Mockito")
    void confirmAttendance() {

        Event event = new Event(2l, "BB", EventType.TECH, eventNotificationServiceImpl);
        List<Attendee> attendees = new ArrayList<>();
        Attendee attendee = new Attendee(
                2l,
                "nam2",
                "nam@email"
        );
        event.addAttendee(attendee);
        eventNotificationServiceImpl.confirmAttendance(event, attendee);
        System.out.println(attendee.getNotifications());
    }
}