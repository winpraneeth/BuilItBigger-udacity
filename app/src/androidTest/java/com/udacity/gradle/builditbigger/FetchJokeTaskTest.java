package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by Praneeth on 5/2/2016.
 */
public class FetchJokeTaskTest extends AndroidTestCase {
    private static final String LOG_TAG = FetchJokeTask.class.getSimpleName();

    @SuppressWarnings("unchecked")
    public void test() {

        String joke = null;
        FetchJokeTask endpointsAsyncTask = new FetchJokeTask(getContext());
        endpointsAsyncTask.execute();
        try {
            joke = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "Retrieved joke successfully: " + joke);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(joke);
    }
}
