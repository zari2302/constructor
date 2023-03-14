public class Rectangle {
    int theFirstSide;
    int theOtherSide;
    int theThirdSide;

    public Rectangle(int theFirstSide,int theOtherSide,int theThirdSide){
       this.theFirstSide=theFirstSide;
       this.theOtherSide=theOtherSide;
       this.theThirdSide=theThirdSide;
    }

    @Override
    public String toString() {
        return "Rectangle: \n" +
                "theFirstSide: " + theFirstSide + "\n"+
                "theOtherSide: " + theOtherSide +"\n"+
                "theThirdSide: " + theThirdSide ;
    }
}
