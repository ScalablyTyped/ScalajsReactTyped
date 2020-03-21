package typingsJapgolly.momentRange.mod.momentAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.momentRange.mod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moment extends js.Object {
  def isRange(range: js.Any): Boolean
  def within(range: DateRange): Boolean
}

object Moment {
  @scala.inline
  def apply(isRange: js.Any => CallbackTo[Boolean], within: DateRange => CallbackTo[Boolean]): Moment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isRange")(js.Any.fromFunction1((t0: js.Any) => isRange(t0).runNow()))
    __obj.updateDynamic("within")(js.Any.fromFunction1((t0: typingsJapgolly.momentRange.mod.DateRange) => within(t0).runNow()))
    __obj.asInstanceOf[Moment]
  }
}

