package set.tmb.dmcs.setgame;

import android.graphics.drawable.Drawable;

public class Card {
    int Id;
    Color color;
    int figuresQuantity;
    Shape shape;
    Inside inside;

    public Card(int Id, int figuresQuantity, Color color, Shape shape, Inside inside){
        this.Id=Id;
        this.color = color;
        this.figuresQuantity = figuresQuantity;
        this.shape=shape;
        this.inside = inside;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;
        return color == card.color && inside == card.inside && shape == card.shape && figuresQuantity == card.figuresQuantity;

    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + figuresQuantity;
        result = 31 * result + shape.hashCode();
        result = 31 * result + inside.hashCode();
        return result;
    }

     @Override
    public String toString(){
        return shape+"_"+color+"_"+inside+"_"+figuresQuantity;
    }

    private void getDrawable(){
        Drawable d = R.drawable.OVAL_GREEN_FULL_3;
    }


}

