package typingsJapgolly.changeEmitter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf4[T1, T2, T3, T4] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3, value4: T4): Unit
  def listen(listener: ListenerOf4[T1, T2, T3, T4]): Unlisten
}

object ChangeEmitterOf4 {
  @scala.inline
  def apply[T1, T2, T3, T4](emit: (T1, T2, T3, T4) => Callback, listen: ListenerOf4[T1, T2, T3, T4] => CallbackTo[Unlisten]): ChangeEmitterOf4[T1, T2, T3, T4] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction4((t0: T1, t1: T2, t2: T3, t3: T4) => emit(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: typingsJapgolly.changeEmitter.mod.ListenerOf4[T1, T2, T3, T4]) => listen(t0).runNow()))
    __obj.asInstanceOf[ChangeEmitterOf4[T1, T2, T3, T4]]
  }
}

