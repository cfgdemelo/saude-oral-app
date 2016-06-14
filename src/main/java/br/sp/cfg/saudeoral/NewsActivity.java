package br.sp.cfg.saudeoral;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private String name;
    private String email;
    private TextView txtWelcome, txtNome, txtEmail,_Header_Text_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_news);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View viewActionBar = (this).getLayoutInflater().inflate(R.layout.nav_header_principal, null);

        _Header_Text_View = (TextView) viewActionBar.findViewById(R.id.nameHeader);


        txtWelcome = (TextView) findViewById(R.id.welcome);
        txtEmail = (TextView) findViewById(R.id.emailHeader);
        txtNome = (TextView) findViewById(R.id.nameHeader);

        Intent it = getIntent();
        name = it.getStringExtra("name");
        email = it.getStringExtra("email");

//        txtWelcome.setText("Bem vindo "+name);
//        txtEmail.setText(email);
//        txtNome.setText(name);

        _Header_Text_View.setText(name);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setIcon(R.drawable.ic_error_black_24dp);
            alerta.setTitle("Alerta");
            alerta.setMessage("Você está saindo do Sistema, deseja continuar?");
            alerta.setPositiveButton("Sim", null);
            alerta.setNegativeButton("Não", null);
            alerta.create().show();
//            super.onBackPressed();
        }
    }
    public void finalizar(){
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_news) {
            Intent it = new Intent(this,Principal.class);
            startActivity(it);
        } else if (id == R.id.nav_schedule) {
            Intent it = new Intent(this,Agendar.class);
            startActivity(it);
        } else if (id == R.id.nav_treatment) {
            Intent it = new Intent(this,Acompanhe.class);
            startActivity(it);
        } else if (id == R.id.nav_jobs) {
            Intent it = new Intent(this,Servicos.class);
            startActivity(it);
        } else if (id == R.id.nav_alerts){
            Intent it = new Intent(this,Lembretes.class);
            startActivity(it);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_news);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
