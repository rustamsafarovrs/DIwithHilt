package tj.rs.devteam.diwithhilt

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {

    val var1 = MutableLiveData<String>()

    init {
        Log.d("TAG", "result: ${mainRepository.var1}")
        var1.postValue(mainRepository.var1)
    }

}