package typingsJapgolly.reduxSagaCore.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakeableChannel[T] extends js.Object {
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit
}

object TakeableChannel {
  @scala.inline
  def apply[T](take: js.Function1[/* message */ T | END, Unit] => Callback): TakeableChannel[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("take")(js.Any.fromFunction1((t0: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, scala.Unit]) => take(t0).runNow()))
    __obj.asInstanceOf[TakeableChannel[T]]
  }
}

