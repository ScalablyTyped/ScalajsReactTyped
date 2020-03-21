package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaultProperties extends js.Object {
  val Count: Double
  def Add(Index: Double, DefaultProperty: IDefaultProperty): Unit
  def Item(Index: Double): IDefaultProperty
  def Remove(Index: Double): Unit
}

object IDefaultProperties {
  @scala.inline
  def apply(
    Add: (Double, IDefaultProperty) => Callback,
    Count: Double,
    Item: Double => CallbackTo[IDefaultProperty],
    Remove: Double => Callback
  ): IDefaultProperties = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IDefaultProperty) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IDefaultProperties]
  }
}

