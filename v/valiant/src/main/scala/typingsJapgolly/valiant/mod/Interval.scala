package typingsJapgolly.valiant.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interval[T] extends js.Object {
  var constructor: IntervalConstructor[Double]
  var empty: Boolean
  var from: Endpoint[T]
  var to: Endpoint[T]
  def contains(value: T): Boolean
  def contiguousWith(interval: Interval[T]): Boolean
  def equalTo(interval: Interval[T]): Boolean
  def fromComparator(a: Endpoint[T], b: Endpoint[T]): Double
  def hull(interval: Interval[T]): Interval[T]
  def intersection(interval: Interval[T]): Boolean
  def isEmpty(): Boolean
  def isSubsetOf(interval: Interval[T]): Boolean
  def toComparator(a: Endpoint[T], b: Endpoint[T]): Double
  def unify(interval: Interval[T]): Interval[T]
}

object Interval {
  @scala.inline
  def apply[T](
    constructor: IntervalConstructor[Double],
    contains: T => CallbackTo[Boolean],
    contiguousWith: Interval[T] => CallbackTo[Boolean],
    empty: Boolean,
    equalTo: Interval[T] => CallbackTo[Boolean],
    from: Endpoint[T],
    fromComparator: (Endpoint[T], Endpoint[T]) => CallbackTo[Double],
    hull: Interval[T] => CallbackTo[Interval[T]],
    intersection: Interval[T] => CallbackTo[Boolean],
    isEmpty: CallbackTo[Boolean],
    isSubsetOf: Interval[T] => CallbackTo[Boolean],
    to: Endpoint[T],
    toComparator: (Endpoint[T], Endpoint[T]) => CallbackTo[Double],
    unify: Interval[T] => CallbackTo[Interval[T]]
  ): Interval[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: T) => contains(t0).runNow()))
    __obj.updateDynamic("contiguousWith")(js.Any.fromFunction1((t0: typingsJapgolly.valiant.mod.Interval[T]) => contiguousWith(t0).runNow()))
    __obj.updateDynamic("equalTo")(js.Any.fromFunction1((t0: typingsJapgolly.valiant.mod.Interval[T]) => equalTo(t0).runNow()))
    __obj.updateDynamic("fromComparator")(js.Any.fromFunction2((t0: typingsJapgolly.valiant.mod.Endpoint[T], t1: typingsJapgolly.valiant.mod.Endpoint[T]) => fromComparator(t0, t1).runNow()))
    __obj.updateDynamic("hull")(js.Any.fromFunction1((t0: typingsJapgolly.valiant.mod.Interval[T]) => hull(t0).runNow()))
    __obj.updateDynamic("intersection")(js.Any.fromFunction1((t0: typingsJapgolly.valiant.mod.Interval[T]) => intersection(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("isSubsetOf")(js.Any.fromFunction1((t0: typingsJapgolly.valiant.mod.Interval[T]) => isSubsetOf(t0).runNow()))
    __obj.updateDynamic("toComparator")(js.Any.fromFunction2((t0: typingsJapgolly.valiant.mod.Endpoint[T], t1: typingsJapgolly.valiant.mod.Endpoint[T]) => toComparator(t0, t1).runNow()))
    __obj.updateDynamic("unify")(js.Any.fromFunction1((t0: typingsJapgolly.valiant.mod.Interval[T]) => unify(t0).runNow()))
    __obj.asInstanceOf[Interval[T]]
  }
}

