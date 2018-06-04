package tuscheduler.diplom.com.tuscheduler;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.icon);
    }

    public void onClickLectorsButton(View view){
        Intent intent = new Intent(HomeActivity.this, ChooseWeekActivity.class);
        //TODO intent.putExtra("key", value);
        HomeActivity.this.startActivity(intent);
    }

    public void onClickGroupsButton(View view){
        Intent intent = new Intent(HomeActivity.this, ChooseWeekActivity.class);
        //TODO intent.putExtra("key", value);
        HomeActivity.this.startActivity(intent);
    }
}
