package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.DateTimePicker")
@js.native
class DateTimePicker protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DateTimePickerOptions) = this()
  @JSName("options")
  var options_DateTimePicker: DateTimePickerOptions = js.native
  var wrapper: JQuery = js.native
  def close(view: String): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  def max(): js.Date = js.native
  def max(value: String): Unit = js.native
  def max(value: Date): Unit = js.native
  def min(): js.Date = js.native
  def min(value: String): Unit = js.native
  def min(value: Date): Unit = js.native
  def open(view: String): Unit = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def toggle(view: String): Unit = js.native
  def value(): js.Date = js.native
  def value(value: String): Unit = js.native
  def value(value: Date): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.DateTimePicker")
@js.native
object DateTimePicker extends js.Object {
  var fn: DateTimePicker = js.native
  def extend(proto: js.Object): DateTimePicker = js.native
}

