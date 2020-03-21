package typingsJapgolly.retryRequest

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbort extends js.Object {
  def abort(): Unit
}

object AnonAbort {
  @scala.inline
  def apply(abort: Callback): AnonAbort = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.asInstanceOf[AnonAbort]
  }
}

