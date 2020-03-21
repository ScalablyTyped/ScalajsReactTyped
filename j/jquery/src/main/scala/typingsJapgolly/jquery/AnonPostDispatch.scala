package typingsJapgolly.jquery

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQuery_._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def postDispatch(event: typingsJapgolly.jquery.JQuery_.Event): Unit
}

object AnonPostDispatch {
  @scala.inline
  def apply[TTarget](postDispatch: typingsJapgolly.jquery.JQuery_.Event => Callback): AnonPostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postDispatch")(js.Any.fromFunction1((t0: typingsJapgolly.jquery.JQuery_.Event) => postDispatch(t0).runNow()))
    __obj.asInstanceOf[AnonPostDispatch[TTarget]]
  }
}

