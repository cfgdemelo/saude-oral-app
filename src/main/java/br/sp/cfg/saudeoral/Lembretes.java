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
import android.widget.Toast;

public class Lembretes extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private String name;
    private String email;
    private int tent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lembretes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_lembretes);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_lembretes);
        navigationView.setNavigationItemSelectedListener(this);
        View headerView = navigationView.getHeaderView(0);
        TextView textoNomeHeader = (TextView) headerView.findViewById(R.id.nameHeaderLembretes);
        TextView textoEmailHeader = (TextView) headerView.findViewById(R.id.emailHeaderLembretes);

        tent = 1;
        Intent it = getIntent();
        name = it.getStringExtra("name");
        email = it.getStringExtra("email");

        textoNomeHeader.setText(name);
        textoEmailHeader.setText(email);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
           /* AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setIcon(R.drawable.ic_error_black_24dp);
            alerta.setTitle("Alerta");
            alerta.setMessage("Você está saindo do Sistema, deseja continuar?");
            alerta.setPositiveButton("Sim", null);
            alerta.setNegativeButton("Não", null);
            alerta.create().show();*/
            tent = tent + 1;
            if (tent == 2){
                Toast.makeText(this,"Pressione novamente para sair",Toast.LENGTH_SHORT).show();
            }else if (tent == 3){
                super.onBackPressed();
            }
        }
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
            it.putExtra("email",email);
            it.putExtra("name",name);
            startActivity(it);
            finish();
        } else if (id == R.id.nav_schedule) {
            Intent it = new Intent(this,Agendar.class);
            it.putExtra("email",email);
            it.putExtra("name",name);
            startActivity(it);
            finish();
        } else if (id == R.id.nav_treatment) {
            Intent it = new Intent(this,Acompanhe.class);
            it.putExtra("email",email);
            it.putExtra("name",name);
            startActivity(it);
            finish();
        } else if (id == R.id.nav_jobs) {
            Intent it = new Intent(this,Servicos.class);
            it.putExtra("email",email);
            it.putExtra("name",name);
            startActivity(it);
            finish();
        } else if (id == R.id.nav_alerts){
            Intent it = new Intent(this,Lembretes.class);
            it.putExtra("email",email);
            it.putExtra("name",name);
            startActivity(it);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
