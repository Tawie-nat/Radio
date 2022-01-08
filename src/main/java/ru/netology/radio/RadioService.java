package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RadioService {
    private int id;
    private String name = "Radio-box";
    private int currentStation = 0;
    private int firstStation = 0;
    private int amountStation = 10;
    private int lastStation = 0;
    private int currentSoundVolume = 0;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;



    public RadioService(String name, int amountStation, int maxSoundVolume) {
        this.name = name;
        this.amountStation = amountStation;
        this.maxSoundVolume = maxSoundVolume;
    }



    public void setLastStation() {
        this.lastStation = amountStation -1;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < firstStation) {
            return;
        }
        if (currentStation > lastStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void setCurrentStationWithNextButton() {
        if (currentStation == lastStation) {
            currentStation = firstStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void setCurrentStationWithPrevButton() {
        if (currentStation == firstStation) {
            currentStation = lastStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < minSoundVolume) {
            this.currentSoundVolume = minSoundVolume;
            return;
        }
        if (currentSoundVolume > maxSoundVolume) {
            this.currentSoundVolume = maxSoundVolume;
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void setCurrentSoundVolumeWithNextButton() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume + 1;
    }

    public void setCurrentSoundVolumeWithPrevButton() {
        if (currentSoundVolume == minSoundVolume) {
            return;
        }
        currentSoundVolume = currentSoundVolume - 1;
    }
}
