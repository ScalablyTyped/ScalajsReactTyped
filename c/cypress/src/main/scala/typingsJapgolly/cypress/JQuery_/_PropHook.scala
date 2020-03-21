package typingsJapgolly.cypress.JQuery_

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PropHook[TElement] extends js.Object

object _PropHook {
  @scala.inline
  def AnonGet[TElement](get: Tween[TElement] => CallbackTo[js.Any]): _PropHook[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.JQuery_.Tween[TElement]) => get(t0).runNow()))
    __obj.asInstanceOf[_PropHook[TElement]]
  }
  @scala.inline
  def AnonSet[TElement](set: Tween[TElement] => Callback): _PropHook[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.JQuery_.Tween[TElement]) => set(t0).runNow()))
    __obj.asInstanceOf[_PropHook[TElement]]
  }
}

