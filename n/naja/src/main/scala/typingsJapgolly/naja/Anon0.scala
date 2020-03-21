package typingsJapgolly.naja

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[T /* <: Event_ */] extends js.Object {
  def handleEvent(event: T): js.Promise[Unit] | Unit
}

object Anon0 {
  @scala.inline
  def apply[T /* <: Event_ */](handleEvent: T => CallbackTo[js.Promise[Unit] | Unit]): Anon0[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: T) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[Anon0[T]]
  }
}

