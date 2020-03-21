package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA3[R, T, U, V] extends js.Object {
  def execute(t: T, u: U, v: V): js.Thenable[R]
}

object CommandA3 {
  @scala.inline
  def apply[R, T, U, V](execute: (T, U, V) => CallbackTo[js.Thenable[R]]): CommandA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction3((t0: T, t1: U, t2: V) => execute(t0, t1, t2).runNow()))
    __obj.asInstanceOf[CommandA3[R, T, U, V]]
  }
}

