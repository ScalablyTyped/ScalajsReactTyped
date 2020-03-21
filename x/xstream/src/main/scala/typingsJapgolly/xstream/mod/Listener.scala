package typingsJapgolly.xstream.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener[T] extends js.Object {
  def complete(): Unit
  def error(err: js.Any): Unit
  def next(x: T): Unit
}

object Listener {
  @scala.inline
  def apply[T](complete: Callback, error: js.Any => Callback, next: T => Callback): Listener[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[Listener[T]]
  }
}

