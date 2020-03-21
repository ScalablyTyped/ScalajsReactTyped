package typingsJapgolly.jquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQuery_._SpecialEventHook
import typingsJapgolly.jquery.jqueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def preDispatch(event: typingsJapgolly.jquery.JQuery_.Event): `false` | Unit
}

object AnonPreDispatch {
  @scala.inline
  def apply[TTarget](preDispatch: typingsJapgolly.jquery.JQuery_.Event => CallbackTo[`false` | Unit]): AnonPreDispatch[TTarget] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preDispatch")(js.Any.fromFunction1((t0: typingsJapgolly.jquery.JQuery_.Event) => preDispatch(t0).runNow()))
    __obj.asInstanceOf[AnonPreDispatch[TTarget]]
  }
}

