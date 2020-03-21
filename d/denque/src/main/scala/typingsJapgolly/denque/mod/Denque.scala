package typingsJapgolly.denque.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Denque[T] extends js.Object {
  var length: Double
  def clear(): Unit
  def get(index: Double): js.UndefOr[T]
  def isEmpty(): Boolean
  def peekAt(index: Double): js.UndefOr[T]
  def peekBack(): js.UndefOr[T]
  def peekFront(): js.UndefOr[T]
  def pop(): js.UndefOr[T]
  def push(item: T): Double
  def remove(index: Double, count: Double): js.Array[T]
  def removeBack(): js.UndefOr[T]
  def removeOne(index: Double): js.UndefOr[T]
  def shift(): js.UndefOr[T]
  def splice(index: Double, count: Double, item: T*): js.UndefOr[js.Array[T]]
  def toArray(): js.Array[T]
  def unshift(item: T): Double
}

object Denque {
  @scala.inline
  def apply[T](
    clear: Callback,
    get: Double => CallbackTo[js.UndefOr[T]],
    isEmpty: CallbackTo[Boolean],
    length: Double,
    peekAt: Double => CallbackTo[js.UndefOr[T]],
    peekBack: CallbackTo[js.UndefOr[T]],
    peekFront: CallbackTo[js.UndefOr[T]],
    pop: CallbackTo[js.UndefOr[T]],
    push: T => CallbackTo[Double],
    remove: (Double, Double) => CallbackTo[js.Array[T]],
    removeBack: CallbackTo[js.UndefOr[T]],
    removeOne: Double => CallbackTo[js.UndefOr[T]],
    shift: CallbackTo[js.UndefOr[T]],
    splice: (Double, Double, /* repeated */ T) => CallbackTo[js.UndefOr[js.Array[T]]],
    toArray: CallbackTo[js.Array[T]],
    unshift: T => CallbackTo[Double]
  ): Denque[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("peekAt")(js.Any.fromFunction1((t0: scala.Double) => peekAt(t0).runNow()))
    __obj.updateDynamic("peekBack")(peekBack.toJsFn)
    __obj.updateDynamic("peekFront")(peekFront.toJsFn)
    __obj.updateDynamic("pop")(pop.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: T) => push(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => remove(t0, t1).runNow()))
    __obj.updateDynamic("removeBack")(removeBack.toJsFn)
    __obj.updateDynamic("removeOne")(js.Any.fromFunction1((t0: scala.Double) => removeOne(t0).runNow()))
    __obj.updateDynamic("shift")(shift.toJsFn)
    __obj.updateDynamic("splice")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: /* repeated */ T) => splice(t0, t1, t2).runNow()))
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.updateDynamic("unshift")(js.Any.fromFunction1((t0: T) => unshift(t0).runNow()))
    __obj.asInstanceOf[Denque[T]]
  }
}

