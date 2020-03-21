package typingsJapgolly.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmpmWheelLabel extends js.Object {
  var ampmWheelLabel: js.UndefOr[String] = js.undefined
  var cancelText: js.UndefOr[String] = js.undefined
  var currentTimeText: js.UndefOr[String] = js.undefined
  var dateTimeRange: js.UndefOr[AnonMessageDetail] = js.undefined
  var hourWheelLabel: js.UndefOr[String] = js.undefined
  var minuteWheelLabel: js.UndefOr[String] = js.undefined
  var okText: js.UndefOr[String] = js.undefined
  var regexp: js.UndefOr[AnonMessageSummary] = js.undefined
  var required: js.UndefOr[AnonHint] = js.undefined
  var tooltipTime: js.UndefOr[String] = js.undefined
  var tooltipTimeDisabled: js.UndefOr[String] = js.undefined
}

object AnonAmpmWheelLabel {
  @scala.inline
  def apply(
    ampmWheelLabel: String = null,
    cancelText: String = null,
    currentTimeText: String = null,
    dateTimeRange: AnonMessageDetail = null,
    hourWheelLabel: String = null,
    minuteWheelLabel: String = null,
    okText: String = null,
    regexp: AnonMessageSummary = null,
    required: AnonHint = null,
    tooltipTime: String = null,
    tooltipTimeDisabled: String = null
  ): AnonAmpmWheelLabel = {
    val __obj = js.Dynamic.literal()
    if (ampmWheelLabel != null) __obj.updateDynamic("ampmWheelLabel")(ampmWheelLabel.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (currentTimeText != null) __obj.updateDynamic("currentTimeText")(currentTimeText.asInstanceOf[js.Any])
    if (dateTimeRange != null) __obj.updateDynamic("dateTimeRange")(dateTimeRange.asInstanceOf[js.Any])
    if (hourWheelLabel != null) __obj.updateDynamic("hourWheelLabel")(hourWheelLabel.asInstanceOf[js.Any])
    if (minuteWheelLabel != null) __obj.updateDynamic("minuteWheelLabel")(minuteWheelLabel.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (tooltipTime != null) __obj.updateDynamic("tooltipTime")(tooltipTime.asInstanceOf[js.Any])
    if (tooltipTimeDisabled != null) __obj.updateDynamic("tooltipTimeDisabled")(tooltipTimeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmpmWheelLabel]
  }
}

