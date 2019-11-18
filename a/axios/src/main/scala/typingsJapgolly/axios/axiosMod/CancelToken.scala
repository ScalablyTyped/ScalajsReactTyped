package typingsJapgolly.axios.axiosMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelToken extends js.Object {
  var promise: js.Promise[Cancel]
  var reason: js.UndefOr[Cancel] = js.undefined
  def throwIfRequested(): Unit
}

object CancelToken {
  @scala.inline
  def apply(promise: js.Promise[Cancel], throwIfRequested: Callback, reason: Cancel = null): CancelToken = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.updateDynamic("throwIfRequested")(throwIfRequested.toJsFn)
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelToken]
  }
}

