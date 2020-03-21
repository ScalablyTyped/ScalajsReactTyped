package typingsJapgolly.changeEmitter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf3[T1, T2, T3] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3): Unit
  def listen(listener: ListenerOf3[T1, T2, T3]): Unlisten
}

object ChangeEmitterOf3 {
  @scala.inline
  def apply[T1, T2, T3](emit: (T1, T2, T3) => Callback, listen: ListenerOf3[T1, T2, T3] => CallbackTo[Unlisten]): ChangeEmitterOf3[T1, T2, T3] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction3((t0: T1, t1: T2, t2: T3) => emit(t0, t1, t2).runNow()))
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: typingsJapgolly.changeEmitter.mod.ListenerOf3[T1, T2, T3]) => listen(t0).runNow()))
    __obj.asInstanceOf[ChangeEmitterOf3[T1, T2, T3]]
  }
}

