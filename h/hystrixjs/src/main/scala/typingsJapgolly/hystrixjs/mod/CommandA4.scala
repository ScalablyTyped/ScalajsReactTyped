package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA4[R, T, U, V, W] extends js.Object {
  def execute(t: T, u: U, v: V, w: W): js.Thenable[R]
}

object CommandA4 {
  @scala.inline
  def apply[R, T, U, V, W](execute: (T, U, V, W) => CallbackTo[js.Thenable[R]]): CommandA4[R, T, U, V, W] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction4((t0: T, t1: U, t2: V, t3: W) => execute(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[CommandA4[R, T, U, V, W]]
  }
}

