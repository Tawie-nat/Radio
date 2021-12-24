package ru.netology.radio;

public class RadioService {

    private int currentRadioStation;
    private int currentSoundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentRadioStationWithNextButton() {
        if (currentRadioStation == 9){
            return;
        }
        currentRadioStation = currentRadioStation + 1;
    }

    public void setCurrentRadioStationWithNextButtonIf9() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void setCurrentRadioStationWithPrevButton() {
        if (currentRadioStation == 0){
            return;
        }
        currentRadioStation = currentRadioStation -1;
    }

    public void setCurrentRadioStationWithPrevButtonIf0() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }




    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 10) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void setCurrentSoundVolumeWithNextButton() {
        if (currentSoundVolume == 10){
            return;
        }
        currentSoundVolume = currentSoundVolume + 1;
    }

    public void setCurrentSoundVolumeWithNextButtonIf10() {
        if (currentSoundVolume == 10) {
            currentSoundVolume = 10;
        }
    }

    public void setCurrentSoundVolumeWithPrevButton() {
        if (currentSoundVolume == 0){
            return;
        }
        currentSoundVolume = currentSoundVolume - 1;
    }

    public void setCurrentSoundVolumeWithPrevButtonIf0() {
        if (currentSoundVolume == 0) {
            currentSoundVolume = 0;
        }
    }

}
