package typingsJapgolly.hashset

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashSet[TValue] extends js.Object {
  def add(value: TValue): Unit
  def addAll(arr: js.Array[TValue]): Unit
  def clear(): Unit
  def complement(set: IHashSet[TValue]): IHashSet[TValue]
  def contains(value: TValue): Boolean
  def intersection(set: IHashSet[TValue]): IHashSet[TValue]
  def isEmpty(): Boolean
  def isSubsetOf(set: IHashSet[TValue]): Boolean
  def remove(value: TValue): Unit
  def size(): Double
  def union(set: IHashSet[TValue]): IHashSet[TValue]
  def values(): js.Array[TValue]
}

object IHashSet {
  @scala.inline
  def apply[TValue](
    add: TValue => Callback,
    addAll: js.Array[TValue] => Callback,
    clear: Callback,
    complement: IHashSet[TValue] => CallbackTo[IHashSet[TValue]],
    contains: TValue => CallbackTo[Boolean],
    intersection: IHashSet[TValue] => CallbackTo[IHashSet[TValue]],
    isEmpty: CallbackTo[Boolean],
    isSubsetOf: IHashSet[TValue] => CallbackTo[Boolean],
    remove: TValue => Callback,
    size: CallbackTo[Double],
    union: IHashSet[TValue] => CallbackTo[IHashSet[TValue]],
    values: CallbackTo[js.Array[TValue]]
  ): IHashSet[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: TValue) => add(t0).runNow()))
    __obj.updateDynamic("addAll")(js.Any.fromFunction1((t0: js.Array[TValue]) => addAll(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("complement")(js.Any.fromFunction1((t0: typingsJapgolly.hashset.IHashSet[TValue]) => complement(t0).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: TValue) => contains(t0).runNow()))
    __obj.updateDynamic("intersection")(js.Any.fromFunction1((t0: typingsJapgolly.hashset.IHashSet[TValue]) => intersection(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("isSubsetOf")(js.Any.fromFunction1((t0: typingsJapgolly.hashset.IHashSet[TValue]) => isSubsetOf(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: TValue) => remove(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("union")(js.Any.fromFunction1((t0: typingsJapgolly.hashset.IHashSet[TValue]) => union(t0).runNow()))
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[IHashSet[TValue]]
  }
}

