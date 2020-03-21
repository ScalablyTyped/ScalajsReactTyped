package typingsJapgolly.rcPicker.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rcPicker.rcPickerStrings.time
  - typingsJapgolly.rcPicker.rcPickerStrings.date
  - typingsJapgolly.rcPicker.rcPickerStrings.week
  - typingsJapgolly.rcPicker.rcPickerStrings.month
  - typingsJapgolly.rcPicker.rcPickerStrings.year
  - typingsJapgolly.rcPicker.rcPickerStrings.decade
*/
trait PanelMode extends js.Object

object PanelMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsJapgolly.rcPicker.rcPickerStrings.date = this.cast("date")
  @scala.inline
  def decade: typingsJapgolly.rcPicker.rcPickerStrings.decade = this.cast("decade")
  @scala.inline
  def month: typingsJapgolly.rcPicker.rcPickerStrings.month = this.cast("month")
  @scala.inline
  def time: typingsJapgolly.rcPicker.rcPickerStrings.time = this.cast("time")
  @scala.inline
  def week: typingsJapgolly.rcPicker.rcPickerStrings.week = this.cast("week")
  @scala.inline
  def year: typingsJapgolly.rcPicker.rcPickerStrings.year = this.cast("year")
}

