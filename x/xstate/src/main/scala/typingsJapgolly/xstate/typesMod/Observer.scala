package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  def complete(): Unit
  def error(err: js.Any): Unit
  def next(value: T): Unit
}

object Observer {
  @scala.inline
  def apply[T](complete: Callback, error: js.Any => Callback, next: T => Callback): Observer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[Observer[T]]
  }
}

