public class Horse {
    int name;
    int position;
    int combined;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getCombined() {
        return combined;
    }

    public void setCombined(int combined) {
        this.combined = combined;
    }

    public Horse(int name, int position, int combined) {
        this.name = name;
        this.position = position;
        this.combined = combined;
    }

    @Override
    public boolean equals(Object object){
        Horse horse = (Horse) object;

        if(horse.position == this.position){
            return true;
        }
        return false;
    }

}
