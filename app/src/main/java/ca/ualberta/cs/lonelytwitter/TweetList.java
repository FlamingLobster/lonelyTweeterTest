package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by Michael on 2/15/2018.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public ArrayList<Tweet> getAll() {
        return tweets;
    }

    public int getSize() {
        return tweets.size();
    }
}
