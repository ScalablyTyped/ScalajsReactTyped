package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrings extends js.Object {
  val Count: Double
  def Add(Index: Double, Item: String): Unit
  def Clone(): IStrings
  def CloneFrom(Strings: IStrings): Unit
  def Item(Index: Double): String
  def Join(Separator: String): String
  def Remove(Index: Double): Unit
}

object IStrings {
  @scala.inline
  def apply(
    Add: (Double, String) => Callback,
    Clone: CallbackTo[IStrings],
    CloneFrom: IStrings => Callback,
    Count: Double,
    Item: Double => CallbackTo[String],
    Join: String => CallbackTo[String],
    Remove: Double => Callback
  ): IStrings = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IStrings) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Join")(js.Any.fromFunction1((t0: java.lang.String) => Join(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IStrings]
  }
}

