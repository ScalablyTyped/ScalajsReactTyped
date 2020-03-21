package typingsJapgolly.ramda.toolsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor[A] extends js.Object {
  def map[U](fn: js.Function1[/* a */ A, U]): Functor[U]
}

object Functor {
  @scala.inline
  def apply[A](map: js.Function1[/* a */ A, js.Any] => CallbackTo[Functor[js.Any]]): Functor[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function1[/* a */ A, js.Any]) => map(t0).runNow()))
    __obj.asInstanceOf[Functor[A]]
  }
}

