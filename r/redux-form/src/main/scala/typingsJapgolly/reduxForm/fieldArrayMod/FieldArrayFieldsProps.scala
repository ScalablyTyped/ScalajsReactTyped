package typingsJapgolly.reduxForm.fieldArrayMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldArrayFieldsProps[FieldValue] extends js.Object {
  var length: Double
  var name: String
  def forEach(callback: FieldIterate[FieldValue, Unit]): Unit
  def get(index: Double): FieldValue
  def getAll(): js.Array[FieldValue]
  def insert(index: Double, value: FieldValue): Unit
  def map[R](callback: FieldIterate[FieldValue, R]): js.Array[R]
  def move(from: Double, to: Double): Unit
  def pop(): FieldValue
  def push(value: FieldValue): Unit
  def remove(index: Double): Unit
  def removeAll(): Unit
  def shift(): FieldValue
  def swap(indexA: Double, indexB: Double): Unit
  def unshift(value: FieldValue): Unit
}

object FieldArrayFieldsProps {
  @scala.inline
  def apply[FieldValue](
    forEach: FieldIterate[FieldValue, Unit] => Callback,
    get: Double => CallbackTo[FieldValue],
    getAll: CallbackTo[js.Array[FieldValue]],
    insert: (Double, FieldValue) => Callback,
    length: Double,
    map: FieldIterate[FieldValue, js.Any] => CallbackTo[js.Array[js.Any]],
    move: (Double, Double) => Callback,
    name: String,
    pop: CallbackTo[FieldValue],
    push: FieldValue => Callback,
    remove: Double => Callback,
    removeAll: Callback,
    shift: CallbackTo[FieldValue],
    swap: (Double, Double) => Callback,
    unshift: FieldValue => Callback
  ): FieldArrayFieldsProps[FieldValue] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: typingsJapgolly.reduxForm.fieldArrayMod.FieldIterate[FieldValue, scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("getAll")(getAll.toJsFn)
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: scala.Double, t1: FieldValue) => insert(t0, t1).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: typingsJapgolly.reduxForm.fieldArrayMod.FieldIterate[FieldValue, js.Any]) => map(t0).runNow()))
    __obj.updateDynamic("move")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => move(t0, t1).runNow()))
    __obj.updateDynamic("pop")(pop.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: FieldValue) => push(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.updateDynamic("removeAll")(removeAll.toJsFn)
    __obj.updateDynamic("shift")(shift.toJsFn)
    __obj.updateDynamic("swap")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => swap(t0, t1).runNow()))
    __obj.updateDynamic("unshift")(js.Any.fromFunction1((t0: FieldValue) => unshift(t0).runNow()))
    __obj.asInstanceOf[FieldArrayFieldsProps[FieldValue]]
  }
}

