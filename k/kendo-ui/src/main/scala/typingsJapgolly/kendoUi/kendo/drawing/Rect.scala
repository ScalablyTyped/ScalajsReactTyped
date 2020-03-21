package typingsJapgolly.kendoUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Rect")
@js.native
class Rect protected () extends Element {
  def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Rect) = this()
  def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  @JSName("options")
  var options_Rect: RectOptions = js.native
  def fill(color: String): Rect = js.native
  def fill(color: String, opacity: Double): Rect = js.native
  def geometry(): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def geometry(value: typingsJapgolly.kendoUi.kendo.geometry.Rect): Unit = js.native
  def stroke(color: String): Rect = js.native
  def stroke(color: String, width: Double): Rect = js.native
  def stroke(color: String, width: Double, opacity: Double): Rect = js.native
}

