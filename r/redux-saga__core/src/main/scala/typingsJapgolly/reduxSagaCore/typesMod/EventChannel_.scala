package typingsJapgolly.reduxSagaCore.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventChannel_[T] extends js.Object {
  def close(): Unit
  def flush(cb: js.Function1[/* items */ js.Array[T] | END, Unit]): Unit
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit
}

object EventChannel_ {
  @scala.inline
  def apply[T](
    close: Callback,
    flush: js.Function1[/* items */ js.Array[T] | END, Unit] => Callback,
    take: js.Function1[/* message */ T | END, Unit] => Callback
  ): EventChannel_[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("flush")(js.Any.fromFunction1((t0: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, scala.Unit]) => flush(t0).runNow()))
    __obj.updateDynamic("take")(js.Any.fromFunction1((t0: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, scala.Unit]) => take(t0).runNow()))
    __obj.asInstanceOf[EventChannel_[T]]
  }
}

