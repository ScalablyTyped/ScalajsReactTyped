package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobTriggers extends js.Object {
  val Count: Double
  def Add(Index: Double, ScheduledJobTrigger: IScheduledJobTrigger): Unit
  def Clone(): IScheduledJobTriggers
  def Item(Index: Double): IScheduledJobTrigger
  def Remove(Index: Double): Unit
}

object IScheduledJobTriggers {
  @scala.inline
  def apply(
    Add: (Double, IScheduledJobTrigger) => Callback,
    Clone: CallbackTo[IScheduledJobTriggers],
    Count: Double,
    Item: Double => CallbackTo[IScheduledJobTrigger],
    Remove: Double => Callback
  ): IScheduledJobTriggers = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IScheduledJobTrigger) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IScheduledJobTriggers]
  }
}

