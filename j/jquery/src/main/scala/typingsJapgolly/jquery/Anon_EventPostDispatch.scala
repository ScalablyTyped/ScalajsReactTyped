package typingsJapgolly.jquery

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQuery.Event
import typingsJapgolly.jquery.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventPostDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def postDispatch(`this`: TTarget, event: Event): Unit
}

object Anon_EventPostDispatch {
  @scala.inline
  def apply[TTarget](postDispatch: (TTarget, Event) => Callback): Anon_EventPostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postDispatch")(js.Any.fromFunction2((t0: TTarget, t1: typingsJapgolly.jquery.JQuery.Event) => postDispatch(t0, t1).runNow()))
    __obj.asInstanceOf[Anon_EventPostDispatch[TTarget]]
  }
}

