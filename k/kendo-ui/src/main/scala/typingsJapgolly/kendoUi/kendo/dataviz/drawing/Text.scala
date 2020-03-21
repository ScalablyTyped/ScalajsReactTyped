package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import typingsJapgolly.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Text")
@js.native
class Text protected ()
  extends typingsJapgolly.kendoUi.kendo.drawing.Element {
  def this(content: String, position: Point) = this()
  def this(content: String, position: Point, options: TextOptions) = this()
  @JSName("options")
  var options_Text: TextOptions = js.native
  def content(): String = js.native
  def content(value: String): Unit = js.native
  def fill(color: String): typingsJapgolly.kendoUi.kendo.drawing.Text = js.native
  def fill(color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Text = js.native
  def position(): Point = js.native
  def position(value: Point): Unit = js.native
  def stroke(color: String): typingsJapgolly.kendoUi.kendo.drawing.Text = js.native
  def stroke(color: String, width: Double): typingsJapgolly.kendoUi.kendo.drawing.Text = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Text = js.native
}

