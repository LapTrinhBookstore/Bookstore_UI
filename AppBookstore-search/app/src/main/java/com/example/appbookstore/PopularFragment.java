package com.example.appbookstore;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class PopularFragment extends Fragment {

    ListView lvThinhHanh;
    ArrayList<Book> listBanChay;
    ArrayList<Book> listMienPhi;
    BookAdapter adapterBC;
    BookAdapterMp adapterMP;

    private TextView txtBanChay;
    private TextView txtMienPhi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_popular, container, false);
        lvThinhHanh = (ListView) view.findViewById(R.id.listviewThinhHanh);
        danhSachBanChay();
        danhSachMienPhi();
        adapterBC = new BookAdapter(getActivity(), R.layout.dong_sach, listBanChay);
        lvThinhHanh.setAdapter(adapterBC);

        adapterMP = new BookAdapterMp(getActivity(), R.layout.dong_sach, listMienPhi);

        txtBanChay = (TextView) view.findViewById(R.id.textViewBanChay);
        txtBanChay.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                    lvThinhHanh.setAdapter(adapterBC);
                    txtBanChay.setTextColor(R.color.c_btn);
                    txtMienPhi.setTextColor(R.color.black);
            }
        });

        txtMienPhi = (TextView) view.findViewById(R.id.textViewMienPhi);
        txtMienPhi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                lvThinhHanh.setAdapter(adapterMP);
                txtMienPhi.setTextColor(R.color.c_btn);
                txtBanChay.setTextColor(R.color.black);
            }
        });

        lvThinhHanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), layout_Detail1.class);
                startActivity(intent);
            }
        });
        return view;
    }

    private void danhSachMienPhi() {
        listMienPhi = new ArrayList<>();
        listMienPhi.add(new Book(1, "?????c Nh??n T??m",
                R.drawable.th10, "Dale Carnegie", "631 N", 57000));
        listMienPhi.add(new Book(2, "?????u T?? Ch???ng Kho??n C?? B???n",
                R.drawable.th9, "LAM HUYNH", "47 N", 29000));
        listMienPhi.add(new Book(3, "S???c M???nh C???a Ng??n T???",
                R.drawable.th8, "Don Gabor", "79 N", 59760));
        listMienPhi.add(new Book(4, "??u???i Qu???",
                R.drawable.th7, "Ph???m Ng???c Anh", "5 N", 74700));
        listMienPhi.add(new Book(5, "V?? tr???: Xa h??n M??y Oort",
                R.drawable.th6, "?????ng V?? Tu???n S??n", "6 N", 56440));
        listMienPhi.add(new Book(6, "T???o d???ng cu???c s???ng ?? ngh??a",
                R.drawable.th1, "Alex Nguyen", "128 N", 39000));
        listMienPhi.add(new Book(7, "T??? H???c K??? M??n ?????n Gi??p - Binh Ph??p",
                R.drawable.th2, "Nguy???n Th??nh Ph????ng", "12 N", 217600));
        listMienPhi.add(new Book(8, "T??? H???c K??? M??n ?????n Gi??p - Ph??n t??ch ?????u t?? kinh doanh",
                R.drawable.th3, "Nguy???n Th??nh Ph????ng", "43 N", 292400));
        listMienPhi.add(new Book(9, "C???m Nang Phong Th???y Chi??m Tinh 12 Con Gi??p n??m Nh??m D???n 2022",
                R.drawable.th4, "Nguy???n Th??nh Ph????ng", "12 N", 141750));
        listMienPhi.add(new Book(10, "Ngh?? Gi??u v?? L??m Gi??u",
                R.drawable.th5, "Napoleon Hill", "97 N", 68475));
    }

    private void danhSachBanChay() {
        listBanChay = new ArrayList<>();
        listBanChay.add(new Book(1, "T???o d???ng cu???c s???ng ?? ngh??a",
                R.drawable.th1, "Alex Nguyen", "128 N", 39000));
        listBanChay.add(new Book(2, "T??? H???c K??? M??n ?????n Gi??p - Binh Ph??p",
                R.drawable.th2, "Nguy???n Th??nh Ph????ng", "12 N", 217600));
        listBanChay.add(new Book(3, "T??? H???c K??? M??n ?????n Gi??p - Ph??n t??ch ?????u t?? kinh doanh",
                R.drawable.th3, "Nguy???n Th??nh Ph????ng", "43 N", 292400));
        listBanChay.add(new Book(4, "C???m Nang Phong Th???y Chi??m Tinh 12 Con Gi??p n??m Nh??m D???n 2022",
                R.drawable.th4, "Nguy???n Th??nh Ph????ng", "12 N", 141750));
        listBanChay.add(new Book(5, "Ngh?? Gi??u v?? L??m Gi??u",
                R.drawable.th5, "Napoleon Hill", "97 N", 68475));
        listBanChay.add(new Book(6, "V?? tr???: Xa h??n M??y Oort",
                R.drawable.th6, "?????ng V?? Tu???n S??n", "6 N", 56440));
        listBanChay.add(new Book(7, "??u???i Qu???",
                R.drawable.th7, "Ph???m Ng???c Anh", "5 N", 74700));
        listBanChay.add(new Book(8, "S???c M???nh C???a Ng??n T???",
                R.drawable.th8, "Don Gabor", "79 N", 59760));
        listBanChay.add(new Book(9, "?????u T?? Ch???ng Kho??n C?? B???n",
                R.drawable.th9, "LAM HUYNH", "47 N", 29000));
        listBanChay.add(new Book(10, "?????c Nh??n T??m",
                R.drawable.th10, "Dale Carnegie", "631 N", 57000));
    }
}