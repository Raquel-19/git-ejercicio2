package com.example;

import com.example.service.EventNotificationService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class EventTest {

    @Mock
    EventNotificationService eventNotificationService;

    @Test
    @DisplayName("Añadir un asistente")
    void addAttendee() {

        Event event = new Event();
        Attendee attendee = new Attendee(1l, "name", "email.com");

        event.addAttendee(attendee);
        assertEquals(1, event.getAttendees().get(0).getId());
        assertTrue(event.getAttendees().size() > 0);
        System.out.println(event.getAttendees().get(0).getId());

    }

    @Test
    @DisplayName("Añadir asistentes a una lista")
    void addAttendees() {

        Event event = new Event();
        Attendee attendee = new Attendee(2l, "name", "email.com");
        Attendee attendee2 = new Attendee(3l, "nam2", "email2.com");
        List<Attendee> attendees = new ArrayList<>();

        attendees.add(attendee);
        attendees.add(attendee2);
        event.addAttendees(attendees);
        assertTrue(event.getAttendees() != null);
        assertTrue(event.getAttendees().size() == 2);
        System.out.println(event.getAttendees().get(0).getId());
        System.out.println(event.getAttendees().get(1).getId());

    }

    @Test
    @DisplayName("Quitar un asistente")
    void removeAttendee() {

        Event event = new Event();
        Attendee attendee = new Attendee(4l, "name", "email.com");

        event.addAttendee(attendee);
        assertTrue(event.getAttendees().size() > 0);
        event.removeAttendee(attendee);
        assertTrue(event.getAttendees().size() == 0);
        System.out.println(event.getAttendees().size());

    }

    @Test
    @DisplayName("Quitar asistentes de una lista")
    void removeAttendees() {

        Event event = new Event();
        Attendee attendee = new Attendee(5l, "name", "email.com");
        Attendee attendee2 = new Attendee(6l, "nam2", "email2.com");
        List<Attendee> attendees = new ArrayList<>();

        attendees.add(attendee);
        attendees.add(attendee2);
        event.addAttendees(attendees);
        assertTrue(event.getAttendees().size() > 0);
        event.removeAttendees(attendees);
        System.out.println(event.getAttendees().size());
        assertTrue(event.getAttendees().size() == 0);

    }

    @Test
    @DisplayName("Notificar a todos los asistentes con Mockito")
    void notifyAssistants() {

        ArgumentCaptor <Event> argumentCaptor = ArgumentCaptor.forClass(Event.class);
        Event event = new Event(1l, "AA", EventType.TECH, eventNotificationService);
        event.notifyAssistants();
        Mockito.verify(eventNotificationService, Mockito.times(1)).announce(argumentCaptor.capture());

    }

    @Test
    @DisplayName("Comprobar setters y toString de asistentes")
    void settersAttendee () {

        Attendee attendee = new Attendee();


        attendee.setId(11L);
        attendee.setNickname("nam");
        attendee.setEmail("nam@gmail.com");

        assertEquals(11, attendee.getId());
        assertEquals("nam",attendee.getNickname());
        assertEquals("nam@gmail.com", attendee.getEmail());

        System.out.println(attendee.getId());
        System.out.println(attendee.getNickname());
        System.out.println(attendee.getEmail());
        System.out.println(attendee.toString());

    }

    @Test
    @DisplayName("Añadir un oyente")
    void addSpeaker() {

        Event event = new Event();
        Speaker speaker = new Speaker(7l, "name", "Aa");

        event.addSpeaker(speaker);
        assertEquals(7, event.getSpeakers().get(0).getId());
        System.out.println(event.getSpeakers().get(0).getId());

    }

    @Test
    @DisplayName("Quitar un oyente")
    void removeSpeaker() {

        Event event = new Event();
        Speaker speaker = new Speaker(8l, "name", "Aa");
        Speaker speaker2 = new Speaker(9l, "nam2", "Bb");
        Speaker speaker3 = new Speaker(10l, "nam3", "Cc");

        event.addSpeaker(speaker);
        event.addSpeaker(speaker2);
        event.addSpeaker(speaker3);
        event.removeSpeaker(speaker2);
        assertFalse(event.getSpeakers().size() == 3);
        System.out.println(event.getSpeakers().get(0).getId());
        System.out.println(event.getSpeakers().get(1).getId());

    }

    @Test
    @DisplayName ("Comprobar setters de oyente")
    void setterSpeaker () {
        Event event = new Event();
        Speaker speaker = new Speaker();

        speaker.setId(12L);
        speaker.setName("nam");
        speaker.setExpertise("Dd");
        event.addSpeaker(speaker);
        assertEquals(12, event.getSpeakers().get(0).getId());
        assertEquals("nam", event.getSpeakers().get(0).getName());
        assertEquals("Dd", event.getSpeakers().get(0).getExpertise());
        System.out.println(event.getSpeakers().get(0).getId());
        System.out.println(event.getSpeakers().get(0).getName());
        System.out.println(event.getSpeakers().get(0).getExpertise());
    }

    @Test
    @DisplayName ("Comprobar setters de notificacion")
    void setterNotification () {

        Notification notification = new Notification();
        notification.setMessage("message1");

        assertEquals("message1", notification.getMessage());
        System.out.println(notification.getMessage());

    }
}