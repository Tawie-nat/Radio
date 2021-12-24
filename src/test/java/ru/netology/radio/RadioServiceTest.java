package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioServiceTest {
    RadioService radio = new RadioService();

    @Test
    public void setCurrentRadioStation() {
        radio.setCurrentRadioStation(5);

        int actual = radio.getCurrentRadioStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationUsingNextButtonIfBetween0And8() {
        // вызов метода установки радиостанции
        radio.setCurrentRadioStation(7);
        // вызов метода переключения на следующую радиостанцию (если значение от 0 до 8)
        radio.setCurrentRadioStationWithNextButton();
        // вызов метода переключения на следующую радиостанцию (если значение 9)
        radio.setCurrentRadioStationWithNextButtonIf9 ();

        // вывод фактического результата вызовом метода get
        int actual = radio.getCurrentRadioStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationUsingNextButtonIf9() {
        // вызов метода установки радиостанции
        radio.setCurrentRadioStation(9);
        // вызов метода переключения на следующую радиостанцию (если значение от 0 до 8)
        radio.setCurrentRadioStationWithNextButton();
        // вызов метода переключения на следующую радиостанцию (если значение 9)
        radio.setCurrentRadioStationWithNextButtonIf9 ();

        // вывод фактического результата вызовом метода get
        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationUsingPrevButtonIfBetween1And9() {
        // вызов метода установки радиостанции
        radio.setCurrentRadioStation(6);
        // вызов метода переключения на предыдущую радиостанцию (если значение от 1 до 9)
        radio.setCurrentRadioStationWithPrevButton();
        // вызов метода переключения на следующую радиостанцию (если значение 0)
        radio.setCurrentRadioStationWithPrevButtonIf0 ();

        // вывод фактического результата вызовом метода get
        int actual = radio.getCurrentRadioStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationUsingPrevButtonIf0() {
        // вызов метода установки радиостанции
        radio.setCurrentRadioStation(0);
        // вызов метода переключения на предыдущую радиостанцию (если значение от 1 до 9)
        radio.setCurrentRadioStationWithPrevButton();
        // вызов метода переключения на следующую радиостанцию (если значение 0)
        radio.setCurrentRadioStationWithPrevButtonIf0 ();

        // вывод фактического результата вызовом метода get
        int actual = radio.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }





    @Test
    public void setCurrentSoundVolume() {
        radio.setCurrentSoundVolume(9);

        int actual = radio.getCurrentSoundVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingNextButtonIfBetween0And9() {
        // вызов метода установки громкости звука
        radio.setCurrentSoundVolume(3);
        // вызов метода переключения на следующий уровень громкости (если значение от 0 до 9)
        radio.setCurrentSoundVolumeWithNextButton();
        // вызов метода переключения на следующий уровень громкости (если значение 10)
        radio.setCurrentSoundVolumeWithNextButtonIf10 ();

        // вывод фактического результата вызовом метода get
        int actual = radio.getCurrentSoundVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingNextButtonIf10() {
        // вызов метода установки громкости звука
        radio.setCurrentSoundVolume(10);
        // вызов метода переключения на следующий уровень громкости (если значение от 0 до 9)
        radio.setCurrentSoundVolumeWithNextButton();
        // вызов метода переключения на следующий уровень громкости (если значение 10)
        radio.setCurrentSoundVolumeWithNextButtonIf10 ();

        // вывод фактического результата вызовом метода get
        int actual = radio.getCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingPrevButtonIfBetween1And10() {
        // вызов метода установки громкости звука
        radio.setCurrentSoundVolume(2);
        // вызов метода переключения на предыдущий уровень громкости (если значение от 1 до 10)
        radio.setCurrentSoundVolumeWithPrevButton();
        // вызов метода переключения на предыдущий уровень громкости (если значение 0)
        radio.setCurrentSoundVolumeWithPrevButtonIf0 ();

        // вывод фактического результата вызовом метода get
        int actual = radio.getCurrentSoundVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingPrevButtonIf0() {
        // вызов метода установки громкости звука
        radio.setCurrentSoundVolume(0);
        // вызов метода переключения на предыдущий уровень громкости (если значение от 1 до 10)
        radio.setCurrentSoundVolumeWithPrevButton();
        // вызов метода переключения на предыдущий уровень громкости (если значение 0)
        radio.setCurrentSoundVolumeWithPrevButtonIf0();

        // вывод фактического результата вызовом метода get
        int actual = radio.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}



