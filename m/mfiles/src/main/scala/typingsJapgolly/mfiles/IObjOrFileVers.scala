package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjOrFileVers extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjOrFileVer: IObjOrFileVer): Unit
  def Clone(): IObjOrFileVers
  def Item(Index: Double): IObjOrFileVer
  def Remove(Index: Double): Unit
}

object IObjOrFileVers {
  @scala.inline
  def apply(
    Add: (Double, IObjOrFileVer) => Callback,
    Clone: CallbackTo[IObjOrFileVers],
    Count: Double,
    Item: Double => CallbackTo[IObjOrFileVer],
    Remove: Double => Callback
  ): IObjOrFileVers = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IObjOrFileVer) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjOrFileVers]
  }
}

