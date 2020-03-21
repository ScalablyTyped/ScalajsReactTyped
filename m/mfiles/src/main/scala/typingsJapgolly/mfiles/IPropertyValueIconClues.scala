package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueIconClues extends js.Object {
  val Count: Double
  def Clone(): IPropertyValueIconClues
  def Item(Index: Double): IPropertyValueIconClue
}

object IPropertyValueIconClues {
  @scala.inline
  def apply(
    Clone: CallbackTo[IPropertyValueIconClues],
    Count: Double,
    Item: Double => CallbackTo[IPropertyValueIconClue]
  ): IPropertyValueIconClues = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[IPropertyValueIconClues]
  }
}

