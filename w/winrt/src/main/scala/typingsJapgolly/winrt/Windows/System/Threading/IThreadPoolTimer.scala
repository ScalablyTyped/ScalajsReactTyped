package typingsJapgolly.winrt.Windows.System.Threading

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThreadPoolTimer extends js.Object {
  var delay: Double
  var period: Double
  def cancel(): Unit
}

object IThreadPoolTimer {
  @scala.inline
  def apply(cancel: Callback, delay: Double, period: Double): IThreadPoolTimer = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[IThreadPoolTimer]
  }
}

