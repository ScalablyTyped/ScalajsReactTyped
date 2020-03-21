package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ColorPicker")
@js.native
class ColorPicker protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ColorPickerOptions) = this()
  @JSName("options")
  var options_ColorPicker: ColorPickerOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def color(): Unit = js.native
  def color(color: Color): Unit = js.native
  @JSName("color")
  def color_Color(): Color = js.native
  def enable(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  def open(): Unit = js.native
  def toggle(): Unit = js.native
  def value(): String = js.native
  def value(color: String): Unit = js.native
  @JSName("value")
  def value_Unit(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.ColorPicker")
@js.native
object ColorPicker extends js.Object {
  var fn: ColorPicker = js.native
  def extend(proto: js.Object): ColorPicker = js.native
}

