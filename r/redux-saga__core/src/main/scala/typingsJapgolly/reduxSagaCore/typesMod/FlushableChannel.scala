package typingsJapgolly.reduxSagaCore.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushableChannel[T] extends js.Object {
  def flush(cb: js.Function1[/* items */ js.Array[T] | END, Unit]): Unit
}

object FlushableChannel {
  @scala.inline
  def apply[T](flush: js.Function1[/* items */ js.Array[T] | END, Unit] => Callback): FlushableChannel[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flush")(js.Any.fromFunction1((t0: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, scala.Unit]) => flush(t0).runNow()))
    __obj.asInstanceOf[FlushableChannel[T]]
  }
}

