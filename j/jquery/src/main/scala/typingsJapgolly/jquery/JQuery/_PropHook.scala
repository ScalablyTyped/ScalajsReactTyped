package typingsJapgolly.jquery.JQuery

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PropHook[TElement] extends js.Object

object _PropHook {
  @scala.inline
  def Anon_Get[TElement](get: Tween[TElement] => CallbackTo[js.Any]): _PropHook[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.jquery.JQuery.Tween[TElement]) => get(t0).runNow()))
    __obj.asInstanceOf[_PropHook[TElement]]
  }
  @scala.inline
  def Anon_Set[TElement](set: Tween[TElement] => Callback): _PropHook[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.jquery.JQuery.Tween[TElement]) => set(t0).runNow()))
    __obj.asInstanceOf[_PropHook[TElement]]
  }
}

