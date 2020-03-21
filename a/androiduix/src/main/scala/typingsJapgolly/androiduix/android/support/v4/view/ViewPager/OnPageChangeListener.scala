package typingsJapgolly.androiduix.android.support.v4.view.ViewPager

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPageChangeListener extends js.Object {
  def onPageScrollStateChanged(state: Double): Unit
  def onPageScrolled(position: Double, positionOffset: Double, positionOffsetPixels: Double): Unit
  def onPageSelected(position: Double): Unit
}

object OnPageChangeListener {
  @scala.inline
  def apply(
    onPageScrollStateChanged: Double => Callback,
    onPageScrolled: (Double, Double, Double) => Callback,
    onPageSelected: Double => Callback
  ): OnPageChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onPageScrollStateChanged")(js.Any.fromFunction1((t0: scala.Double) => onPageScrollStateChanged(t0).runNow()))
    __obj.updateDynamic("onPageScrolled")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onPageScrolled(t0, t1, t2).runNow()))
    __obj.updateDynamic("onPageSelected")(js.Any.fromFunction1((t0: scala.Double) => onPageSelected(t0).runNow()))
    __obj.asInstanceOf[OnPageChangeListener]
  }
}

