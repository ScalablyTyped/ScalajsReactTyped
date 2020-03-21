package typingsJapgolly.jqueryUiDatetimepicker

import typingsJapgolly.jqueryUiDatetimepicker.jqueryUiDatetimepickerStrings.formatTime
import typingsJapgolly.jqueryUiDatetimepicker.jqueryUiDatetimepickerStrings.parseDateTime
import typingsJapgolly.jqueryUiDatetimepicker.jqueryUiDatetimepickerStrings.parseTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def datetimepicker(): JQuery = js.native
  def datetimepicker(method: String, methodParameter: js.Any): js.Any = js.native
  def datetimepicker(options: DateTimePickerOptions): JQuery = js.native
  @JSName("datetimepicker")
  def datetimepicker_formatTime(method: formatTime, methodParameter: formatTimeOptions): String = js.native
  @JSName("datetimepicker")
  def datetimepicker_parseDateTime(method: parseDateTime, methodParameter: parseDateTimeOptions): js.Date = js.native
  @JSName("datetimepicker")
  def datetimepicker_parseTime(method: parseTime, methodParameter: parseTimeOptions): Time = js.native
}

