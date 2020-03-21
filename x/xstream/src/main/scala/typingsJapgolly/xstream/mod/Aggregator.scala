package typingsJapgolly.xstream.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregator[T, U]
  extends InternalProducer[U]
     with OutSender[U] {
  var insArr: js.Array[Stream[T]]
  var `type`: String
  def _start(out: Stream[U]): Unit
}

object Aggregator {
  @scala.inline
  def apply[T, U](
    _start: Stream[U] => Callback,
    _stop: Callback,
    insArr: js.Array[Stream[T]],
    out: Stream[U],
    `type`: String
  ): Aggregator[T, U] = {
    val __obj = js.Dynamic.literal(insArr = insArr.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.updateDynamic("_start")(js.Any.fromFunction1((t0: typingsJapgolly.xstream.mod.Stream[U]) => _start(t0).runNow()))
    __obj.updateDynamic("_stop")(_stop.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregator[T, U]]
  }
}

