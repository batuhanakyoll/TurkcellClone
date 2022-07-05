package com.batuhanakyol.turkcell

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.batuhanakyol.turkcell.databinding.FragmentTurkcellBinding


class TurkcellFragment : Fragment() {


    private  lateinit var tasarim : FragmentTurkcellBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentTurkcellBinding.inflate(inflater, container, false)


        tasarim.toolbarAnasayfa.title=""
        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarAnasayfa)




        tasarim.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        tasarim.rv2.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val kampanyalarListesi = ArrayList<Kampanyalar>()


        val k1 = Kampanyalar(1,"Platinum","10","bip","10 GB","2000 DK")
        val k2 = Kampanyalar(2,"Gold","5","bip","5 GB","2000 DK")
        val k3 = Kampanyalar(3,"Silver","4","bip","4 GB","2000 DK")
        val k4 = Kampanyalar(4,"Bronze","3","bip","3 GB","2000 DK")
        val k5 = Kampanyalar(5,"Aynen","16","bip","16 GB","12000 DK")
        val k6 = Kampanyalar(6,"Gnç Plat","50","bip","50 GB","2000 DK")
        val k7 = Kampanyalar(7,"Bronze111111","3","bip","3 GB","2000 DK")
        kampanyalarListesi.add(k1)
        kampanyalarListesi.add(k2)
        kampanyalarListesi.add(k3)
        kampanyalarListesi.add(k4)
        kampanyalarListesi.add(k5)
        kampanyalarListesi.add(k6)
        kampanyalarListesi.add(k7)

        val adapter = KampanyalarAdapter(requireContext(),kampanyalarListesi)
        tasarim.rv.adapter= adapter

        tasarim.rv2.adapter=adapter



        return tasarim.root
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menuu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

            }

