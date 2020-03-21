package typingsJapgolly.androiduix.android.text.TextUtils

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsizeCallback extends js.Object {
  def ellipsized(start: Double, end: Double): Unit
}

object EllipsizeCallback {
  @scala.inline
  def apply(ellipsized: (Double, Double) => Callback): EllipsizeCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ellipsized")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => ellipsized(t0, t1).runNow()))
    __obj.asInstanceOf[EllipsizeCallback]
  }
}

