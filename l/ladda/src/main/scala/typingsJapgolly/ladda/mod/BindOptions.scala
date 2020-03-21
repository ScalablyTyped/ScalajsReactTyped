package typingsJapgolly.ladda.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindOptions extends js.Object {
  /**
    * A function to be called with the Ladda instance when a target button is clicked.
    */
  var callback: js.UndefOr[js.Function1[/* instance */ LaddaButton, Unit]] = js.undefined
  /**
    * Number of milliseconds to wait before automatically cancelling the animation.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object BindOptions {
  @scala.inline
  def apply(callback: /* instance */ LaddaButton => Callback = null, timeout: Int | Double = null): BindOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.ladda.mod.LaddaButton) => callback(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindOptions]
  }
}

