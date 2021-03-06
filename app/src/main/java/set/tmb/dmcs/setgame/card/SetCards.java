package set.tmb.dmcs.setgame.card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import set.tmb.dmcs.setgame.card.Card;
import set.tmb.dmcs.setgame.card.Color;
import set.tmb.dmcs.setgame.card.Inside;
import set.tmb.dmcs.setgame.card.Shape;

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
        return drawnCards.contains(actualCard);
    }

}
