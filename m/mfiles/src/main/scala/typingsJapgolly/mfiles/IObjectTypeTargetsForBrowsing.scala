package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeTargetsForBrowsing extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing): Unit
  def Clone(): IObjectTypeTargetsForBrowsing
  def Item(Index: Double): IObjectTypeTargetForBrowsing
  def Remove(Index: Double): Unit
}

object IObjectTypeTargetsForBrowsing {
  @scala.inline
  def apply(
    Add: (Double, IObjectTypeTargetForBrowsing) => Callback,
    Clone: CallbackTo[IObjectTypeTargetsForBrowsing],
    Count: Double,
    Item: Double => CallbackTo[IObjectTypeTargetForBrowsing],
    Remove: Double => Callback
  ): IObjectTypeTargetsForBrowsing = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IObjectTypeTargetForBrowsing) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjectTypeTargetsForBrowsing]
  }
}

