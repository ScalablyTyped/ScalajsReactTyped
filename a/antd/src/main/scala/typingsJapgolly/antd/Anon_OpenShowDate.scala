package typingsJapgolly.antd

import typingsJapgolly.antd.libDateDashPickerInterfaceMod.RangePickerValue
import typingsJapgolly.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OpenShowDate extends js.Object {
  var open: js.UndefOr[Boolean] = js.undefined
  var showDate: js.UndefOr[
    js.Array[js.UndefOr[Moment]] | (js.Tuple2[js.UndefOr[Moment], js.UndefOr[Moment]])
  ] = js.undefined
  var value: RangePickerValue
}

object Anon_OpenShowDate {
  @scala.inline
  def apply(
    value: RangePickerValue,
    open: js.UndefOr[Boolean] = js.undefined,
    showDate: js.Array[js.UndefOr[Moment]] | (js.Tuple2[js.UndefOr[Moment], js.UndefOr[Moment]]) = null
  ): Anon_OpenShowDate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (showDate != null) __obj.updateDynamic("showDate")(showDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OpenShowDate]
  }
}

