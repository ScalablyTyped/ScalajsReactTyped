package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA5[R, T, U, V, W, X] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X): js.Thenable[R]
}

object CommandA5 {
  @scala.inline
  def apply[R, T, U, V, W, X](execute: (T, U, V, W, X) => CallbackTo[js.Thenable[R]]): CommandA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction5((t0: T, t1: U, t2: V, t3: W, t4: X) => execute(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[CommandA5[R, T, U, V, W, X]]
  }
}

