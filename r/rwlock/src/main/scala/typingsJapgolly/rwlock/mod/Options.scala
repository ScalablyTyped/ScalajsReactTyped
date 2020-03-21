package typingsJapgolly.rwlock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var scope: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var timeoutCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    scope: js.Any = null,
    timeout: Int | Double = null,
    timeoutCallback: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    timeoutCallback.foreach(p => __obj.updateDynamic("timeoutCallback")(p.toJsFn))
    __obj.asInstanceOf[Options]
  }
}

