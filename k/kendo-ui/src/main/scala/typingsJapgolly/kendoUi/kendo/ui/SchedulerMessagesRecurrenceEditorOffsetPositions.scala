package typingsJapgolly.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorOffsetPositions extends js.Object {
  var first: js.UndefOr[String] = js.undefined
  var fourth: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[String] = js.undefined
  var second: js.UndefOr[String] = js.undefined
  var third: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorOffsetPositions {
  @scala.inline
  def apply(
    first: String = null,
    fourth: String = null,
    last: String = null,
    second: String = null,
    third: String = null
  ): SchedulerMessagesRecurrenceEditorOffsetPositions = {
    val __obj = js.Dynamic.literal()
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (fourth != null) __obj.updateDynamic("fourth")(fourth.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (third != null) __obj.updateDynamic("third")(third.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorOffsetPositions]
  }
}

