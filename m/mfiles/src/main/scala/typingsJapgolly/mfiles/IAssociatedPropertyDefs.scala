package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociatedPropertyDefs extends js.Object {
  val Count: Double
  def Add(Index: Double, AssociatedPropertyDef: IAssociatedPropertyDef): Unit
  def Clone(): IAssociatedPropertyDefs
  def Item(Index: Double): IAssociatedPropertyDef
  def Remove(Index: Double): Unit
}

object IAssociatedPropertyDefs {
  @scala.inline
  def apply(
    Add: (Double, IAssociatedPropertyDef) => Callback,
    Clone: CallbackTo[IAssociatedPropertyDefs],
    Count: Double,
    Item: Double => CallbackTo[IAssociatedPropertyDef],
    Remove: Double => Callback
  ): IAssociatedPropertyDefs = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IAssociatedPropertyDef) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IAssociatedPropertyDefs]
  }
}

