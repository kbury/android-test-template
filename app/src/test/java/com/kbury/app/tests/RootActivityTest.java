package com.kbury.app.tests;

import android.app.Activity;

import com.kbury.app.RootActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by kbury on 24/06/2014.
 */
@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class RootActivityTest {

    @Test
    public void testSomething() throws Exception {
        Activity activity = Robolectric.buildActivity(RootActivity.class).create().get();
        assertTrue(activity != null);
    }
}