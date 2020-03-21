package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectClasses extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjectClass: IObjectClass): Unit
  def Clone(): IObjectClasses
  def Item(Index: Double): IObjectClass
  def Remove(Index: Double): Unit
}

object IObjectClasses {
  @scala.inline
  def apply(
    Add: (Double, IObjectClass) => Callback,
    Clone: CallbackTo[IObjectClasses],
    Count: Double,
    Item: Double => CallbackTo[IObjectClass],
    Remove: Double => Callback
  ): IObjectClasses = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IObjectClass) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjectClasses]
  }
}

