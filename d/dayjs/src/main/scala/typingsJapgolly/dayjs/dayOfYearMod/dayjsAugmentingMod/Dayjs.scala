package typingsJapgolly.dayjs.dayOfYearMod.dayjsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def dayOfYear(): Double
}

object Dayjs {
  @scala.inline
  def apply(dayOfYear: CallbackTo[Double]): Dayjs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dayOfYear")(dayOfYear.toJsFn)
    __obj.asInstanceOf[Dayjs]
  }
}

