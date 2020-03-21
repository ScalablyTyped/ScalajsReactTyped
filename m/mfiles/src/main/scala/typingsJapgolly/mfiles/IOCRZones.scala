package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZones extends js.Object {
  val Count: Double
  def Add(Index: Double, OCRZone: IOCRZone): Unit
  def Clone(): IOCRZones
  def Item(Index: Double): IOCRZone
  def Remove(Index: Double): Unit
}

object IOCRZones {
  @scala.inline
  def apply(
    Add: (Double, IOCRZone) => Callback,
    Clone: CallbackTo[IOCRZones],
    Count: Double,
    Item: Double => CallbackTo[IOCRZone],
    Remove: Double => Callback
  ): IOCRZones = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IOCRZone) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IOCRZones]
  }
}

