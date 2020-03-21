package typingsJapgolly.recompose.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  def complete(): Unit
  def next(props: T): Unit
}

object Observer {
  @scala.inline
  def apply[T](complete: Callback, next: T => Callback): Observer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[Observer[T]]
  }
}

