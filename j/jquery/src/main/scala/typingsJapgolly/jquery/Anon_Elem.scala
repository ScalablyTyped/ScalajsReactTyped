package typingsJapgolly.jquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQuery._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Elem[TElement] extends _ValHook[TElement] {
  def get(elem: TElement): js.Any
}

object Anon_Elem {
  @scala.inline
  def apply[TElement](get: TElement => CallbackTo[js.Any]): Anon_Elem[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: TElement) => get(t0).runNow()))
    __obj.asInstanceOf[Anon_Elem[TElement]]
  }
}

