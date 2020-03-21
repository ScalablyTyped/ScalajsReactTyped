package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA7[R, T, U, V, W, X, Y, Z] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y, z: Z): js.Thenable[R]
}

object CommandA7 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y, Z](execute: (T, U, V, W, X, Y, Z) => CallbackTo[js.Thenable[R]]): CommandA7[R, T, U, V, W, X, Y, Z] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction7((t0: T, t1: U, t2: V, t3: W, t4: X, t5: Y, t6: Z) => execute(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.asInstanceOf[CommandA7[R, T, U, V, W, X, Y, Z]]
  }
}

