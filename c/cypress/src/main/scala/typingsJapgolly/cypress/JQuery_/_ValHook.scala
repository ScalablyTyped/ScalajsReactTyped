package typingsJapgolly.cypress.JQuery_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ValHook[TElement] extends js.Object

object _ValHook {
  @scala.inline
  def Anon0[TElement](get: TElement => CallbackTo[js.Any]): _ValHook[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: TElement) => get(t0).runNow()))
    __obj.asInstanceOf[_ValHook[TElement]]
  }
  @scala.inline
  def Anon1[TElement](set: (TElement, js.Any) => CallbackTo[js.Any]): _ValHook[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: TElement, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[_ValHook[TElement]]
  }
}

