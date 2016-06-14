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

public class Servicos extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private String name,email;
    private int tent = 0;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_servicos);
        setSupportActionBar(toolbar);


        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        final NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_servicos);
        navigationView.setNavigationItemSelectedListener(this);
        final View headerView = navigationView.getHeaderView(0);
        TextView textoNomeHeader = (TextView) headerView.findViewById(R.id.nameHeaderServicos);
        TextView textoEmailHeader = (TextView) headerView.findViewById(R.id.emailHeaderServicos);
        TextView servicos1= (TextView) findViewById(R.id.noticia1servicos);
        TextView servicos2= (TextView) findViewById(R.id.noticia2servicos);
        TextView servicos3= (TextView) findViewById(R.id.noticia3servicos);
        TextView servicos4= (TextView) findViewById(R.id.noticia4servicos);

        servicos1.setText(R.string.servicos1);
        servicos2.setText(R.string.servicos2);
        servicos3.setText(R.string.servicos3);
        servicos4.setText(R.string.servicos4);
        final View content = findViewById(R.id.servicos2);

        TextView txtNoticia1 = (TextView) content.findViewById(R.id.noticia1servicos);
        txtNoticia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Servicos.this);
                alerta.setIcon(R.drawable.tooth);
                alerta.setTitle("Implantodontia");
                alerta.setMessage("É a especialidade da odontologia que visa restabelecer a função e estética nos casos de perdas dentárias. \n" +
                        "\n" +
                        "O implante dentário apresenta muitas vantagens, comparado às próteses convencionais, fixas ou removíveis, pois não se apóia em dentes evitando o desgaste dos mesmos. É sem dúvida uma solução eficiente, com resultado duradouro e estético. \n" +
                        "\n" +
                        "Um pino de titânio é colocado no lugar do dente, e fará o papel da raiz do mesmo. Após período chamado de osseointegração, a prótese é instalada, com dentes de mesma forma e coloração que os naturais. ");
                alerta.setPositiveButton("Ok", null);
                alerta.create().show();
            }
        });
        TextView txtNoticia2 = (TextView) content.findViewById(R.id.noticia2servicos);
        txtNoticia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Servicos.this);
                alerta.setIcon(R.drawable.tooth);
                alerta.setTitle("Ortodontia");
                alerta.setMessage("É uma especialidade odontológica que diagnostica, previne e corrige a posição dos dentes e dos ossos maxilares posicionados de forma inadequada. Dentes tortos ou dentes que não se encaixam corretamente são difíceis de serem mantidos limpos, podendo ser precocemente perdidos, decorrente da deterioração e da doença periodontal. \n" +
                        "\n" +
                        "A ortodontia pode ser dividida em ortodontia fixa (com braquetes e bandas coladas aos dentes) e removível (aparelhos removíveis). No adulto, quando as bases ósseas estão muito discrepantes, indica-se a cirurgia ortognática. Na criança em desenvolvimento estas discrepâncias podem ser tratadas com aparelhos fixos e em alguns casos com aparelhos ortopédicos.\n");
                alerta.setPositiveButton("Ok", null);
                alerta.create().show();
            }
        });
        TextView txtNoticia3 = (TextView) content.findViewById(R.id.noticia3servicos);
        txtNoticia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Servicos.this);
                alerta.setIcon(R.drawable.tooth);
                alerta.setTitle("Estética");
                alerta.setMessage("É o ramo da odontologia que atua na área da cosmética e restauração dental. Entre outros serviços, os profissionais desta especialidade realizam clareamentos dos dentes, uso de resinas , estética gengival, facetas e restaurações estéticas. \n" +
                        "\n" +
                        "O seu principal foco é a estética, porém a restauração de dentes também é uma medida importante para a saúde, já que a permanência de cáries pode causar problemas a vários níveis, além de criar problemas na mastigação dos alimentos. \n" +
                        "\n" +
                        "Através da Odontologia Estética é possível criar e promover um visual mais bonito e harmônico dos sorrisos das pessoas, além de cuidar da saúde bucal do paciente no sentido de melhorar a aparência do sorriso e, consequentemente, o bem estar dos pacientes. \n" +
                        "\n" +
                        "Para todos que estão em busca do \"sorriso de novela\" a ODONTOLOGIA ESTÉTICA vem auxiliar, resgatando a autoestima, evitando constrangimentos sociais e profissionais, mais que isso recupera a saúde bucal proporcionando mais saúde. \n");
                alerta.setPositiveButton("Ok", null);
                alerta.create().show();
            }
        });
        TextView txtNoticia4 = (TextView) content.findViewById(R.id.noticia4servicos);
        txtNoticia4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Servicos.this);
                alerta.setIcon(R.drawable.tooth);
                alerta.setTitle("Clareamento");
                alerta.setMessage("Os dentes podem ficar escurecidos por uma série de fatores como uso prolongado de antibióticos, fumo, tratamento de canal, fluorose e consumo de café, vinho tinto, coca-cola ou chocolate. Clareamento dental é um processo no qual manchas do dente são clareadas. \n" +
                        "\n" +
                        "As moléculas do GEL CLAREADOR (peróxido de hidrogênio ou peróxido de carbamida) se quebram e o oxigênio penetra no esmalte e na dentina, clareando as manchas. Pode ser realizado em consultório com auxilio de LED ou doméstico. O tempo de clareamento varia de acordo com a coloração dos dentes do paciente. Na média, com o CLAREAMENTO A LED, o resultado pode ser obtido em apenas uma ou duas sessões de 30 minutos. Com o CLAREAMENTO DOMÉSTICO o resultado aparece gradativamente usando-se o produto confortavelmente em casa. Normalmente em torno de 15 a 20 dias o resultado desejado é alcançado.");
                alerta.setPositiveButton("Ok", null);
                alerta.create().show();
            }
        });

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
