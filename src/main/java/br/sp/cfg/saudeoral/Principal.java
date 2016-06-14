package br.sp.cfg.saudeoral;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.method.LinkMovementMethod;
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

public class Principal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private String name;
    private String email;
    private TextView txtWelcome,txtNoticia1,txtNoticia2, txtVejaMais;
    private int tent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_principal);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_principal);
        navigationView.setNavigationItemSelectedListener(this);
        View headerView = navigationView.getHeaderView(0);
        TextView textoNomeHeader = (TextView) headerView.findViewById(R.id.nameHeaderPrincipal);
        TextView textoEmailHeader = (TextView) headerView.findViewById(R.id.emailHeaderPrincipal);

        txtWelcome = (TextView) findViewById(R.id.welcome);
        txtNoticia1 = (TextView) findViewById(R.id.noticia1principal);
//        txtNoticia1.setMovementMethod(LinkMovementMethod.getInstance());
        txtNoticia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Principal.this);
                alerta.setIcon(R.drawable.tooth);
                alerta.setTitle("Odonto de Luxo");
                alerta.setMessage("Cada vez mais, os dentistas querem mudar a idéia de que seus consultórios são ambientes frios e onde sentimos muita dor. Por isso, eles estão investindo em tratamentos rápidos, decoração de primeira e serviços diferenciados, como massagem e sessões de DVD\n" +
                        "Odonto de Luxo - Clínica Saúde Oral\n" +
                        "\n" +
                        "Investir na tecnologia\n" +
                        "\n" +
                        "Oferecer ao paciente um tratamento com tecnologia de ponta aliado ao conforto, qualidade e rapidez. Esse é o objetivo de vários consultórios odontológicos. No caso da Clínica Cury, a anestesia computadorizada diminui a dor causada pela convencional; a radiografi a digital minimiza em quase 90% os efeitos nocivos da radiação e as próteses são produzidas por computador na Suécia. “Aliado a tudo, contamos com uma equipe preparada para oferecer aos pacientes pequenos luxos, como chás e revistas na sala de espera, música durante o atendimento ou até mesmo o fi lme do musical preferido ou de um grande show enquanto é operado ou recebe clareamento a laser”, revela a cirurgiã-dentista Andrea Ashcar Cury (SP). Já os pacientes do cirurgião-dentista Kenji Okazaki (SP) podem verifi car, em tempo real, em uma tela de LCD o tratamento que estão fazendo. “Isso sem falar que essa microcâmera permite uma análise mais precisa”, esclarece o profissional.\n" +
                        "\n" +
                        "Os equipamentos de terceira dimensão também são uma coqueluche à parte. Os que mais se destacam são os de prototipagem e escaneamento 3D. “A primeira consiste em uma impressão tridimensional de peças ou regiões anatômicas. Por exemplo, podemos imprimir em tamanho real o crânio de um paciente ou seus dentes intra-ósseos e executar cirurgias em uma fração do tempo convencional. Já o escaneamento 3D possibilita que modelos de gesso sejam levados para o mundo virtual do computador, onde são simuladas diferentes alternativas de tratamento para, só então, escolher a melhor para cada caso”, explica o ortodontista Jorge Faber (DF).\n" +
                        "\n" +
                        "Também não podemos deixar de citar os microscópios odontológicos, que permitem a ampliação da imagem em até 24 vezes, proporcionando incisões menos invasivas e suturas com fi os extremamente delicados. “O uso desse equipamento, somado à habilidade técnica do profi ssional, dá resultados mais confi áveis a qualquer tratamento”, explica Fernando Blanco, gerente de divisão odontológica da Opto Eletronica (SP).\n" +
                        "\n" +
                        "O uso de laser no tratamento odontológico permite que os tratamentos tenham resultados instantâneos, dispensando suturas e anestesia. “O laser de CO2, por exemplo, é cirúrgico e usado em plástica gengival, implantes, aftas, gengivas pigmentadas e biópsias; o laser de Er:Yag é indicado para tecidos duros (cáries, incipientes e manchas escuras gengivais) ”, explica a implantodontista especialista em estética dental, Sandra Gontijo (RJ).\n" +
                        "\n" +
                        "Buscar o melhor acabamento\n" +
                        "\n" +
                        "Odonto de Luxo - Clínica Saúde OralA zircônia, material muito utilizado na confecção de jóias, também é usada na odontologia para a confecção de restaurações. Por ser um material altamente resistente, suporta por anos a força exercida na mastigação. “Para o resultado ficar perfeito, cobrimos a zircônia com cerâmica na cor desejada, evitando assim as desagradáveis manchas escuras ao redor da gengiva”, explica o cirurgião-dentista Daldy Marques (SP).\n" +
                        "\n" +
                        "As próteses também se beneficiaram com os avanços tecnológicos. Através do sistema Procera, é possível escanear o molde de gesso da boca do paciente e enviar a imagem pela internet para um laboratório na Suécia ou Estados Unidos, onde a prótese é confeccionada e enviada para o Brasil. “O sistema Procera é um dos mais completos e estéticos do mercado, já que utiliza materiais biocompatíveis com o organismo e alta resistência”, explica o cirurgião-dentista Victor Clavijo, da Clínica Diamond Bar (SP). Outra opção similar para a confecção de restaurações, coroas, facetas e próteses é o sistema Cad/Cam. “Obtem-se um modelo digital, que será ampliado e manipulado pelo operador, chegando-se a percepção de detalhes não-visíveis a olho nu”, explica o cirurgião-dentista Paulo Goloni (SP). Esse modelo digital é enviado, via internet, às centrais de produção, que através de outro sistema computadorizado faz o trabalho protético.\n" +
                        "\n" +
                        "Cuidar bem do sorriso é sinal de que você se preocupa com todos os detalhes ligados à sua saúde.\n" +
                        "\n" +
                        "Cuidar da saúde como um todo\n" +
                        "\n" +
                        "Não adianta nada preocupar-se somente com a técnica e se esquecer de checar como está a saúde do paciente. Afinal de contas, o bem-estar é a palavra chave para o sucesso de um tratamento. “Pedimos aos pacientes que vão fazer implantes uma bateria de exames, como raio-x , tomografia, sangue... Além disso, contamos com um médico anestesista que faz a sedação da pessoa durante a instalação dos implantes, o que a deixa muito mais tranqüila e dá mais segurança em caso de alguma complicação durante o procedimento”, explica o cirurgião-dentista Egberto França (RJ).\n" +
                        "\n" +
                        "Na clínica United Smile Center (SP), por exemplo, logo que os pacientes chegam, passam por um eletrocadiograma para saber se há algum problema cardíaco. Caso haja, ele é encaminhado para o cardiologista que indicará o tratamento adequado. “Esse passo é muito importante, principalmente porque um dos tipos de anestésico que usamos é o vasoconstritor, que fecha os vasos sanguíneos”, explica o cirurgião-dentista Aonio Genicolo Vieira. Se não houver anormalidades no exame, o próximo passo é realizar o procedimento necessário e quando o paciente acorda, o trabalho está terminado com êxito e sucesso total.\n" +
                        "\n" +
                        "O cuidado com o preparo das próteses que serão implantadas também é uma etapa que merece atenção especial. “É importante analisar formato do rosto, cor da pele e fotos dos dentes originais. O que nos interessa é a satisfação com o produto final, esteticamente falando”, explica o cirurgião-dentista Osvaldo de Souza, da Implandent (SP). “Acreditamos que um sorriso bonito influencia no bem-estar físico e psicológico do ser humano”, revela o implantodontista João Roberto Lavras, da clínica Hitomi (SP).\n" +
                        "\n" +
                        "Mas essa visão ampla do paciente não se restringe apenas nos casos de cirurgias odontológicas. Caso exista algum desequilíbrio, certamente alguma região do corpo irá arcar com as conseqüências. “Se apresentamos qualquer alteração de oclusão, isso se reflete na articulação temporomandibular (ATM), ocasionando desvios na face, dor, má postura de cabeça e coluna. Esse problema bucal afeta até mesmo nossa forma de caminhar e nos posicionar” explica a cirurgiã- dentista Glória de Fátima Ginja (SP). E a forma mais adequada para saber se esse desequilíbrio está ocorrendo, é fazer a avaliação com uma equipe multidisciplinar. “As diversas especialidades da Odontologia permitem o estudo e aplicação dos melhores métodos e técnicas”, explica o cirurgião-dentista José Jorge Silva, diretor do Centro de Implantação à Odontologia Integrada (RJ).\n" +
                        "\n" +
                        "Odonto de Luxo - Clínica Saúde OralA certeza de dentes alinhados\n" +
                        "\n" +
                        "O número de adultos que buscam a ajuda dos aparelhos ortodônticos para conquistar dentes retinhos é cada vez maior. “Esse recurso é ótimo para o alinhamento de dentes. Mas eles nunca serão corrigidos definitivamente se o paciente não se livrar dos maus hábitos orais, como posicionamento incorreto da língua, deglutição atípica e respiração bucal”, explica a cirurgiã-dentista Camila Gabriela Isaac (SP). Não é à toa que já está disponível nos consultórios o sistema trainer, método em que o paciente só usa o aparelho enquanto dorme para alinhar e (pasmem!) corrigir os maus hábitos orais. “Mas vale lembrar que essa novidade não é indicada para todos os casos”, complementa a especialista.\n" +
                        "\n" +
                        "Contar com assistência 24 horas\n" +
                        "\n" +
                        "O aumento do número de implantes realizados todos os dias faz com que complicações e situações de urgência aconteçam cada vez mais. Diante disso, o Centro Integrado de Reabilitação Oral - CI RO (SP) criou o serviço de pronto-socorro especializado em implantes. Supervisionado pelo cirurgião-dentista Paulo Kazuo Murai Jr, o local oferece tratamento de urgência para implantes dentários e operações diárias (inclusive em finais de semana e feriados). “A nossa equipe dá todo o suporte necessário para que o paciente que teve uma intercorrência com seu implante possa esperar até o horário comercial para resolver o problema definitivamente”, explica o especialista.\n" +
                        "\n" +
                        "Implante com aspecto natural\n" +
                        "\n" +
                        "Foi-se o tempo em que a gente olhava para uma pessoa e sabia identificar logo de cara se ela tinha ou não implantes. As cirurgias estão cada vez mais avançadas (o proporciona mais conforto ao paciente) e as próteses com aspectos similares ao da dentição natural. As técnicas mais utilizadas são:\n" +
                        "\n" +
                        "Carga imediata sem incisão: realizado sem cortes e sem suturas. “O procedimento é mais rápido, com menos manipulação dos tecidos, melhor pós-operatório, sem edemas ou hematomas, sem sutura”, explica o cirurgião-dentista Luis Macedo, da Clínica Takahashi, Macedo (SP). “A anestesia é simples e aplicada em pequenas quantidades. Extraímos o dente indicado com uso de instrumento chamado Periótomo, que rompe as fibras que seguram os dentes sem danificar a parede óssea ao seu redor, que auxilia na manutenção da posição gengival”, explica o cirurgiãodentista Arnaldo Takahashi. “Outra vantagem é que em muitos casos as próteses podem ser colocadas imediatamente ou após algumas horas”, diz o cirurgião-dentista Carlos Zapata (SP).\n" +
                        "\n" +
                        "Mini-implantes: também conhecidos como implantes temporários ou provisórios. “São usados para a retenção temporária de próteses, principalmente em pacientes idosos com atrofia óssea. Uma das vantagens é que pode ser colocado logo após a extração de todos os dentes e ativados imediatamente após a cirurgia, ou seja, o paciente não sai desdentado do consultório. É uma alternativa eficaz durante o período de cicatrização dos implantes definitivos e enxertos ósseos, oferecendo conforto e bem-estar para os pacientes tanto na parte funcional (mastigação) quanto estética”, cirurgiã-dentista Mara Lúcia Tarquínio Marinho (SP).\n" +
                        "\n" +
                        "Implante em 3 minutos: o implante dentário é colocado em apenas três minutos, sem cortes e suturas. “É uma cirurgia intramucosa, indicada para diabéticos, hipertensos, pessoas ansiosas e fumantes”, explica o cirurgião-dentista Eddy Guercio (SP). Com a ajuda de um equipamento específico, é feito o mapeamento da região onde será colocado o implante, para depois acontecer a perfuração no local exato e na inclinação precisa – o que permite que o dente seja colocado futuramente no eixo correto.\n" +
                        "\n" +
                        "Transplante ósseo com protótipo: em pacientes que perderam os dentes, mas não têm osso suficiente para receber implantes, é preciso realizar um transplante ósseo. Para tornar esse processo mais tranqüilo e confortável, o cirurgião-dentista Luiz Akaki Borges (SP), que utiliza material de banco de tecidos, primeiro realiza o enxerto ósseo em uma réplica exata da boca do paciente, onde modela o material, e depois faz no paciente. “Com isso o procedimento fica com tempo muito reduzido e com mais conforto.”\n" +
                        "\n" +
                        "Tornar os serviços odontológicos cada vez mais personalizados é o segredo para agradar a todos.\n" +
                        "\n" +
                        "Odonto de Luxo - Clínica Saúde OralOferecer relax mental e muscular\n" +
                        "\n" +
                        "Não é segredo para ninguém que uma consulta odontológica é uma das situações mais estressantes e que provoca muita ansiedade. Para tornar o momento mais prazeroso, o Instituto Mayer (SP) oferece a Quick Massage, massagem realizada por profissionais especializados. Para fortalecer os músculos, melhorar a coordenação, o movimento da articulação e a função mastigatória, a RM Odontologia (SP) oferece, sempre que necessário, sessões de fisioterapia oral antes e depois da aplicação dos implantes e depois da colocação das próteses. “Ela alivia dores, relaxa os músculos, corrige os movimentos mandibulares, diminui edemas e também atua no tratamento pré e pós-operatório de cirurgias odontológicas, parestesias faciais, disfunção temporomandibular e todo tipo de dores orofaciais”, explica a fisioterapeuta Beatriz Bampa Flosi (SP).\n" +
                        "\n" +
                        "Assistência em outras cidades\n" +
                        "\n" +
                        "A proximidade da Clínica Saúde Oral (SP) com o aeroporto internacional de Guarulhos facilita o tratamento odontológico dos pacientes que vem de longe – até mesmo do exterior. A equipe do cirurgião-dentista Edson Tanaka recepciona o paciente ainda no aeroporto, o acompanha até a clínica e indica hotéis na região para maior tranqüilidade durante o tratamento.\n" +
                        "\n" +
                        "Querer sempre o melhor é mais do que essencial quando o assunto é a estética do sorriso.\n" +
                        "\n" +
                        "Ficar com o sorriso de Hollywood\n" +
                        "\n" +
                        "Praticamente todas as celebridades já se submeteram às técnicas de clareamento dental. Além de deixar o visual mais bonito, dentes branquinhos passam a idéia de status e requinte. Os meios para conseguir dentes alvos são inúmeros, todos muito eficientes. Confira quais são eles:\n" +
                        "Clareamento caseiro com moldeira: quem optar por essa técnica usará uma placa com gel clareador à base de peróxido em baixa concentração, todos os dias, por 30 minutos ou mais (esse tempo varia conforme o caso). “O tratamento pode durar um dia ou um ano, dependendo de quão escuros estão os dentes da paciente. Essa técnica é empregada há 20 anos e, no Brasil, a empresa FGM, fabricante dos clareadores Whiteness, produz há 16 anos esses tipos de géis clareadores e exporta os mesmos para inúmeros países”, explica o dentista Luiz Narciso Baratieri (SC).\n" +
                        "\n" +
                        "Clareamento com moldeira no consultório: o paciente também usa uma placa com gel clareador, mas a concentração do peróxido é bem maior (algo em torno de 35% a 37%), já que há o acompanhamento do dentista. O paciente fica com a placa durante 30 minutos, em média, ao longo de duas a três sessões.\n" +
                        "\n" +
                        "BriteSmile: também realizado no consultório, pode ser feito em apenas uma hora e branqueia em média nove níveis de cor, já que o gel clareador possui pH equilibrado. “Essa técnica é indolor e atinge o maior grau de brancura em uma única sessão. Também convém destacar que o gel BriteSmile utilizado nos procedimentos contém uma quantidade muito reduzida de peróxido de hidrogênio (15%), o que garante uma segurança ainda maior dos dentes e gengivas”, explica o cirurgião-dentista José Milton Marasca (SP).\n" +
                        "\n" +
                        "Zoom: ele possibilita um resultado excelente em uma única sessão de 45 minutos. “Os diferenciais desse tratamento é que ele ocorre simultaneamente nas arcadas superior e inferior, o grau de clareamento é superior aos outros, 80% dos resultados são permanentes, não tem desgaste ou destruição dental e ocorre a redução de apenas 73% na sensibilidade”, explica o cirurgiãodentista Newton Cardoso, da New Clinic (SP).\n" +
                        "\n" +
                        "Acompanhamento via web\n" +
                        "\n" +
                        "Quando você opta por algum tratamento odontológico, é importante pesquisar a qualidade dos serviços oferecidos, instalações, profissionalismo e outras informações úteis para se certificar da idoneidade dos serviços. No site da Carmella Russo Odontologia (www.odontologiaestetica.com.br), existem fotos de tratamentos, mostrando o “antes e depois” dos pacientes, vídeos, dicas em caso de fraturas e para quem usa dentadura. “É uma forma de possibilitar ao futuro cliente a verificação virtualmente das instalações da clínica”, explica o cirurgião-dentista Amilcar Fernandes (PR).\n" +
                        "Odonto de Luxo - Clínica Saúde OralCuidar dos dentes de madrugada\n" +
                        "\n" +
                        "Quer luxo maior do que encaixar o horário do dentista na sua agenda e não ao contrário? A Clínica My Way (RJ) oferece horários alternativos (leia-se noturnos e nos finais de semana) para atender justamente o público que tem um dia corrido. A lém disso, eles também estão de portas abertas para socorrer qualquer pessoa naquelas horas mais ingratas, quando uma dor pinta de surpresa ou um dente quebra antes de uma superfesta. “Caso necessite de um atendimento odontológico de urgência, sem mesmo ter horário agendado, basta ligar e informar o que está ocorrendo. E m seguida, serão passadas as informações necessárias para que o paciente possa ser atendido o mais breve possível, na unidade mais próxima da sua casa”, explica a cirurgiã-dentista Cristiane Velasco da S ilva, diretora técnica da clínica.\n" +
                        "\n" +
                        "Lançar mão de facetas\n" +
                        "\n" +
                        "As facetas possibilitam a alteração da cor, forma, comprimento e, principalmente, posição dos dentes. Os materiais mais usados são resina e porcelana. “As primeiras são lindas, feitas no consultório, com custo menor, porém menos resistentes e requerem um cuidado na manutenção a cada seis meses. Já as de porcelana são feitas nos laboratórios, conseqüentemente com maior custo, mas a semelhança chega mais perto dos dentes naturais, os cuidados se assemelham aos dos outros dentes da boca”, explica a endodontista Maria Cristina Uroz Portela (SP).\n" +
                        "\n" +
                        "Cuidar do sorriso no spa\n" +
                        "\n" +
                        "É isso mesmo, existem os day-spas odontológicos, onde é possível passar horas prazerosas ao mesmo tempo em que cuida do sorriso. A o chegar ao S pa Odontológico, em S ão Bernardo do Campo (SP), o paciente entra em uma sala reservada com um belo e farto café-da-manhã e, em seguida, recebe uma massagem relaxante. Depois, ele passa por uma avaliação psicológica, toma uns florais para relaxar ainda mais e só então senta-se na cadeira do dentista, que tem massageadores nas costas. Enquanto o dentista faz a sua parte, o massagista continua seu trabalho nos pés do paciente, que pode escolher o que quer assistir na T V. Quando a primeira parte do tratamento está pronta, o paciente volta para sua sala reservada, almoça e descansa em um jardim de inverno com sons de pássaros e água corrente. Após o descanso, retorna ao tratamento. “É importante ressaltar que antes da internação é necessário passar por uma consulta, na qual é feita uma avaliação para detectar todos os problemas do paciente, para que os mesmo possam ser solucionados em uma média de oito horas. Mas vale lembrar que existem ainda tratamentos mais complexos que necessitam de um retorno para serem finalizados, como os casos de periodontia e de próteses”, explica o Dr. Conrado Ferreira Pinto.\n" +
                        "\n" +
                        "Ficar de olho na segurança\n" +
                        "\n" +
                        "Para comodidade e segurança dos pacientes, o I nstituto Odontológico Rita Trindade (DF) conta com um laboratório protético próprio, que funciona junto ao consultório. “Além de tornar mais ágil todas as etapas de um tratamento que envolve grande volume de próteses, o trabalho conjunto do cirurgião-dentista e do técnico em prótese dentária facilita, por exemplo, a escolha correta da cor de um dente, uma vez que o protético tem acesso direto à boca do paciente dentro do consultório”, explica a cirurgiã-dentista Rita Trindade. Assim, a estética final fica sempre melhor e com muito mais qualidade.\n" +
                        "\n" +
                        "Para diminuir o risco de contaminação durante uma cirurgia odontológica, a clínica Odontoral, de Mogi das C ruzes (SP), conta com uma sala esterilizada e separada do consultório utilizada especificamente para este tipo de procedimento. “Para dar mais segurança ao paciente, os batimentos cardíacos e a respiração são monitorados, os aparelhos são duplos, ou seja, se um falhar, há outro para substituí-lo” explica o cirurgião-dentista Gilberto José Torelli Junior.\n" +
                        "Hoje em dia, é possível cuidar dos dentes ao mesmo tempo em que se relaxa a mente.\n" +
                        "\n" +
                        "Odonto de Luxo - Clínica Saúde OralSentir-se em casa durante a espera\n" +
                        "\n" +
                        "Tornar o ambiente do consultório mais agradável e acolhedor é uma preocupação que vários profissionais têm. Para tornar a espera menos desagradável, a clínica Master I mplant (SP) disponibiliza uma estrutura acolhedora com sala com acesso à internet, televisão de LC D na sala de repouso e na de espera, livros e revistas atuais, cortina d’água com som de cachoeira, serviço de copeira e salas climatizadas com temperaturas constantes.“Todo esse cuidado é fundamental para que os pacientes se sintam a vontade e relaxados enquanto aguardam ser atendidos”, explica o cirurgião-dentista Ricardo de Oliveira.\n" +
                        "\n" +
                        "Otimizar o tempo no consultório\n" +
                        "\n" +
                        "Oferecer todos os tipos de tratamento no consultório possibilita ao paciente começar o tratamento imediatamente, ou seja, no mesmo dia da consulta inicial. “Com esse serviço, as consultas são marcadas em curto espaço de tempo e o tratamento é concluído em tempo recorde”, explica o cirurgião-dentista José Eduardo S oares (SP).\n" +
                        "\n" +
                        "Os pacientes que não têm tempo para diversas consultas ou tratamentos longos, uma ótima opção é o Day C linic. A través de um minucioso planejamento, todo o tratamento é realizado na maioria das vezes em um único dia. Dentre os tratamentos estão o de canal, implantes, clareamento a laser, troca de restaurações, cirurgias dos terceiros molares, e outros. “Claro que em alguns casos, mesmo que seja necessário um 2º Day Clinic, todo o tratamento é realizado em um tempo bem menor que o convencional”, explica o cirurgião-dentista Nelson A lves Dall’Oca (SP).\n" +
                        "\n" +
                        "No Day Clinic da Clínica Lagoa, em C ampinas (SP), é disponibilizado ao paciente e acompanhante uma suíte com quarto, sala, banheiro, cozinha, internet, T V, som e refeição. “É uma maneira de fazer a reabilitação oral em menos tempo e com muito conforto”, explica o cirurgião-dentista E duardo L agoa.\n" +
                        "\n" +
                        "Já o cirurgião-dentista Oscar Razuk (SP) desenvolveu uma metodologia do Sorriso Express. O profissional passou a atender por períodos, um paciente na parte da manhã e um na parte da tarde, adaptou todo o seu consultório de forma a funcionar sem interferências, buscou os parceiros certos para a montagem de moldes e próteses de acordo com a sua urgência e muitas vezes com a presença do profissional (técnico em prótese) em seu consultório para estudar o caso juntamente com o cliente. “Com tudo isso, a dedicação para cada caso é de quatro horas por dia e em uma semana o tratamento está finalizado”, explica o Dr. Razuk.\n" +
                        "\n" +
                        "O apurado senso de estética e o alto nível técnico dos profissionais devem caminhar juntos, em igual proporção.\n" +
                        "\n" +
                        "Estudar o sorriso milimetricamente\n" +
                        "\n" +
                        "\n" +
                        "Tem muita gente que já passou por tratamentos ortodônticos e clareamentos, mas ainda continua insatisfeita com seu sorriso. Nessas horas, é essencial que os profissionais tenham paciência para conversar com o paciente para ver o que causa essa insatisfação e saber como realizar um smile makeover, técnica multidisciplinar complexa que combina odontologia estética, laminados cerâmicos e cirurgia plástica periodontal. “O primeiro objetivo é descobrir exatamente o que falta no sorriso. Por isso analisamos tamanho, posição e forma dos dentes, assim como a sua proporção em relação à gengiva, lábios, olhos e conjunto da face”, explica o cirurgião-dentista Franco Rattichieri (SP). Só assim é possível detectar porque um determinado sorriso não agrada esteticamente e transformá-lo completamente.");
                alerta.setPositiveButton("Ok", null);
                alerta.create().show();
            }
        });
        txtNoticia2 = (TextView) findViewById(R.id.noticia2principal);
//        txtNoticia2.setMovementMethod(LinkMovementMethod.getInstance());
        txtNoticia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Principal.this);
                alerta.setIcon(R.drawable.tooth);
                alerta.setTitle("Marketing e ética na Saúde");
                alerta.setMessage("Marketing e ética na saúde. Com certeza este é o tema que mais abordei em meus artigos desde que iniciei minhas atividades nesta área em 1994. No século passado este questionamento fazia sentido porque, até então, Marketing e Saúde andavam em raias separadas e era natural que os profissionais de saúde nada soubessem sobre o tema. No entanto, voltar a abordar esta questão em pleno século XXI é, no mínimo, estranho. Por que então estou voltando ao tema, você me perguntaria? Simplesmente porque continuo recebendo e-mails de profissionais de saúde perguntando se a utilização do marketing na saúde não contraia os princípios éticos profissionais.\n" +
                        "\n" +
                        "O Marketing Aplicado a Saúde é ético porque:\n" +
                        "1)Marketing quer dizer como atender as necessidades, desejos e expectativas dos clientes de forma ética e lucrativa para você.\n" +
                        "\n" +
                        "Analisando cuidadosamente a frase acima você verá que marketing é uma ciência que traz em sua própria definição a palavra ética. Marketing é ciência? Sim! Ciência é tudo aquilo que tem relação causa e efeito. Efeito sem causa é milagre!\n" +
                        "\n" +
                        "2)Marketing é uma ciência sustentada no Ganha-Ganha.\n" +
                        "\n" +
                        "Com as aplicações do marketing na área da saúde, ganha você, ganha o cliente, ganha a sociedade, ganha a sua categoria profissional. Quem perde? Ninguém! No mundo atual, no setor de serviços, para um ganhar o outro não precisa perder. Serviço quer dizer gerenciar informações. O custo marginal da replicação da informação é zero. Isto quer dizer que se eu trocar informações com você, tanto eu como você saímos do sistema maiores do que entramos. Assim todos ganham e ninguém perde. Trocar informações é diferente de trocar produtos. Na troca de produtos, para um ganhar o outro tem que perder! A economia atual está estruturada mais na troca de informações do que na troca de produtos.\n" +
                        "Se numa relação de troca todos ganham, então é ético! Muitos profissionais de saúde ainda acham que utilizar o marketing em seus consultórios e clínicas não fica bem por uma questão de ética. Desculpe-me, mas isto chame-se ignorância!\n" +
                        "\n" +
                        "3)O Marketing Aplicado a Saúde já foi reconhecido pelas principais instituições que representam a odontologia no Brasil e em vários outros paises.\n" +
                        "\n" +
                        "\n" +
                        "Veja a programação dos congressos organizados pela SBOE, pela APCD e pela ABO no Brasil e pela OMD em Portugal. Você verá em praticamente todos estes eventos palestras e cursos de marketing. No mês de junho de 2008, marketing, gestão e valorização do dentista foi o tema principal do CIODONTO em S.Paulo. Na abertura deste congresso estavam presentes os dirigentes das instituições que representam a odontologia no Brasil e no mundo.\n" +
                        "Num congresso mundial da Academia Internacional de Odontologia Integral – AIOI, com representantes de 26 paises, eu recebi uma homenagem como sendo o pioneiro na abordagem do Marketing Aplicado a Saúde no mundo. A 1a edição do livro Marketing Aplicado a Saúde foi publicado em 1994. Este foi o primeiro livro publicado em todo o mundo abordando os benefícios do marketing para profissionais de saúde.\n" +
                        "\n" +
                        "Você já se fez estas perguntas?\n" +
                        "\n" +
                        "Você sabe se os preços que pratica no mercado são baixos ou altos? Será que o seu preço é justo para o cliente? Será que ele é justo para você? Se você tem competência técnica, então porque todos os clientes do mercado não estão com você?\n" +
                        "A questão é que o cliente está com aquele profissional que despertou nele o sentimento de respeito e confiança. A credibilidade inspirado por você é um alto valor agregado aos seus serviços. É esta credibilidade que traz os clientes para você ou os leva para outro profissional de saúde. A técnica é importante, mas o cliente nada entende de técnica. Com a técnica você adquire o direito de entrar em campo. Para vencer o jogo você tem que inspirar credibilidade. O profissional de saúde que tem credibilidade prospera. O que não tem credibilidade não prospera. O que é prosperidade? É ter bons resultados financeiros, mais qualidade de vida e prestígio social através do seu trabalho!\n" +
                        "A credibilidade é algo que tem a ver com as suas instalações, com a sua equipe, com a postura das suas auxiliares, com os preços que pratica, com a sua comunicação com os clientes e com você. A credibilidade tem a ver com a experiência vivida pelo cliente em seu consultório ou clínica na primeira consulta e durante o tratamento. Isto é marketing! Se todos os clientes não estão com você, tem alguém trabalhando as percepções do seu cliente potencial com mais eficácia que você. Isto é marketing!\n" +
                        "A conclusão que podemos tirar desta reflexão é que o marketing é uma ciência ética que deve ser utilizada pelos profissionais de saúde para otimizar os seus resultados.");
                alerta.setPositiveButton("Ok", null);
                alerta.create().show();
            }
        });
        txtVejaMais = (TextView) findViewById(R.id.vejamais);
        txtVejaMais.setMovementMethod(LinkMovementMethod.getInstance());

        tent = 1;
        Intent it = getIntent();
        name = it.getStringExtra("name");
        email = it.getStringExtra("email");

        txtWelcome.setText("Bem vindo "+name);
        textoNomeHeader.setText(name);
        textoEmailHeader.setText(email);
        txtNoticia1.setText(R.string.noticia1);
        txtNoticia2.setText(R.string.noticia2);
        txtVejaMais.setText(R.string.veja_mais);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
           /*AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setIcon(R.drawable.ic_error_black_24dp);
            alerta.setTitle("Alerta");
            alerta.setMessage("Você está saindo do Sistema, deseja continuar?");
            alerta.setPositiveButton("Sim", null);
            alerta.setNegativeButton("Não", null);
            alerta.create().show()*/
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
