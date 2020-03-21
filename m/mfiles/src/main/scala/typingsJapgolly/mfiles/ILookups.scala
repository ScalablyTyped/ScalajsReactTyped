package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookups extends js.Object {
  val Count: Double
  def Add(Index: Double, Lookup: ILookup): Unit
  def Clone(): ILookups
  def CloneFrom(Lookups: ILookups): Unit
  def GetLookupByItem(Item: Double): ILookup
  def GetLookupIndexByItem(Item: Double): Double
  def Item(Index: Double): ILookup
  def Remove(Index: Double): Unit
}

object ILookups {
  @scala.inline
  def apply(
    Add: (Double, ILookup) => Callback,
    Clone: CallbackTo[ILookups],
    CloneFrom: ILookups => Callback,
    Count: Double,
    GetLookupByItem: Double => CallbackTo[ILookup],
    GetLookupIndexByItem: Double => CallbackTo[Double],
    Item: Double => CallbackTo[ILookup],
    Remove: Double => Callback
  ): ILookups = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.ILookup) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ILookups) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("GetLookupByItem")(js.Any.fromFunction1((t0: scala.Double) => GetLookupByItem(t0).runNow()))
    __obj.updateDynamic("GetLookupIndexByItem")(js.Any.fromFunction1((t0: scala.Double) => GetLookupIndexByItem(t0).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[ILookups]
  }
}

