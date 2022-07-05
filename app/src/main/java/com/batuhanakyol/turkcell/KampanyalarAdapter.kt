package com.batuhanakyol.turkcell

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.batuhanakyol.turkcell.databinding.CardViewBinding

class KampanyalarAdapter(var mContext : Context , var kampanyalarListesi:List<Kampanyalar> ,)
    : RecyclerView.Adapter<KampanyalarAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(tasarim:CardViewBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim : CardViewBinding
        init {
              this.tasarim= tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardViewBinding.inflate(layoutInflater,parent,false)
        return  CardTasarimTutucu(tasarim)
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kampanyalar = kampanyalarListesi.get(position)
        val t = holder.tasarim


        if (position == 0){

            t.cardviewRenk.setCardBackgroundColor(Color.RED)
        }

         else if (position == 1){
            t.cardviewRenk.setCardBackgroundColor(Color.YELLOW)
        }

        else if (position == 2){
            t.cardviewRenk.setCardBackgroundColor(Color.BLUE)
        }
        else if (position == 4){
            t.cardviewRenk.setCardBackgroundColor(Color.MAGENTA)
        }

        t.imageViewKampanyaIcon.setImageResource(R.drawable.bip_32x32)
        t.imageViewKampanyaIcon2.setImageResource(R.drawable.fizy_32x32)
        t.imageViewKampanyaIcon3.setImageResource(R.drawable.person_32x32)
        t.imageViewKampanyaIcon4.setImageResource(R.drawable.gnc_32x32)
        t.textViewKampanyaAd.text = kampanyalar.kampanyaAdı
        t.textViewKampanyaAd2.text = kampanyalar.kampanyaAdı2
        t.textViewInternet.text = kampanyalar.kampanyaInt.toString()
        t.textViewDakika.text = kampanyalar.kampanyaDakika.toString()




    }

    override fun getItemCount(): Int {
        return kampanyalarListesi.size
    }


}