package plannedactsofkindness.org.plannedactsofkindness.UI;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import plannedactsofkindness.org.plannedactsofkindness.Function.Reusable;
import plannedactsofkindness.org.plannedactsofkindness.Function.text;
import plannedactsofkindness.org.plannedactsofkindness.R;

/**
 * Created by pkkwilliam on 5/24/17.
 */

public class MentorshipsInternships2  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_without_g);

        Reusable reuse = new Reusable(MentorshipsInternships2.this, MentorshipsInternships3.class);
        reuse.setup();

        text getContent = new text();
        String volunteer = getContent.getMentorshipsInternship2();
        WebView webView = (WebView) findViewById(R.id.reusableWebView);
        webView.loadDataWithBaseURL(null, volunteer, "text/html", "utf-8", null);
        webView.setBackgroundColor(Color.TRANSPARENT);
        {

        }
    }}
