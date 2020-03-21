package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA1[R, T] extends js.Object {
  def execute(t: T): js.Thenable[R]
}

object CommandA1 {
  @scala.inline
  def apply[R, T](execute: T => CallbackTo[js.Thenable[R]]): CommandA1[R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction1((t0: T) => execute(t0).runNow()))
    __obj.asInstanceOf[CommandA1[R, T]]
  }
}

