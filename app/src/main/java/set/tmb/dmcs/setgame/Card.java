package set.tmb.dmcs.setgame;

import android.graphics.drawable.Drawable;

public class Card {
    int Id;
    Color color;
    int figuresQuantity;
    Shape shape;
    Inside inside;
    Drawable drawable;

    public Card(int Id, int figuresQuantity, Color color, Shape shape, Inside inside){
        this.Id=Id;
        this.color = color;
        this.figuresQuantity = figuresQuantity;
        this.shape=shape;
        this.inside = inside;
        this.drawable = getDrawable(this.toString());
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
        return shape.toString().toLowerCase()+"_"+color.toString().toLowerCase()+"_"+inside.toString().toLowerCase()+"_"+figuresQuantity;
    }

    private Drawable getDrawable(String name){
        MainActivity context = MainActivity.getContext();
        int resourceId = context.getResources().getIdentifier(name, "drawable", context.getPackageName());
        return context.getResources().getDrawable(resourceId);
    }


}

