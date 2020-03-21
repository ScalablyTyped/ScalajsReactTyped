package typingsJapgolly.reactJoyride.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreHelpers extends js.Object {
  def close(): Unit
  def go(nextIndex: Double): Unit
  def info(): StoreState
  def next(): Unit
  def open(): Unit
  def prev(): Unit
  def reset(restart: Boolean): Unit
  def skip(): Unit
}

object StoreHelpers {
  @scala.inline
  def apply(
    close: Callback,
    go: Double => Callback,
    info: CallbackTo[StoreState],
    next: Callback,
    open: Callback,
    prev: Callback,
    reset: Boolean => Callback,
    skip: Callback
  ): StoreHelpers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("go")(js.Any.fromFunction1((t0: scala.Double) => go(t0).runNow()))
    __obj.updateDynamic("info")(info.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: scala.Boolean) => reset(t0).runNow()))
    __obj.updateDynamic("skip")(skip.toJsFn)
    __obj.asInstanceOf[StoreHelpers]
  }
}

