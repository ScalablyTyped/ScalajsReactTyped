package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesOfMultipleObjects extends js.Object {
  val Count: Double
  def Clone(): IPropertyValuesOfMultipleObjects
  def Item(Index: Double): IPropertyValues
}

object IPropertyValuesOfMultipleObjects {
  @scala.inline
  def apply(
    Clone: CallbackTo[IPropertyValuesOfMultipleObjects],
    Count: Double,
    Item: Double => CallbackTo[IPropertyValues]
  ): IPropertyValuesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[IPropertyValuesOfMultipleObjects]
  }
}

