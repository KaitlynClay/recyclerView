package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Adapters.MyAdapter
import com.example.recyclerview.Models.MyModel

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,
                            LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        arrayList = setupData()
        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter
    }

    private fun setupData(): ArrayList<MyModel> {
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.canoesonbeach, "Canoes on a Beach"))
        items.add(MyModel(R.drawable.caswellview, "House in the Country"))
        items.add(MyModel(R.drawable.cloverblossom, "Clover Blossom"))
        items.add(MyModel(R.drawable.cody_cemetery, "Dog in a cemetery"))
        items.add(MyModel(R.drawable.codywcorn, "Dog in corn leaves"))
        items.add(MyModel(R.drawable.coons, "Baby coons in flowerbed"))
        items.add(MyModel(R.drawable.cruiser, "Horse on cement lot"))
        items.add(MyModel(R.drawable.cruisernphoenix, "Horses eating grass near a building"))
        items.add(MyModel(R.drawable.dad_combine, "Combine in field"))
        items.add(MyModel(R.drawable.firstblanket, "Crochet afgan on couch"))
        items.add(MyModel(R.drawable.flordia_wetlands, "Florida everglades"))
        items.add(MyModel(R.drawable.guysworking, "Tractors in a field"))
        items.add(MyModel(R.drawable.huskingmainbelt, "Husking seed corn"))
        items.add(MyModel(R.drawable.jazzfield, "Foal in a pasture"))
        items.add(MyModel(R.drawable.me_n_tiny, "Calf and girl silhouette"))
        items.add(MyModel(R.drawable.monarch, "Monarch butterfly"))
        items.add(MyModel(R.drawable.rasberryvariations, "Homegrown raspberry goodies"))
        items.add(MyModel(R.drawable.shantih_porchswing_2022, "Dog and owner on a porch swing"))
        items.add(MyModel(R.drawable.shantihcurvedtail, "Puppy in the grass"))
        items.add(MyModel(R.drawable.shantihsnow, "Excited dog in snow"))
        items.add(MyModel(R.drawable.tiny, "Red angus calf"))
        items.add(MyModel(R.drawable.warpony, "War pony Diamond Art"))
        items.add(MyModel(R.drawable.wheat, "Wheat heads"))
        items.add(MyModel(R.drawable.wheelergrandmas, "4-wheeler next to corn field"))
        items.add(MyModel(R.drawable.winter_birds, "Birds in winter"))


        return items
    }

}