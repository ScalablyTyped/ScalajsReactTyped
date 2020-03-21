package typingsJapgolly.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScaleChangeListener extends js.Object {
  def onScaleChange(scaleFactor: Double, focusX: Double, focusY: Double): Unit
}

object OnScaleChangeListener {
  @scala.inline
  def apply(onScaleChange: (Double, Double, Double) => Callback): OnScaleChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onScaleChange")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onScaleChange(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OnScaleChangeListener]
  }
}

