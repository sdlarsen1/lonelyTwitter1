package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by stephen on 2016-09-29.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private ArrayList<Tweet> returnedTweets = new ArrayList<Tweet>();

    public TweetList() {

    }

    public Boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet) {
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public int getCount() {
        return tweets.size();
    }

    public ArrayList<Tweet> getTweets() {
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });
        return tweets;
    }
}
