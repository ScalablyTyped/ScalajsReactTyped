package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import typingsJapgolly.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.MultiPath")
@js.native
class MultiPath ()
  extends typingsJapgolly.kendoUi.kendo.drawing.Element {
  def this(options: MultiPathOptions) = this()
  @JSName("options")
  var options_MultiPath: MultiPathOptions = js.native
  var paths: js.Any = js.native
  def close(): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def fill(color: String): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def fill(color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: js.Any): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: js.Any, y: Double): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Double): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Point): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Point, y: Double): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: js.Any): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: js.Any, y: Double): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Double): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Point): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Point, y: Double): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: Double): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
}

