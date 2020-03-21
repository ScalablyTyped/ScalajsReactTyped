package typingsJapgolly.dayjs.isLeapYearMod.dayjsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def isLeapYear(): Boolean
}

object Dayjs {
  @scala.inline
  def apply(isLeapYear: CallbackTo[Boolean]): Dayjs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isLeapYear")(isLeapYear.toJsFn)
    __obj.asInstanceOf[Dayjs]
  }
}

