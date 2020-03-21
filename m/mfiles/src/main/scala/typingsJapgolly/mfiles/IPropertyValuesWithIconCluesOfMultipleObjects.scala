package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesWithIconCluesOfMultipleObjects extends js.Object {
  val Count: Double
  def Clone(): IPropertyValuesWithIconCluesOfMultipleObjects
  def Item(Index: Double): IPropertyValuesWithIconClues
}

object IPropertyValuesWithIconCluesOfMultipleObjects {
  @scala.inline
  def apply(
    Clone: CallbackTo[IPropertyValuesWithIconCluesOfMultipleObjects],
    Count: Double,
    Item: Double => CallbackTo[IPropertyValuesWithIconClues]
  ): IPropertyValuesWithIconCluesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[IPropertyValuesWithIconCluesOfMultipleObjects]
  }
}

