package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjVers extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjVer: IObjVer): Unit
  def Clone(): IObjVers
  def GetAllDistinctObjIDs(): IObjIDs
  def Item(Index: Double): IObjVer
  def Remove(Index: Double): Unit
  def ToJSON(): String
}

object IObjVers {
  @scala.inline
  def apply(
    Add: (Double, IObjVer) => Callback,
    Clone: CallbackTo[IObjVers],
    Count: Double,
    GetAllDistinctObjIDs: CallbackTo[IObjIDs],
    Item: Double => CallbackTo[IObjVer],
    Remove: Double => Callback,
    ToJSON: CallbackTo[String]
  ): IObjVers = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IObjVer) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetAllDistinctObjIDs")(GetAllDistinctObjIDs.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.updateDynamic("ToJSON")(ToJSON.toJsFn)
    __obj.asInstanceOf[IObjVers]
  }
}

