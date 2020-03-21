package typingsJapgolly.xstream.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalProducer[T] extends js.Object {
  def _start(listener: InternalListener[T]): Unit
  def _stop(): Unit
}

object InternalProducer {
  @scala.inline
  def apply[T](_start: InternalListener[T] => Callback, _stop: Callback): InternalProducer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_start")(js.Any.fromFunction1((t0: typingsJapgolly.xstream.mod.InternalListener[T]) => _start(t0).runNow()))
    __obj.updateDynamic("_stop")(_stop.toJsFn)
    __obj.asInstanceOf[InternalProducer[T]]
  }
}

