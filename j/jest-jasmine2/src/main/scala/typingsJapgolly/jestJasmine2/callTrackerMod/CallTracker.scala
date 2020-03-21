package typingsJapgolly.jestJasmine2.callTrackerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallTracker extends js.Object {
  def all(): js.Array[Context]
  def allArgs(): js.Array[_]
  def any(): Boolean
  def argsFor(index: Double): js.Array[_]
  def count(): Double
  def first(): Context
  def mostRecent(): Context
  def reset(): Unit
  def track(context: Context): Unit
}

object CallTracker {
  @scala.inline
  def apply(
    all: CallbackTo[js.Array[Context]],
    allArgs: CallbackTo[js.Array[js.Any]],
    any: CallbackTo[Boolean],
    argsFor: Double => CallbackTo[js.Array[js.Any]],
    count: CallbackTo[Double],
    first: CallbackTo[Context],
    mostRecent: CallbackTo[Context],
    reset: Callback,
    track: Context => Callback
  ): CallTracker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.updateDynamic("allArgs")(allArgs.toJsFn)
    __obj.updateDynamic("any")(any.toJsFn)
    __obj.updateDynamic("argsFor")(js.Any.fromFunction1((t0: scala.Double) => argsFor(t0).runNow()))
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("mostRecent")(mostRecent.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("track")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.callTrackerMod.Context) => track(t0).runNow()))
    __obj.asInstanceOf[CallTracker]
  }
}

