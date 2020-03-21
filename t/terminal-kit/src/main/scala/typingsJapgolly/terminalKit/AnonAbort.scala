package typingsJapgolly.terminalKit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbort extends js.Object {
  var promise: js.UndefOr[js.Promise[Boolean]] = js.undefined
  def abort(): Unit
}

object AnonAbort {
  @scala.inline
  def apply(abort: Callback, promise: js.Promise[Boolean] = null): AnonAbort = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbort]
  }
}

