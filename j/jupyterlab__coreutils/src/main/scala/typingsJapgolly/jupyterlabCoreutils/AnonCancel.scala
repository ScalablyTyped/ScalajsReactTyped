package typingsJapgolly.jupyterlabCoreutils

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IPoll.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel[T, U, V /* <: String */] extends js.Object {
  def cancel(last: State[T, U, V]): Boolean
}

object AnonCancel {
  @scala.inline
  def apply[T, U, V /* <: String */](cancel: State[T, U, V] => CallbackTo[Boolean]): AnonCancel[T, U, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCoreutils.interfacesMod.IPoll.State[T, U, V]) => cancel(t0).runNow()))
    __obj.asInstanceOf[AnonCancel[T, U, V]]
  }
}

