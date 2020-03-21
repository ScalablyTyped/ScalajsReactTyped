package typingsJapgolly.retry.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttemptTimeoutOptions extends js.Object {
  /**
    * Callback to execute when the operation takes longer than the timeout.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A timeout in milliseconds.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object AttemptTimeoutOptions {
  @scala.inline
  def apply(callback: js.UndefOr[Callback] = js.undefined, timeout: Int | Double = null): AttemptTimeoutOptions = {
    val __obj = js.Dynamic.literal()
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptTimeoutOptions]
  }
}

