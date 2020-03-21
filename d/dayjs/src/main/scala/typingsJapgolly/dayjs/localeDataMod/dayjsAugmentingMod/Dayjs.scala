package typingsJapgolly.dayjs.localeDataMod.dayjsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def localeData(): js.Any
}

object Dayjs {
  @scala.inline
  def apply(localeData: CallbackTo[js.Any]): Dayjs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("localeData")(localeData.toJsFn)
    __obj.asInstanceOf[Dayjs]
  }
}

