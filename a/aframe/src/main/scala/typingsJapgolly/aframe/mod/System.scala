package typingsJapgolly.aframe.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait System[T /* <: js.Object */] extends js.Object {
  var data: T
  var schema: Schema_[T]
  var tick: js.UndefOr[js.Function2[/* t */ Double, /* dt */ Double, Unit]] = js.undefined
  def init(): Unit
  def pause(): Unit
  def play(): Unit
}

object System {
  @scala.inline
  def apply[T /* <: js.Object */](
    data: T,
    init: Callback,
    pause: Callback,
    play: Callback,
    schema: Schema_[T],
    tick: (/* t */ Double, /* dt */ Double) => Callback = null
  ): System[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    if (tick != null) __obj.updateDynamic("tick")(js.Any.fromFunction2((t0: /* t */ scala.Double, t1: /* dt */ scala.Double) => tick(t0, t1).runNow()))
    __obj.asInstanceOf[System[T]]
  }
}

