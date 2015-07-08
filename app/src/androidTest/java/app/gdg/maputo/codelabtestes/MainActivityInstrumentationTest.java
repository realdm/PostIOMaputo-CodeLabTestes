package app.gdg.maputo.codelabtestes;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import app.gdg.maputo.codelabtestes.MainActivity;
import app.gdg.maputo.codelabtestes.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {

    private static final String NOME_A_INSERIR = "Yolanda";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void sayHello(){

        //escreve texto no editText
        onView(withId(R.id.mTextNome)).perform(typeText(NOME_A_INSERIR), closeSoftKeyboard()); //line 1

        //faz o click no botao
        onView(withText("Say hello!")).perform(click()); //line 2


        String expectedText = "Hello, " + NOME_A_INSERIR + "!";

        
        onView(withId(R.id.textView)).check(matches(withText(expectedText))); //line 3
    }

}