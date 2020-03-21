package typingsJapgolly.dayjs.isoWeeksInYearMod.dayjsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def isoWeeksInYear(): Double
}

object Dayjs {
  @scala.inline
  def apply(isoWeeksInYear: CallbackTo[Double]): Dayjs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isoWeeksInYear")(isoWeeksInYear.toJsFn)
    __obj.asInstanceOf[Dayjs]
  }
}

