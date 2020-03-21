package typingsJapgolly.xstream.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Producer[T] extends js.Object {
  def start(listener: Listener[T]): Unit
  def stop(): Unit
}

object Producer {
  @scala.inline
  def apply[T](start: Listener[T] => Callback, stop: Callback): Producer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: typingsJapgolly.xstream.mod.Listener[T]) => start(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Producer[T]]
  }
}

