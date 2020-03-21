package typingsJapgolly.xstream.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalListener[T] extends js.Object {
  def _c(): Unit
  def _e(err: js.Any): Unit
  def _n(v: T): Unit
}

object InternalListener {
  @scala.inline
  def apply[T](_c: Callback, _e: js.Any => Callback, _n: T => Callback): InternalListener[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_c")(_c.toJsFn)
    __obj.updateDynamic("_e")(js.Any.fromFunction1((t0: js.Any) => _e(t0).runNow()))
    __obj.updateDynamic("_n")(js.Any.fromFunction1((t0: T) => _n(t0).runNow()))
    __obj.asInstanceOf[InternalListener[T]]
  }
}

