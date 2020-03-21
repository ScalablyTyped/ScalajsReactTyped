package typingsJapgolly.reduxForm.reduxFormMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedArrayProps extends js.Object {
  def insert(field: String, index: Double, value: js.Any): Unit
  def move(field: String, from: Double, to: Double): Unit
  def pop(field: String): Unit
  def push(field: String, value: js.Any): Unit
  def remove(field: String, index: Double): Unit
  def removeAll(field: String): Unit
  def shift(field: String): Unit
  def splice(field: String, index: Double, removeNum: Double, value: js.Any): Unit
  def swap(field: String, indexA: Double, indexB: Double): Unit
  def unshift(field: String, value: js.Any): Unit
}

object InjectedArrayProps {
  @scala.inline
  def apply(
    insert: (String, Double, js.Any) => Callback,
    move: (String, Double, Double) => Callback,
    pop: String => Callback,
    push: (String, js.Any) => Callback,
    remove: (String, Double) => Callback,
    removeAll: String => Callback,
    shift: String => Callback,
    splice: (String, Double, Double, js.Any) => Callback,
    swap: (String, Double, Double) => Callback,
    unshift: (String, js.Any) => Callback
  ): InjectedArrayProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: js.Any) => insert(t0, t1, t2).runNow()))
    __obj.updateDynamic("move")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => move(t0, t1, t2).runNow()))
    __obj.updateDynamic("pop")(js.Any.fromFunction1((t0: java.lang.String) => pop(t0).runNow()))
    __obj.updateDynamic("push")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => push(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => remove(t0, t1).runNow()))
    __obj.updateDynamic("removeAll")(js.Any.fromFunction1((t0: java.lang.String) => removeAll(t0).runNow()))
    __obj.updateDynamic("shift")(js.Any.fromFunction1((t0: java.lang.String) => shift(t0).runNow()))
    __obj.updateDynamic("splice")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: js.Any) => splice(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("swap")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => swap(t0, t1, t2).runNow()))
    __obj.updateDynamic("unshift")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => unshift(t0, t1).runNow()))
    __obj.asInstanceOf[InjectedArrayProps]
  }
}

