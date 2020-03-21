package typingsJapgolly.typedoc

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErr[T, T2, E, E2] extends js.Object {
  def err(err: E): E2
  def ok(data: T): T2
}

object AnonErr {
  @scala.inline
  def apply[T, T2, E, E2](err: E => CallbackTo[E2], ok: T => CallbackTo[T2]): AnonErr[T, T2, E, E2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("err")(js.Any.fromFunction1((t0: E) => err(t0).runNow()))
    __obj.updateDynamic("ok")(js.Any.fromFunction1((t0: T) => ok(t0).runNow()))
    __obj.asInstanceOf[AnonErr[T, T2, E, E2]]
  }
}

