package typingsJapgolly.pFifo.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PFifo[T] extends js.Object {
  def isEmpty(): Boolean
  def push(chunk: T): js.Promise[Unit]
  def shift(): js.Promise[T]
}

object PFifo {
  @scala.inline
  def apply[T](
    isEmpty: CallbackTo[Boolean],
    push: T => CallbackTo[js.Promise[Unit]],
    shift: CallbackTo[js.Promise[T]]
  ): PFifo[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: T) => push(t0).runNow()))
    __obj.updateDynamic("shift")(shift.toJsFn)
    __obj.asInstanceOf[PFifo[T]]
  }
}

