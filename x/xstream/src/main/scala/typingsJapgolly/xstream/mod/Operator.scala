package typingsJapgolly.xstream.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator[T, R]
  extends InternalProducer[R]
     with InternalListener[T]
     with OutSender[R] {
  var ins: Stream[T]
  var `type`: String
  def _start(out: Stream[R]): Unit
}

object Operator {
  @scala.inline
  def apply[T, R](
    _c: Callback,
    _e: js.Any => Callback,
    _n: T => Callback,
    _start: Stream[R] => Callback,
    _stop: Callback,
    ins: Stream[T],
    out: Stream[R],
    `type`: String
  ): Operator[T, R] = {
    val __obj = js.Dynamic.literal(ins = ins.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.updateDynamic("_c")(_c.toJsFn)
    __obj.updateDynamic("_e")(js.Any.fromFunction1((t0: js.Any) => _e(t0).runNow()))
    __obj.updateDynamic("_n")(js.Any.fromFunction1((t0: T) => _n(t0).runNow()))
    __obj.updateDynamic("_start")(js.Any.fromFunction1((t0: typingsJapgolly.xstream.mod.Stream[R]) => _start(t0).runNow()))
    __obj.updateDynamic("_stop")(_stop.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator[T, R]]
  }
}

