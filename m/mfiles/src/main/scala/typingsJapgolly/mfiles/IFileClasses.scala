package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileClasses extends js.Object {
  val Count: Double
  def Add(Index: Double, FileClass: IFileClass): Unit
  def Clone(): IFileClasses
  def Item(Index: Double): IFileClass
  def Remove(Index: Double): Unit
}

object IFileClasses {
  @scala.inline
  def apply(
    Add: (Double, IFileClass) => Callback,
    Clone: CallbackTo[IFileClasses],
    Count: Double,
    Item: Double => CallbackTo[IFileClass],
    Remove: Double => Callback
  ): IFileClasses = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IFileClass) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IFileClasses]
  }
}

