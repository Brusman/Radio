package ru.netology.radio;
public class Radio {

    private int currentVolume;
    private int currentStation;

    public void increaseVolume() {
        if (currentVolume<100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume>0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= 0) {
            if (newCurrentStation < 10){
                currentStation = newCurrentStation;
            }
        }
        return;
    }

//    public int getCurrentStation() {
//        return currentStation;
//    }
    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        }
        setCurrentStation(currentStation + 1);
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        setCurrentStation(currentStation - 1);
    }
}

