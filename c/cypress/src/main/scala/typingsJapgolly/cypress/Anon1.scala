package typingsJapgolly.cypress

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cypress.JQuery_._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1[TElement] extends _ValHook[TElement] {
  def set(elem: TElement, value: js.Any): js.Any
}

object Anon1 {
  @scala.inline
  def apply[TElement](set: (TElement, js.Any) => CallbackTo[js.Any]): Anon1[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: TElement, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Anon1[TElement]]
  }
}

