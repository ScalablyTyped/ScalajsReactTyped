package typingsJapgolly.jquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQuery.Event
import typingsJapgolly.jquery.JQuery._SpecialEventHook
import typingsJapgolly.jquery.jqueryNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def preDispatch(`this`: TTarget, event: Event): `false` | Unit
}

object Anon_Event {
  @scala.inline
  def apply[TTarget](preDispatch: (TTarget, Event) => CallbackTo[`false` | Unit]): Anon_Event[TTarget] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preDispatch")(js.Any.fromFunction2((t0: TTarget, t1: typingsJapgolly.jquery.JQuery.Event) => preDispatch(t0, t1).runNow()))
    __obj.asInstanceOf[Anon_Event[TTarget]]
  }
}

