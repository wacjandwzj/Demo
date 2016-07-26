package text.gitdemo.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import text.gitdemo.R;


public class SplashActivity extends AppCompatActivity {
    @Bind(R.id.splashPagerFragment)
    Fragment splashPagerFragment;
    @Bind(R.id.btnLogin)
    Button btnLogin;
    @Bind(R.id.btnEnter)
    Button btnEnter;
    @Bind(R.id.buttonBar)
    LinearLayout buttonBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

    }
}
