package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Circle")
@js.native
class Circle protected ()
  extends typingsJapgolly.kendoUi.kendo.drawing.Element {
  def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Circle) = this()
  def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Circle, options: CircleOptions) = this()
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  def fill(color: String): typingsJapgolly.kendoUi.kendo.drawing.Circle = js.native
  def fill(color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Circle = js.native
  def geometry(): typingsJapgolly.kendoUi.kendo.geometry.Circle = js.native
  def geometry(value: typingsJapgolly.kendoUi.kendo.geometry.Circle): Unit = js.native
  def stroke(color: String): typingsJapgolly.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double): typingsJapgolly.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Circle = js.native
}

