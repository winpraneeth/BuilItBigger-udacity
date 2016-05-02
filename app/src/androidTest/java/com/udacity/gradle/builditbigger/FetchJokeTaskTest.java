package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by Praneeth on 5/2/2016.
 */
public class FetchJokeTaskTest extends AndroidTestCase {
    private static final String LOG_TAG = FetchJokeTask.class.getSimpleName();

    public void jokeTest() {
        FetchJokeTask jokeTask = new FetchJokeTask(getContext());
        jokeTask.execute();
        try {
            String joke = jokeTask.get(10, TimeUnit.SECONDS);
            assertNotNull(joke);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
            Log.d(LOG_TAG,"Operation timed out");
        }
    }
}
