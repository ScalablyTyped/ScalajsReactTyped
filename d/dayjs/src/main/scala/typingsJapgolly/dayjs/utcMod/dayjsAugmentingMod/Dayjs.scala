package typingsJapgolly.dayjs.utcMod.dayjsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def isUTC(): Boolean
  def local(): Dayjs
  def utc(): Dayjs
  def utcOffset(offset: Double): Dayjs
}

object Dayjs {
  @scala.inline
  def apply(
    isUTC: CallbackTo[Boolean],
    local: CallbackTo[Dayjs],
    utc: CallbackTo[Dayjs],
    utcOffset: Double => CallbackTo[Dayjs]
  ): Dayjs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isUTC")(isUTC.toJsFn)
    __obj.updateDynamic("local")(local.toJsFn)
    __obj.updateDynamic("utc")(utc.toJsFn)
    __obj.updateDynamic("utcOffset")(js.Any.fromFunction1((t0: scala.Double) => utcOffset(t0).runNow()))
    __obj.asInstanceOf[Dayjs]
  }
}

