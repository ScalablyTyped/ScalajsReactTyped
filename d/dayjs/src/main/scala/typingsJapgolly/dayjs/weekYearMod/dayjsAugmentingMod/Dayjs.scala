package typingsJapgolly.dayjs.weekYearMod.dayjsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def weekYear(): Double
}

object Dayjs {
  @scala.inline
  def apply(weekYear: CallbackTo[Double]): Dayjs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("weekYear")(weekYear.toJsFn)
    __obj.asInstanceOf[Dayjs]
  }
}

