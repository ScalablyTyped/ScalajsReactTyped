package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileVers extends js.Object {
  val Count: Double
  def Add(Index: Double, FileVer: IFileVer): Unit
  def Clone(): IFileVers
  def Item(Index: Double): IFileVer
  def Remove(Index: Double): Unit
}

object IFileVers {
  @scala.inline
  def apply(
    Add: (Double, IFileVer) => Callback,
    Clone: CallbackTo[IFileVers],
    Count: Double,
    Item: Double => CallbackTo[IFileVer],
    Remove: Double => Callback
  ): IFileVers = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IFileVer) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IFileVers]
  }
}

