package typingsJapgolly.changeEmitter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf2[T1, T2] extends js.Object {
  def emit(value1: T1, value2: T2): Unit
  def listen(listener: ListenerOf2[T1, T2]): Unlisten
}

object ChangeEmitterOf2 {
  @scala.inline
  def apply[T1, T2](emit: (T1, T2) => Callback, listen: ListenerOf2[T1, T2] => CallbackTo[Unlisten]): ChangeEmitterOf2[T1, T2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: T1, t1: T2) => emit(t0, t1).runNow()))
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: typingsJapgolly.changeEmitter.mod.ListenerOf2[T1, T2]) => listen(t0).runNow()))
    __obj.asInstanceOf[ChangeEmitterOf2[T1, T2]]
  }
}

