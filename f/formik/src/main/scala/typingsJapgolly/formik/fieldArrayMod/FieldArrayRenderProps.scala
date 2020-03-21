package typingsJapgolly.formik.fieldArrayMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined formik.formik/dist/FieldArray.ArrayHelpers & {  form  :formik.formik/dist/types.FormikProps<any>,   name  :string} */
trait FieldArrayRenderProps extends js.Object {
  var form: FormikProps[_]
  var name: String
  def handleInsert(index: Double, value: js.Any): js.Function0[Unit]
  def handleMove(from: Double, to: Double): js.Function0[Unit]
  def handlePop(): js.Function0[Unit]
  def handlePush(obj: js.Any): js.Function0[Unit]
  def handleRemove(index: Double): js.Function0[Unit]
  def handleReplace(index: Double, value: js.Any): js.Function0[Unit]
  def handleSwap(indexA: Double, indexB: Double): js.Function0[Unit]
  def handleUnshift(value: js.Any): js.Function0[Unit]
  def insert(index: Double, value: js.Any): Unit
  def move(from: Double, to: Double): Unit
  def pop[T](): js.UndefOr[T]
  def push(obj: js.Any): Unit
  def remove[T](index: Double): js.UndefOr[T]
  def replace(index: Double, value: js.Any): Unit
  def swap(indexA: Double, indexB: Double): Unit
  def unshift(value: js.Any): Double
}

object FieldArrayRenderProps {
  @scala.inline
  def apply(
    form: FormikProps[_],
    handleInsert: (Double, js.Any) => CallbackTo[js.Function0[Unit]],
    handleMove: (Double, Double) => CallbackTo[js.Function0[Unit]],
    handlePop: CallbackTo[js.Function0[Unit]],
    handlePush: js.Any => CallbackTo[js.Function0[Unit]],
    handleRemove: Double => CallbackTo[js.Function0[Unit]],
    handleReplace: (Double, js.Any) => CallbackTo[js.Function0[Unit]],
    handleSwap: (Double, Double) => CallbackTo[js.Function0[Unit]],
    handleUnshift: js.Any => CallbackTo[js.Function0[Unit]],
    insert: (Double, js.Any) => Callback,
    move: (Double, Double) => Callback,
    name: String,
    pop: CallbackTo[js.UndefOr[js.Any]],
    push: js.Any => Callback,
    remove: Double => CallbackTo[js.UndefOr[js.Any]],
    replace: (Double, js.Any) => Callback,
    swap: (Double, Double) => Callback,
    unshift: js.Any => CallbackTo[Double]
  ): FieldArrayRenderProps = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("handleInsert")(js.Any.fromFunction2((t0: scala.Double, t1: js.Any) => handleInsert(t0, t1).runNow()))
    __obj.updateDynamic("handleMove")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => handleMove(t0, t1).runNow()))
    __obj.updateDynamic("handlePop")(handlePop.toJsFn)
    __obj.updateDynamic("handlePush")(js.Any.fromFunction1((t0: js.Any) => handlePush(t0).runNow()))
    __obj.updateDynamic("handleRemove")(js.Any.fromFunction1((t0: scala.Double) => handleRemove(t0).runNow()))
    __obj.updateDynamic("handleReplace")(js.Any.fromFunction2((t0: scala.Double, t1: js.Any) => handleReplace(t0, t1).runNow()))
    __obj.updateDynamic("handleSwap")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => handleSwap(t0, t1).runNow()))
    __obj.updateDynamic("handleUnshift")(js.Any.fromFunction1((t0: js.Any) => handleUnshift(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: scala.Double, t1: js.Any) => insert(t0, t1).runNow()))
    __obj.updateDynamic("move")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => move(t0, t1).runNow()))
    __obj.updateDynamic("pop")(pop.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: js.Any) => push(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.updateDynamic("replace")(js.Any.fromFunction2((t0: scala.Double, t1: js.Any) => replace(t0, t1).runNow()))
    __obj.updateDynamic("swap")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => swap(t0, t1).runNow()))
    __obj.updateDynamic("unshift")(js.Any.fromFunction1((t0: js.Any) => unshift(t0).runNow()))
    __obj.asInstanceOf[FieldArrayRenderProps]
  }
}

