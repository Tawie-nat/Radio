package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioServiceTest {



    @Test
    public void ifBetweenMinAndMaxStationSetCurrentStation() {
        RadioService radio = new RadioService();
        radio.setLastStation();
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setLastStation();
        radio1.setCurrentStation(12);
        assertEquals(12, radio1.getCurrentStation());
    }

    @Test
    public void ifBellowFirstStationSetCurrentStation() {
        RadioService radio = new RadioService();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setCurrentStation(-4);
        assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    public void ifUnderLastStationSetCurrentStation() {
        RadioService radio = new RadioService();
        radio.setLastStation();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setLastStation();
        radio1.setCurrentStation(12);
        assertEquals(12, radio1.getCurrentStation());
    }


    @Test
    public void shouldSetCurrentStationUsingNextButtonIfBellowLastStation() {
        RadioService radio = new RadioService();
        radio.setLastStation();
        radio.setCurrentStation(7);
        radio.setCurrentStationWithNextButton();
        assertEquals(8, radio.getCurrentStation());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setLastStation();
        radio1.setCurrentStation(11);
        radio1.setCurrentStationWithNextButton();
        assertEquals(12, radio1.getCurrentStation());
    }


    @Test
    public void shouldSetCurrentStationUsingNextButtonIfLastStation() {
        RadioService radio = new RadioService();
        radio.setCurrentStation(radio.getLastStation());
        radio.setCurrentStationWithNextButton();
        assertEquals(0, radio.getCurrentStation());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setCurrentStation(radio1.getLastStation());
        radio1.setCurrentStationWithNextButton();
        assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentRadioStationUsingPrevButtonIfUnderFirstStation() {
        RadioService radio = new RadioService();
        radio.setLastStation();
        radio.setCurrentStation (1);
        radio.setCurrentStationWithPrevButton();
        assertEquals(0, radio.getCurrentStation());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setLastStation();
        radio1.setCurrentStation (8);
        radio1.setCurrentStationWithPrevButton();
        assertEquals(7, radio1.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationUsingPrevButtonIfFirstStation() {
        RadioService radio = new RadioService();
        radio.setLastStation();
        radio.setCurrentStation(radio.getFirstStation());
        radio.setCurrentStationWithPrevButton();
        assertEquals(9, radio.getCurrentStation());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setLastStation();
        radio1.setCurrentStation(radio1.getFirstStation());
        radio1.setCurrentStationWithPrevButton();
        assertEquals(15, radio1.getCurrentStation());
    }

    @Test
    public void ifBetweenMinAndMaxVolumeSetCurrentSoundVolume() {
        RadioService radio = new RadioService();
        radio.setCurrentSoundVolume(50);
        assertEquals(50, radio.getCurrentSoundVolume());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setCurrentSoundVolume(60);
        assertEquals(60, radio1.getCurrentSoundVolume());
    }

    @Test
    public void ifUnderMaxSetCurrentSoundVolume() {
        RadioService radio = new RadioService();
        radio.setCurrentSoundVolume(120);
        assertEquals(100, radio.getCurrentSoundVolume());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setCurrentSoundVolume(100);
        assertEquals(80, radio1.getCurrentSoundVolume());
    }

    @Test
    public void ifBellowMinSetCurrentSoundVolume() {
        RadioService radio = new RadioService();
        radio.setCurrentSoundVolume(-1);
        assertEquals(0, radio.getCurrentSoundVolume());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setCurrentSoundVolume(-8);
        assertEquals(0, radio1.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingNextButtonIfBellowMax() {
        RadioService radio = new RadioService();
        radio.setCurrentSoundVolume(30);
        radio.setCurrentSoundVolumeWithNextButton();
        assertEquals(31, radio.getCurrentSoundVolume());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setCurrentSoundVolume(70);
        radio1.setCurrentSoundVolumeWithNextButton();
        assertEquals(71, radio1.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingNextButtonIfMax() {
        RadioService radio = new RadioService();
        radio.setCurrentSoundVolume(radio.getMaxSoundVolume());
        radio.setCurrentSoundVolumeWithNextButton();
        assertEquals(100, radio.getCurrentSoundVolume());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setCurrentSoundVolume(radio1.getMaxSoundVolume());
        radio1.setCurrentSoundVolumeWithNextButton();
        assertEquals(80, radio1.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingPrevButtonIfUnderMin() {
        RadioService radio = new RadioService();
        radio.setCurrentSoundVolume(60);
        radio.setCurrentSoundVolumeWithPrevButton();
        assertEquals(59, radio.getCurrentSoundVolume());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setCurrentSoundVolume(70);
        radio1.setCurrentSoundVolumeWithPrevButton();
        assertEquals(69, radio1.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingPrevButtonIfMin() {
        RadioService radio = new RadioService();
        radio.setCurrentSoundVolume(radio.getMinSoundVolume());
        radio.setCurrentSoundVolumeWithPrevButton();
        assertEquals(0, radio.getCurrentSoundVolume());

        RadioService radio1 = new RadioService("radio-test", 16, 80  );
        radio1.setCurrentSoundVolume(radio1.getMinSoundVolume());
        radio1.setCurrentSoundVolumeWithPrevButton();
        assertEquals(0, radio1.getCurrentSoundVolume());
    }

  }



