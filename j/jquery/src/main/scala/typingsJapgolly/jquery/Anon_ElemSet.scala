package typingsJapgolly.jquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQuery._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElemSet[TElement] extends _ValHook[TElement] {
  def set(elem: TElement, value: js.Any): js.Any
}

object Anon_ElemSet {
  @scala.inline
  def apply[TElement](set: (TElement, js.Any) => CallbackTo[js.Any]): Anon_ElemSet[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: TElement, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Anon_ElemSet[TElement]]
  }
}

