package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIDs extends js.Object {
  val Count: Double
  def Add(Index: Double, ID: Double): Unit
  def Clone(): IIDs
  def IndexOf(ID: Double): Double
  def Item(Index: Double): Double
  def Remove(Index: Double): Unit
  def RemoveAll(ID: Double): Double
}

object IIDs {
  @scala.inline
  def apply(
    Add: (Double, Double) => Callback,
    Clone: CallbackTo[IIDs],
    Count: Double,
    IndexOf: Double => CallbackTo[Double],
    Item: Double => CallbackTo[Double],
    Remove: Double => Callback,
    RemoveAll: Double => CallbackTo[Double]
  ): IIDs = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("IndexOf")(js.Any.fromFunction1((t0: scala.Double) => IndexOf(t0).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.updateDynamic("RemoveAll")(js.Any.fromFunction1((t0: scala.Double) => RemoveAll(t0).runNow()))
    __obj.asInstanceOf[IIDs]
  }
}

