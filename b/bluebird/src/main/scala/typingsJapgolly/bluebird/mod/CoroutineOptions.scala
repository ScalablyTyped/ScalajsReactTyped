package typingsJapgolly.bluebird.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoroutineOptions extends js.Object {
  def yieldHandler(value: js.Any): js.Any
}

object CoroutineOptions {
  @scala.inline
  def apply(yieldHandler: js.Any => CallbackTo[js.Any]): CoroutineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("yieldHandler")(js.Any.fromFunction1((t0: js.Any) => yieldHandler(t0).runNow()))
    __obj.asInstanceOf[CoroutineOptions]
  }
}

