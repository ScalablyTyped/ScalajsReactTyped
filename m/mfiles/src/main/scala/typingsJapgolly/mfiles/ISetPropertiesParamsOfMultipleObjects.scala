package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetPropertiesParamsOfMultipleObjects extends js.Object {
  val Count: Double
  def Add(Index: Double, SetPropertiesParams: ISetPropertiesParams): Unit
  def Clone(): ISetPropertiesParamsOfMultipleObjects
  def Item(Index: Double): ISetPropertiesParams
  def Remove(Index: Double): Unit
}

object ISetPropertiesParamsOfMultipleObjects {
  @scala.inline
  def apply(
    Add: (Double, ISetPropertiesParams) => Callback,
    Clone: CallbackTo[ISetPropertiesParamsOfMultipleObjects],
    Count: Double,
    Item: Double => CallbackTo[ISetPropertiesParams],
    Remove: Double => Callback
  ): ISetPropertiesParamsOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.ISetPropertiesParams) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[ISetPropertiesParamsOfMultipleObjects]
  }
}

