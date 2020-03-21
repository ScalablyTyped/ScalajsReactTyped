package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersionAndPropertiesOfMultipleObjects extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjectVersionAndProperties: IObjectVersionAndProperties): Unit
  def Clone(): IObjectVersionAndPropertiesOfMultipleObjects
  def Item(Index: Double): IObjectVersionAndProperties
  def Remove(Index: Double): Unit
}

object IObjectVersionAndPropertiesOfMultipleObjects {
  @scala.inline
  def apply(
    Add: (Double, IObjectVersionAndProperties) => Callback,
    Clone: CallbackTo[IObjectVersionAndPropertiesOfMultipleObjects],
    Count: Double,
    Item: Double => CallbackTo[IObjectVersionAndProperties],
    Remove: Double => Callback
  ): IObjectVersionAndPropertiesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IObjectVersionAndProperties) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjectVersionAndPropertiesOfMultipleObjects]
  }
}

