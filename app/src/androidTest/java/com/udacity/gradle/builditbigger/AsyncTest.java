package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Log;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import java.util.concurrent.TimeUnit;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class AsyncTest {
    @Test
    public void test() {
        String string = null;
        MyAsyncTask task = new MyAsyncTask(getTargetContext());
        task.execute();

        try {
            string = task.get(30, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Time out");
        }

        Assert.assertTrue(string.length() > 0 && !string.contains("failed"));

    }
}
