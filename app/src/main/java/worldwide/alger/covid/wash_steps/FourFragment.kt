package worldwide.alger.covid.wash_steps

import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_four.*
import worldwide.alger.covid.MainActivity
import worldwide.alger.covid.R

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class FourFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    val animator = ValueAnimator.ofFloat(0.65f, 0.7f).setDuration(MainActivity.duracion.get(3).toLong())
    @SuppressLint("WrongConstant")
    private fun startAnimation() {
        animator.addUpdateListener { valueAnimator ->
            lottie.progress = valueAnimator.animatedValue as Float
        }
        animator.start()
    }
    override fun onResume() {
        super.onResume()
        startAnimation()
        val activity = activity as MainActivity
        activity.setPos(4)
    }
    override fun onPause() {
        super.onPause()
        animator.pause()
    }
}
