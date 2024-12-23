package thesmartshopper.shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import thesmartshopper.R
import thesmartshopper.recycler.cheapestShop
import thesmartshopper.recycler.nearestShop

class NearestShopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nearest_shop)

        val shopNearestName : TextView = findViewById(R.id.nearest_shop_name)
        val shopNearestAddress : TextView = findViewById(R.id.nearest_shop_address)
        val shopNearestDistance : TextView = findViewById(R.id.nearest_shop_distance)

        shopNearestName.text = nearestShop.getName()
        shopNearestAddress.text = nearestShop.getAddress()
        shopNearestDistance.text = nearestShop.getDistance().toString()
    }
}