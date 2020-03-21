package typingsJapgolly.cypress

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cypress.JQuery_._SpecialEventHook
import typingsJapgolly.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def preDispatch(event: typingsJapgolly.cypress.JQuery_.Event): `false` | Unit
}

object AnonPreDispatch {
  @scala.inline
  def apply[TTarget](preDispatch: typingsJapgolly.cypress.JQuery_.Event => CallbackTo[`false` | Unit]): AnonPreDispatch[TTarget] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preDispatch")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.JQuery_.Event) => preDispatch(t0).runNow()))
    __obj.asInstanceOf[AnonPreDispatch[TTarget]]
  }
}

