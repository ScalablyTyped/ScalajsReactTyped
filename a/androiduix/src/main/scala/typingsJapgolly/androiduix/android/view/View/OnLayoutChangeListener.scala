package typingsJapgolly.androiduix.android.view.View

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnLayoutChangeListener extends js.Object {
  def onLayoutChange(
    v: typingsJapgolly.androiduix.android.view.View,
    left: Double,
    top: Double,
    right: Double,
    bottom: Double,
    oldLeft: Double,
    oldTop: Double,
    oldRight: Double,
    oldBottom: Double
  ): Unit
}

object OnLayoutChangeListener {
  @scala.inline
  def apply(
    onLayoutChange: (typingsJapgolly.androiduix.android.view.View, Double, Double, Double, Double, Double, Double, Double, Double) => Callback
  ): OnLayoutChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onLayoutChange")(js.Any.fromFunction9((t0: typingsJapgolly.androiduix.android.view.View, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double, t6: scala.Double, t7: scala.Double, t8: scala.Double) => onLayoutChange(t0, t1, t2, t3, t4, t5, t6, t7, t8).runNow()))
    __obj.asInstanceOf[OnLayoutChangeListener]
  }
}

