package set.tmb.dmcs.setgame;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Damian on 2015-03-22.
 */
public class SetCards {
    private static List<Card> cards = new ArrayList<>();
    public SetCards(){

        int j=0;
        for(Inside inside: Inside.values()){
            for(Color color: Color.values()){
                for(Shape shape: Shape.values()){
                    for(int i=1;i<=3;i++){
                        cards.add(new Card(j,i,color,shape,inside));
                        j++;
                    }
                }
            }
        }
    }

    public static List<Card> getCardsToGame(){
        List<Card> cardsToGame = new ArrayList<>();
        Random generator = new Random();
        Card randomCard;
        for(int i=0;i<12;){
            randomCard = cards.get(generator.nextInt(81));
            if(!isDrawn(cardsToGame,randomCard)){
                cardsToGame.add(randomCard);
                i++;
            }

        }

        return cardsToGame;
    }

    private static boolean isDrawn(List<Card> drawnCards, Card actualCard){
        if(drawnCards.isEmpty()) return false;
        for(Card card: drawnCards){
            if(actualCard.equals(card)) return true;
        }
        return false;
    }

}
