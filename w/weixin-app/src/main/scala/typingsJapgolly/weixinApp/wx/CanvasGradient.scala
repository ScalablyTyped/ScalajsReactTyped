package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasGradient extends js.Object {
  def addColorStop(index: Double, color: String): Unit
}

object CanvasGradient {
  @scala.inline
  def apply(addColorStop: (Double, String) => Callback): CanvasGradient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addColorStop")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => addColorStop(t0, t1).runNow()))
    __obj.asInstanceOf[CanvasGradient]
  }
}

