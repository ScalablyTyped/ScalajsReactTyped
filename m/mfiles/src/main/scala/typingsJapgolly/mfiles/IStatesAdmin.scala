package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatesAdmin extends js.Object {
  val Count: Double
  def Add(Index: Double, StateAdmin: IStateAdmin): Unit
  def Item(Index: Double): IStateAdmin
  def Remove(Index: Double): Unit
}

object IStatesAdmin {
  @scala.inline
  def apply(
    Add: (Double, IStateAdmin) => Callback,
    Count: Double,
    Item: Double => CallbackTo[IStateAdmin],
    Remove: Double => Callback
  ): IStatesAdmin = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IStateAdmin) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IStatesAdmin]
  }
}

