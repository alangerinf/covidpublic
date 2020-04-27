package worldwide.alger.covid;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MyViewModel extends ViewModel {

    private MutableLiveData<String> seconds;

    public LiveData<String> getCounter() {
        if (seconds == null) {
            seconds = new MutableLiveData<String>();
        }
        return seconds;
    }

    public void setSeconds(String text){
        seconds.setValue(text);
    }

    public void postSeconds(String text){
        seconds.postValue(text);
    }
}
