package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calls extends js.Object {
  /** By chaining the spy with calls.all(), will return the context (the this) and arguments passed all calls **/
  def all(): js.Array[CallInfo]
  /** By chaining the spy with calls.allArgs(), will return the arguments to all calls **/
  def allArgs(): js.Array[_]
  /** By chaining the spy with calls.any(), will return false if the spy has not been called at all, and then true once at least one call happens. **/
  def any(): Boolean
  /** By chaining the spy with calls.argsFor(), will return the arguments passed to call number index **/
  def argsFor(index: Double): js.Array[_]
  /** By chaining the spy with calls.count(), will return the number of times the spy was called **/
  def count(): Double
  /** By chaining the spy with calls.first(), will return the context (the this) and arguments for the first call **/
  def first(): CallInfo
  /** By chaining the spy with calls.mostRecent(), will return the context (the this) and arguments for the most recent call **/
  def mostRecent(): CallInfo
  /** By chaining the spy with calls.reset(), will clears all tracking for a spy **/
  def reset(): Unit
}

object Calls {
  @scala.inline
  def apply(
    all: CallbackTo[js.Array[CallInfo]],
    allArgs: CallbackTo[js.Array[js.Any]],
    any: CallbackTo[Boolean],
    argsFor: Double => CallbackTo[js.Array[js.Any]],
    count: CallbackTo[Double],
    first: CallbackTo[CallInfo],
    mostRecent: CallbackTo[CallInfo],
    reset: Callback
  ): Calls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.updateDynamic("allArgs")(allArgs.toJsFn)
    __obj.updateDynamic("any")(any.toJsFn)
    __obj.updateDynamic("argsFor")(js.Any.fromFunction1((t0: scala.Double) => argsFor(t0).runNow()))
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("mostRecent")(mostRecent.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[Calls]
  }
}

