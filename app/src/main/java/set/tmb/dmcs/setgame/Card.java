package set.tmb.dmcs.setgame;

/**
 * Created by Damian on 2015-03-22.
 */

import java.util.Random;



/**
 * Created by Damian on 2015-03-15.
 */
public class Card {
    int Id;
    Color color;
    int figuresQuantity;
    Shape shape;
    Inside inside;
    int drawableColor;

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

        if (figuresQuantity != card.figuresQuantity) return false;
        if (color != card.color) return false;
        if (inside != card.inside) return false;
        if (shape != card.shape) return false;

        return true;
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
        return this.figuresQuantity+""+this.color.toString().substring(0,1)+""+this.shape.toString().substring(0,1)+""+this.inside.toString().substring(0,1);
    }


}

