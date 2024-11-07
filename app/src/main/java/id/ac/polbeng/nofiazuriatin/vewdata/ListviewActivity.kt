package id.ac.polbeng.nofiazuriatin.vewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import id.ac.polbeng.nofiazuriatin.vewdata.databinding.ActivityListviewBinding
import java.util.Arrays

class ListviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var dataArrays: Array<String> = resources.getStringArray(R.array.jurusan)
        Arrays.sort (dataArrays)
         var  adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, dataArrays)
        binding.listView.adapter =adapter
        }
    }
