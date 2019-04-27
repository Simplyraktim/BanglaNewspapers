package com.das.raktim.banglanewspapers;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener {
    Button ButtonTribune, Buttonbnews, ButtonPalo, ButtonBbc, ButtonBDnews, ButtonDailystar, ButtonBprotidin,
            ButtonBDlive, ButtonAmrdesh, ButtonKalerk, ButtonIttefaq, ButtonJugantor, ButtonJagonewes, ButtonAmadersomoy,
            ButtonVorerkagoj, ButtonJayjaydin, ButtonSomokal, ButtonKorotoa, ButtonNoyadigonto, ButtonPoribarton,
            ButtonAjkerbar, ButtonAlokito, ButtonBmail, ButtonBonik, ButtonPriyo, ButtonSongbad, ButtonSupro,
            ButtonSun, ButtonDhakatime, ButtonNewage, ButtonNewstoday, ButtonObsrvr, ButtonDhakatribune, ButtonBdtoday,
            ButtonIndepen, ButtonDailys;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_main, container, false);
        ButtonTribune = (Button) v.findViewById(R.id.button);
        Buttonbnews = (Button) v.findViewById(R.id.button2);
        ButtonPalo = (Button) v.findViewById(R.id.button3);
        ButtonBbc = (Button) v.findViewById(R.id.button4);
        ButtonBDnews = (Button) v.findViewById(R.id.button5);
        ButtonDailystar = (Button) v.findViewById(R.id.button6);
        ButtonBprotidin = (Button) v.findViewById(R.id.button7);
        ButtonBDlive = (Button) v.findViewById(R.id.button8);
        ButtonAmrdesh = (Button) v.findViewById(R.id.button9);
        ButtonKalerk = (Button) v.findViewById(R.id.button10);
        ButtonIttefaq = (Button) v.findViewById(R.id.button11);
        ButtonJugantor = (Button) v.findViewById(R.id.button12);
        ButtonJagonewes = (Button) v.findViewById(R.id.button13);
        ButtonAmadersomoy = (Button) v.findViewById(R.id.button14);
        ButtonVorerkagoj = (Button) v.findViewById(R.id.button15);
        ButtonJayjaydin = (Button) v.findViewById(R.id.button16);
        ButtonSomokal = (Button) v.findViewById(R.id.button17);
        ButtonKorotoa = (Button) v.findViewById(R.id.button18);
        ButtonNoyadigonto = (Button) v.findViewById(R.id.button19);
        ButtonPoribarton = (Button) v.findViewById(R.id.button20);
        ButtonAjkerbar = (Button) v.findViewById(R.id.button21);
        ButtonAlokito = (Button) v.findViewById(R.id.button22);
        ButtonBmail = (Button) v.findViewById(R.id.button23);
        ButtonBonik = (Button) v.findViewById(R.id.button24);
        ButtonPriyo = (Button) v.findViewById(R.id.button25);
        ButtonSongbad = (Button) v.findViewById(R.id.button26);
        ButtonSupro = (Button) v.findViewById(R.id.button27);
        ButtonSun  = (Button) v.findViewById(R.id.button28);
        ButtonDhakatime  = (Button) v.findViewById(R.id.button29);
        ButtonNewage  = (Button) v.findViewById(R.id.button30);
        ButtonNewstoday  = (Button) v.findViewById(R.id.button31);
        ButtonObsrvr  = (Button) v.findViewById(R.id.button32);
        ButtonDhakatribune  = (Button) v.findViewById(R.id.button33);
        ButtonBdtoday  = (Button) v.findViewById(R.id.button34);
        ButtonIndepen = (Button) v.findViewById(R.id.button35);
        ButtonDailys  = (Button) v.findViewById(R.id.button36);

        ButtonTribune.setOnClickListener(this);
        Buttonbnews.setOnClickListener(this);
        ButtonPalo.setOnClickListener(this);
        ButtonBbc.setOnClickListener(this);
        ButtonBDnews.setOnClickListener(this);
        ButtonDailystar.setOnClickListener(this);
        ButtonBprotidin.setOnClickListener(this);
        ButtonBDlive.setOnClickListener(this);
        ButtonAmrdesh.setOnClickListener(this);
        ButtonKalerk.setOnClickListener(this);
        ButtonIttefaq.setOnClickListener(this);
        ButtonJugantor.setOnClickListener(this);
        ButtonJagonewes.setOnClickListener(this);
        ButtonAmadersomoy.setOnClickListener(this);
        ButtonVorerkagoj.setOnClickListener(this);
        ButtonJayjaydin.setOnClickListener(this);
        ButtonSomokal.setOnClickListener(this);
        ButtonKorotoa.setOnClickListener(this);
        ButtonNoyadigonto.setOnClickListener(this);
        ButtonPoribarton.setOnClickListener(this);
        ButtonAjkerbar.setOnClickListener(this);
        ButtonAlokito.setOnClickListener(this);
        ButtonBmail.setOnClickListener(this);
        ButtonBonik.setOnClickListener(this);
        ButtonPriyo.setOnClickListener(this);
        ButtonSongbad.setOnClickListener(this);
        ButtonSupro.setOnClickListener(this);
        ButtonSun.setOnClickListener(this);
        ButtonDhakatime.setOnClickListener(this);
        ButtonNewage.setOnClickListener(this);
        ButtonNewstoday.setOnClickListener(this);
        ButtonObsrvr.setOnClickListener(this);
        ButtonDhakatribune.setOnClickListener(this);
        ButtonBdtoday.setOnClickListener(this);
        ButtonIndepen.setOnClickListener(this);
        ButtonDailys.setOnClickListener(this);




        return v;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
                Intent tribuneIntent = new Intent(getActivity(), BlankFragment.class);
                tribuneIntent.putExtra("LINK", "http://www.banglatribune.com/");
                startActivity(tribuneIntent);
                break;
            case R.id.button2:
                Intent bnewsIntent= new Intent(getActivity(), BlankFragment.class);
                bnewsIntent.putExtra("LINK", "http://www.banglanews24.com/");
                startActivity(bnewsIntent);
                break;

            case R.id.button3:
                Intent paloIntent= new Intent(getActivity(), BlankFragment.class);
                paloIntent.putExtra("LINK", "http://www.prothom-alo.com/");
                startActivity(paloIntent);
                break;

            case R.id.button4:
                Intent bbcIntent= new Intent(getActivity(), BlankFragment.class);
                bbcIntent.putExtra("LINK", "https://www.bbc.com/bengali/");
                startActivity(bbcIntent);
                break;

            case R.id.button5:
                Intent bdnewsIntent= new Intent(getActivity(), BlankFragment.class);
                bdnewsIntent.putExtra("LINK", "https://bangla.bdnews24.com/");
                startActivity(bdnewsIntent);
                break;
            case R.id.button6:
                Intent dstarIntent= new Intent(getActivity(), BlankFragment.class);
                dstarIntent.putExtra("LINK", "http://www.thedailystar.net/bangla/");
                startActivity(dstarIntent);
                break;
            case R.id.button7:
                Intent bproIntent= new Intent(getActivity(), BlankFragment.class);
                bproIntent.putExtra("LINK", "http://www.bd-pratidin.com/");
                startActivity(bproIntent);
                break;
            case R.id.button8:
                Intent bdliveIntent= new Intent(getActivity(), BlankFragment.class);
                bdliveIntent.putExtra("LINK", "http://www.bdlive24.com/");
                startActivity(bdliveIntent);
                break;
            case R.id.button9:
                Intent amardIntent= new Intent(getActivity(), BlankFragment.class);
                amardIntent.putExtra("LINK", "http://amar-desh24.com/bangla/");
                startActivity(amardIntent);
                break;
            case R.id.button10:
                Intent kalerkIntent= new Intent(getActivity(), BlankFragment.class);
                kalerkIntent.putExtra("LINK", "http://www.kalerkantho.com/");
                startActivity(kalerkIntent);
                break;
            case R.id.button11:
                Intent ittefaqIntent= new Intent(getActivity(), BlankFragment.class);
                ittefaqIntent.putExtra("LINK", "https://www.ittefaq.com.bd/");
                startActivity(ittefaqIntent);
                break;
            case R.id.button12:
                Intent jugantorIntent= new Intent(getActivity(), BlankFragment.class);
                jugantorIntent.putExtra("LINK", "https://www.jugantor.com/");
                startActivity(jugantorIntent);
                break;
            case R.id.button13:
                Intent jagoIntent= new Intent(getActivity(), BlankFragment.class);
                jagoIntent.putExtra("LINK", "https://www.jagonews24.com/");
                startActivity(jagoIntent);
                break;
            case R.id.button14:
                Intent amadersIntent= new Intent(getActivity(), BlankFragment.class);
                amadersIntent.putExtra("LINK", "https://www.dainikamadershomoy.com/");
                startActivity(amadersIntent);
                break;
            case R.id.button15:
                Intent vorerkIntent= new Intent(getActivity(), BlankFragment.class);
                vorerkIntent.putExtra("LINK", "https://www.bhorerkagoj.net/");
                startActivity(vorerkIntent);
                break;
            case R.id.button16:
                Intent jayjayIntent= new Intent(getActivity(), BlankFragment.class);
                jayjayIntent.putExtra("LINK", "https://www.jaijaidinbd.com/");
                startActivity(jayjayIntent);
                break;
            case R.id.button17:
                Intent somokalIntent= new Intent(getActivity(), BlankFragment.class);
                somokalIntent.putExtra("LINK", "http://www.samakal.com/");
                startActivity(somokalIntent);
                break;
            case R.id.button18:
                Intent korotoaIntent= new Intent(getActivity(), BlankFragment.class);
                korotoaIntent.putExtra("LINK", "https://www.karatoa.com.bd/");
                startActivity(korotoaIntent);
                break;
            case R.id.button19:
                Intent noyadIntent= new Intent(getActivity(), BlankFragment.class);
                noyadIntent.putExtra("LINK", "http://www.dailynayadiganta.com/");
                startActivity(noyadIntent);
                break;
            case R.id.button20:
                Intent poriIntent= new Intent(getActivity(), BlankFragment.class);
                poriIntent.putExtra("LINK", "http://www.poriborton.com/");
                startActivity(poriIntent);
                break;
            case R.id.button21:
                Intent ajkerIntent = new Intent(getActivity(), BlankFragment.class);
                ajkerIntent.putExtra("LINK", "http://www.ajkerbarta.com/");
                startActivity(ajkerIntent);
                break;
            case R.id.button22:
                Intent alokIntent= new Intent(getActivity(), BlankFragment.class);
                alokIntent.putExtra("LINK", "http://www.alokitobangladesh.com/");
                startActivity(alokIntent);
                break;

            case R.id.button23:
                Intent bmailIntent= new Intent(getActivity(), BlankFragment.class);
                bmailIntent.putExtra("LINK", "http://banglamail71.info/");
                startActivity(bmailIntent);
                break;

            case R.id.button24:
                Intent bonikIntent= new Intent(getActivity(), BlankFragment.class);
                bonikIntent.putExtra("LINK", "http://bonikbarta.net/bangla/");
                startActivity(bonikIntent);
                break;

            case R.id.button25:
                Intent prioIntent= new Intent(getActivity(), BlankFragment.class);
                prioIntent.putExtra("LINK", "https://www.priyo.com/");
                startActivity(prioIntent);
                break;
            case R.id.button26:
                Intent songbadIntent= new Intent(getActivity(), BlankFragment.class);
                songbadIntent.putExtra("LINK", "http://www.sangbadpratidin.in/");
                startActivity(songbadIntent);
                break;
            case R.id.button27:
                Intent suproIntent= new Intent(getActivity(), BlankFragment.class);
                suproIntent.putExtra("LINK", "http://suprobhat.com/");
                startActivity(suproIntent);
                break;
            case R.id.button28:
                Intent dsunIntent= new Intent(getActivity(), BlankFragment.class);
                dsunIntent.putExtra("LINK", "http://www.daily-sun.com/");
                startActivity(dsunIntent);
                break;
            case R.id.button29:
                Intent dtimeIntent= new Intent(getActivity(), BlankFragment.class);
                dtimeIntent.putExtra("LINK", "http://www.dhakatimes24.com/");
                startActivity(dtimeIntent);
                break;
            case R.id.button30:
                Intent newageIntent= new Intent(getActivity(), BlankFragment.class);
                newageIntent.putExtra("LINK", "http://newagebd.net/");
                startActivity(newageIntent);
                break;
            case R.id.button31:
                Intent newstodayIntent= new Intent(getActivity(), BlankFragment.class);
                newstodayIntent.putExtra("LINK", "http://www.newstoday.com.bd/");
                startActivity(newstodayIntent);
                break;
            case R.id.button32:
                Intent dailyobsrvrIntent= new Intent(getActivity(), BlankFragment.class);
                dailyobsrvrIntent.putExtra("LINK", "http://www.observerbd.com/");
                startActivity(dailyobsrvrIntent);
                break;
            case R.id.button33:
                Intent dhakatribuneIntent= new Intent(getActivity(), BlankFragment.class);
                dhakatribuneIntent.putExtra("LINK", "http://www.dhakatribune.com/");
                startActivity(dhakatribuneIntent);
                break;
            case R.id.button34:
                Intent bdtodayIntent= new Intent(getActivity(), BlankFragment.class);
                bdtodayIntent.putExtra("LINK", "http://thebangladeshtoday.com/");
                startActivity(bdtodayIntent);
                break;

            case R.id.button35:
                Intent indepenIntent= new Intent(getActivity(), BlankFragment.class);
                indepenIntent.putExtra("LINK", "http://www.theindependentbd.com/");
                startActivity(indepenIntent);
                break;
            case R.id.button36:
                Intent dailysIntent= new Intent(getActivity(), BlankFragment.class);
                dailysIntent.putExtra("LINK", "http://www.thedailystar.net/");
                startActivity(dailysIntent);
                break;








        }
    }
}
