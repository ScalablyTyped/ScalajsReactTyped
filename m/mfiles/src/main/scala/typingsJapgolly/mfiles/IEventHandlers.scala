package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventHandlers extends js.Object {
  val Count: Double
  def Add(Index: Double, EventHandler: IEventHandler): Unit
  def Clone(): IEventHandlers
  def GetIndexByGUID(EventHandlerGUID: String): Double
  def Item(Index: Double): IEventHandler
  def Remove(Index: Double): Unit
}

object IEventHandlers {
  @scala.inline
  def apply(
    Add: (Double, IEventHandler) => Callback,
    Clone: CallbackTo[IEventHandlers],
    Count: Double,
    GetIndexByGUID: String => CallbackTo[Double],
    Item: Double => CallbackTo[IEventHandler],
    Remove: Double => Callback
  ): IEventHandlers = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IEventHandler) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetIndexByGUID")(js.Any.fromFunction1((t0: java.lang.String) => GetIndexByGUID(t0).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IEventHandlers]
  }
}

