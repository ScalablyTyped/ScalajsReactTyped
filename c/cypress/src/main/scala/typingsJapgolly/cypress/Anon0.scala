package typingsJapgolly.cypress

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cypress.JQuery_._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[TElement] extends _ValHook[TElement] {
  def get(elem: TElement): js.Any
}

object Anon0 {
  @scala.inline
  def apply[TElement](get: TElement => CallbackTo[js.Any]): Anon0[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: TElement) => get(t0).runNow()))
    __obj.asInstanceOf[Anon0[TElement]]
  }
}

