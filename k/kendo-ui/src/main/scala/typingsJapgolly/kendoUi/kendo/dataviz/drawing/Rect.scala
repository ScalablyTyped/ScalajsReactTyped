package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Rect")
@js.native
class Rect protected ()
  extends typingsJapgolly.kendoUi.kendo.drawing.Element {
  def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Rect) = this()
  def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  @JSName("options")
  var options_Rect: RectOptions = js.native
  def fill(color: String): typingsJapgolly.kendoUi.kendo.drawing.Rect = js.native
  def fill(color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Rect = js.native
  def geometry(): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def geometry(value: typingsJapgolly.kendoUi.kendo.geometry.Rect): Unit = js.native
  def stroke(color: String): typingsJapgolly.kendoUi.kendo.drawing.Rect = js.native
  def stroke(color: String, width: Double): typingsJapgolly.kendoUi.kendo.drawing.Rect = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Rect = js.native
}

