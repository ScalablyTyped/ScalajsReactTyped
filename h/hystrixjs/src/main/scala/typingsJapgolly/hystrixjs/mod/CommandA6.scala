package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA6[R, T, U, V, W, X, Y] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y): js.Thenable[R]
}

object CommandA6 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y](execute: (T, U, V, W, X, Y) => CallbackTo[js.Thenable[R]]): CommandA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction6((t0: T, t1: U, t2: V, t3: W, t4: X, t5: Y) => execute(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.asInstanceOf[CommandA6[R, T, U, V, W, X, Y]]
  }
}

