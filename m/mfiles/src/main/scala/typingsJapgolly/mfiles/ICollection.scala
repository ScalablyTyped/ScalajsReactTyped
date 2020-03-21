package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollection extends js.Object {
  val Count: Double
  val Events: IEvents
  def Clear(): Unit
  def Find(item: js.Any): Double
  def GetAt(pos: Double): js.Any
  def MoveTo(pos: Double, newPos: Double): Unit
  def NewTo(pos: Double, replace: Boolean): js.Any
  def PutTo(pos: Double, replace: Boolean, item: js.Any): Unit
  def RemoveAt(pos: Double): Unit
}

object ICollection {
  @scala.inline
  def apply(
    Clear: Callback,
    Count: Double,
    Events: IEvents,
    Find: js.Any => CallbackTo[Double],
    GetAt: Double => CallbackTo[js.Any],
    MoveTo: (Double, Double) => Callback,
    NewTo: (Double, Boolean) => CallbackTo[js.Any],
    PutTo: (Double, Boolean, js.Any) => Callback,
    RemoveAt: Double => Callback
  ): ICollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any])
    __obj.updateDynamic("Clear")(Clear.toJsFn)
    __obj.updateDynamic("Find")(js.Any.fromFunction1((t0: js.Any) => Find(t0).runNow()))
    __obj.updateDynamic("GetAt")(js.Any.fromFunction1((t0: scala.Double) => GetAt(t0).runNow()))
    __obj.updateDynamic("MoveTo")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => MoveTo(t0, t1).runNow()))
    __obj.updateDynamic("NewTo")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => NewTo(t0, t1).runNow()))
    __obj.updateDynamic("PutTo")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Boolean, t2: js.Any) => PutTo(t0, t1, t2).runNow()))
    __obj.updateDynamic("RemoveAt")(js.Any.fromFunction1((t0: scala.Double) => RemoveAt(t0).runNow()))
    __obj.asInstanceOf[ICollection]
  }
}

