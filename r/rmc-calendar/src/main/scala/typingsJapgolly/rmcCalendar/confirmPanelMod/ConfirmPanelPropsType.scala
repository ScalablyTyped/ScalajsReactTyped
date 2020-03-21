package typingsJapgolly.rmcCalendar.confirmPanelMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.one
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmPanelPropsType extends js.Object {
  var disableBtn: js.UndefOr[Boolean] = js.undefined
  var endDateTime: js.UndefOr[js.Date] = js.undefined
  var formatStr: js.UndefOr[String] = js.undefined
  var locale: Locale
  var onlyConfirm: js.UndefOr[Boolean] = js.undefined
  var startDateTime: js.UndefOr[js.Date] = js.undefined
  var `type`: js.UndefOr[one | range] = js.undefined
  def onConfirm(): Unit
}

object ConfirmPanelPropsType {
  @scala.inline
  def apply(
    locale: Locale,
    onConfirm: Callback,
    disableBtn: js.UndefOr[Boolean] = js.undefined,
    endDateTime: js.Date = null,
    formatStr: String = null,
    onlyConfirm: js.UndefOr[Boolean] = js.undefined,
    startDateTime: js.Date = null,
    `type`: one | range = null
  ): ConfirmPanelPropsType = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("onConfirm")(onConfirm.toJsFn)
    if (!js.isUndefined(disableBtn)) __obj.updateDynamic("disableBtn")(disableBtn.asInstanceOf[js.Any])
    if (endDateTime != null) __obj.updateDynamic("endDateTime")(endDateTime.asInstanceOf[js.Any])
    if (formatStr != null) __obj.updateDynamic("formatStr")(formatStr.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyConfirm)) __obj.updateDynamic("onlyConfirm")(onlyConfirm.asInstanceOf[js.Any])
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmPanelPropsType]
  }
}

