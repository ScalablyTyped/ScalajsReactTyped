package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA2[R, T, U] extends js.Object {
  def execute(t: T, u: U): js.Thenable[R]
}

object CommandA2 {
  @scala.inline
  def apply[R, T, U](execute: (T, U) => CallbackTo[js.Thenable[R]]): CommandA2[R, T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction2((t0: T, t1: U) => execute(t0, t1).runNow()))
    __obj.asInstanceOf[CommandA2[R, T, U]]
  }
}

