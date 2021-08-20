public class Horse {
    private int name;
    private int position;
    private int combined;
    private int conbinedName;

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

    public int getConbinedName() {
        return conbinedName;
    }

    public void setConbinedName(int conbinedName) {
        this.conbinedName = conbinedName;
    }

    public Horse(int name, int position, int combined, int conbinedName) {
        this.name = name;
        this.position = position;
        this.combined = combined;
        this.conbinedName = conbinedName;
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
