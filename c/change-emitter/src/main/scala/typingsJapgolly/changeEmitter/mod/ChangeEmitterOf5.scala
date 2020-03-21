package typingsJapgolly.changeEmitter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf5[T1, T2, T3, T4, T5] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3, value4: T4, value5: T5): Unit
  def listen(listener: ListenerOf5[T1, T2, T3, T4, T5]): Unlisten
}

object ChangeEmitterOf5 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5](
    emit: (T1, T2, T3, T4, T5) => Callback,
    listen: ListenerOf5[T1, T2, T3, T4, T5] => CallbackTo[Unlisten]
  ): ChangeEmitterOf5[T1, T2, T3, T4, T5] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction5((t0: T1, t1: T2, t2: T3, t3: T4, t4: T5) => emit(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: typingsJapgolly.changeEmitter.mod.ListenerOf5[T1, T2, T3, T4, T5]) => listen(t0).runNow()))
    __obj.asInstanceOf[ChangeEmitterOf5[T1, T2, T3, T4, T5]]
  }
}

