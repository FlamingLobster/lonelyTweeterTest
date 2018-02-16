package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by Michael on 2/15/2018.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

/*    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }
*/
    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertEquals(tweet, tweets.getTweet(0));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");

        tweets.add(tweet);

        try{
            tweets.add(tweet);
        } catch (IllegalArgumentException e){
            assertEquals(e.getClass(), IllegalArgumentException.class);
        }
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("adding a normal Tweet");
        Tweet tweet2 = new NormalTweet("2nd tweet");

        tweets.add(tweet1);
        tweets.add(tweet2);

        ArrayList<Tweet> returnedTweetList = tweets.getAll();
        assertEquals(returnedTweetList.get(0), tweet1);
        assertEquals(returnedTweetList.get(1), tweet2);
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("adding a normal Tweet");
        Tweet tweet2 = new NormalTweet("2nd tweet");

        tweets.add(tweet1);
        tweets.add(tweet2);

        ArrayList<Tweet> returnedTweetList = tweets.getAll();
        assertEquals(tweets.getSize(), returnedTweetList.size());
    }
}
