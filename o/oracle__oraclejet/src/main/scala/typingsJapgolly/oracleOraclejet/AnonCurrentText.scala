package typingsJapgolly.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentText extends js.Object {
  var currentText: js.UndefOr[String] = js.undefined
  var dateRestriction: js.UndefOr[AnonHint] = js.undefined
  var dateTimeRange: js.UndefOr[AnonMessageDetail] = js.undefined
  var nextText: js.UndefOr[String] = js.undefined
  var prevText: js.UndefOr[String] = js.undefined
  var regexp: js.UndefOr[AnonMessageSummary] = js.undefined
  var required: js.UndefOr[AnonHint] = js.undefined
  var tooltipCalendar: js.UndefOr[String] = js.undefined
  var tooltipCalendarDisabled: js.UndefOr[String] = js.undefined
  var tooltipCalendarTime: js.UndefOr[String] = js.undefined
  var tooltipCalendarTimeDisabled: js.UndefOr[String] = js.undefined
  var weekHeader: js.UndefOr[String] = js.undefined
}

object AnonCurrentText {
  @scala.inline
  def apply(
    currentText: String = null,
    dateRestriction: AnonHint = null,
    dateTimeRange: AnonMessageDetail = null,
    nextText: String = null,
    prevText: String = null,
    regexp: AnonMessageSummary = null,
    required: AnonHint = null,
    tooltipCalendar: String = null,
    tooltipCalendarDisabled: String = null,
    tooltipCalendarTime: String = null,
    tooltipCalendarTimeDisabled: String = null,
    weekHeader: String = null
  ): AnonCurrentText = {
    val __obj = js.Dynamic.literal()
    if (currentText != null) __obj.updateDynamic("currentText")(currentText.asInstanceOf[js.Any])
    if (dateRestriction != null) __obj.updateDynamic("dateRestriction")(dateRestriction.asInstanceOf[js.Any])
    if (dateTimeRange != null) __obj.updateDynamic("dateTimeRange")(dateTimeRange.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (tooltipCalendar != null) __obj.updateDynamic("tooltipCalendar")(tooltipCalendar.asInstanceOf[js.Any])
    if (tooltipCalendarDisabled != null) __obj.updateDynamic("tooltipCalendarDisabled")(tooltipCalendarDisabled.asInstanceOf[js.Any])
    if (tooltipCalendarTime != null) __obj.updateDynamic("tooltipCalendarTime")(tooltipCalendarTime.asInstanceOf[js.Any])
    if (tooltipCalendarTimeDisabled != null) __obj.updateDynamic("tooltipCalendarTimeDisabled")(tooltipCalendarTimeDisabled.asInstanceOf[js.Any])
    if (weekHeader != null) __obj.updateDynamic("weekHeader")(weekHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentText]
  }
}

