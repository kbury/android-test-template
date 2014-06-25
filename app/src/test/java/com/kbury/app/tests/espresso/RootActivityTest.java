package com.kbury.app.tests.espresso;

import android.test.ActivityInstrumentationTestCase2;

import com.kbury.app.R;
import com.kbury.app.RootActivity;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

/**
 * Created by kbury on 24/06/2014.
 */
public class RootActivityTest extends ActivityInstrumentationTestCase2<RootActivity> {
    public RootActivityTest(Class<RootActivity> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testCheckText() {
        onView(withId(R.id.section_label)).check(matches(withText("Hello Espresso!")));
    }
}
