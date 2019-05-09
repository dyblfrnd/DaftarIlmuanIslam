package com.example.daftarilmuanislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListIlmuanActivity extends AppCompatActivity {


String[] nama = {"Al Khawarizmi",
        "Al Zahrawi",
        "Ibnu al-Baithar",
        "Ibnu al-Nafis",
        "Ibnu Haitham",
        "Ibnu Khaldun",
        "Ibnu Sina",
        "Jabir Ibn- Hayyan",
        "Thbit ibn Qurra",
        "Umar Khayyam"};

int [] gambar = {R.drawable.alkhawarizmi,
R.drawable.alzahrawi,
R.drawable.ibnualbhaitar,
R.drawable.ibnualnafis,
R.drawable.ibnuhaitman,
R.drawable.ibnukhaldun,
R.drawable.ibnusina,
R.drawable.jabilibnhayyan,
R.drawable.thbitibnqurra,
R.drawable.umarkhayyam,};

String[] url = {"https://id.wikipedia.org/wiki/Mu%E1%B8%A5ammad_bin_M%C5%ABs%C4%81_al-Khaw%C4%81rizm%C4%AB",

        "https://id.wikipedia.org/wiki/Abu_al-Qasim_al-Zahrawi",

        "https://id.wikipedia.org/wiki/Ibnu_al-Baithar",

        "https://id.wikipedia.org/wiki/Ibnu_al-Nafis",

        "https://id.wikipedia.org/wiki/Ibnu_Haitham",

        "https://id.wikipedia.org/wiki/Ibnu_Khaldun",

        "https://id.wikipedia.org/wiki/Ibnu_Sina",

        "https://id.wikipedia.org/wiki/Abu_Musa_Jabir_bin_Hayyan",

        "https://id.wikipedia.org/wiki/Tsabit_bin_Qurrah",

        "https://id.wikipedia.org/wiki/Umar_Khayy%C4%81m"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ilmuan);
        ListView listView = findViewById(R.id.listViewIlmuan);
        CustomListViewAdapter customListViewAdapter = new CustomListViewAdapter();
        listView.setAdapter(customListViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent a = new Intent(ListIlmuanActivity.this, DetailIlmuwanActivity.class);
                a.putExtra("putNama", nama[i]);
                a.putExtra("putUrl", url[i]);
                startActivity(a);
            }
        });
    }

    class CustomListViewAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return gambar.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.costum_listview, null);

            ImageView imageView = view.findViewById(R.id.imgIlmuAN);
                    TextView textView = view.findViewById(R.id.txtIlmuan);

                    imageView.setImageResource(gambar[i]);
                    textView.setText(nama[i]);
            return view;
        }
    }
}
