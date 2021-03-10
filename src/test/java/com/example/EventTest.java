package com.example;

import com.example.service.EventNotificationService;
import com.example.service.EventNotificationServiceImpl;
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


    }

    @Test
    @DisplayName("Añadir asistentes a una lista")
    void addAttendees() {


    }

    @Test
    @DisplayName("Quitar un asistente")
    void removeAttendee() {


    }

    @Test
    @DisplayName("Quitar asistentes de una lista")
    void removeAttendees() {



    }

    @Test
    @DisplayName("Notificar a todos los asistentes con Mockito")
    void notifyAssistants() {

    }

    @Test
    @DisplayName("Añadir un oyente")
    void addSpeaker() {



    }

    @Test
    @DisplayName("Quitar un oyente")
    void removeSpeaker() {


    }
}