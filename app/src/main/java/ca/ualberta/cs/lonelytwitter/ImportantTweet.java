package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/15/16.
 * This is the ImportantTweet class.
 * @see Tweet
 * @see LonelyTwitterActivity
 */
public class ImportantTweet extends Tweet{

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }


}
