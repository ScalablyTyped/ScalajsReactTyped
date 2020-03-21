package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeColumnMappings extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjectTypeColumnMapping: IObjectTypeColumnMapping): Unit
  def Clone(): IObjectTypeColumnMappings
  def Item(Index: Double): IObjectTypeColumnMapping
  def Remove(Index: Double): Unit
}

object IObjectTypeColumnMappings {
  @scala.inline
  def apply(
    Add: (Double, IObjectTypeColumnMapping) => Callback,
    Clone: CallbackTo[IObjectTypeColumnMappings],
    Count: Double,
    Item: Double => CallbackTo[IObjectTypeColumnMapping],
    Remove: Double => Callback
  ): IObjectTypeColumnMappings = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IObjectTypeColumnMapping) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjectTypeColumnMappings]
  }
}

