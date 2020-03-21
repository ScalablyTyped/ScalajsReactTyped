package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFileAndObjVerOfMultipleFiles extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjectFileAndObjVer: IObjectFileAndObjVer): Unit
  def Clone(): IObjectFileAndObjVerOfMultipleFiles
  def Item(Index: Double): IObjectFileAndObjVer
  def Remove(Index: Double): Unit
}

object IObjectFileAndObjVerOfMultipleFiles {
  @scala.inline
  def apply(
    Add: (Double, IObjectFileAndObjVer) => Callback,
    Clone: CallbackTo[IObjectFileAndObjVerOfMultipleFiles],
    Count: Double,
    Item: Double => CallbackTo[IObjectFileAndObjVer],
    Remove: Double => Callback
  ): IObjectFileAndObjVerOfMultipleFiles = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IObjectFileAndObjVer) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjectFileAndObjVerOfMultipleFiles]
  }
}

