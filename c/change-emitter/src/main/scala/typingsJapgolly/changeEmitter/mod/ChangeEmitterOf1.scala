package typingsJapgolly.changeEmitter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf1[T] extends js.Object {
  def emit(value: T): Unit
  def listen(listener: ListenerOf1[T]): Unlisten
}

object ChangeEmitterOf1 {
  @scala.inline
  def apply[T](emit: T => Callback, listen: ListenerOf1[T] => CallbackTo[Unlisten]): ChangeEmitterOf1[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction1((t0: T) => emit(t0).runNow()))
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: typingsJapgolly.changeEmitter.mod.ListenerOf1[T]) => listen(t0).runNow()))
    __obj.asInstanceOf[ChangeEmitterOf1[T]]
  }
}

