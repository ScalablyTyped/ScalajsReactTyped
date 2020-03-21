package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import typingsJapgolly.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Path")
@js.native
class Path ()
  extends typingsJapgolly.kendoUi.kendo.drawing.Element {
  def this(options: PathOptions) = this()
  @JSName("options")
  var options_Path: PathOptions = js.native
  var segments: js.Any = js.native
  def close(): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def fill(color: String): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def fill(color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: js.Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: js.Any, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Point, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: js.Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: js.Any, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Point): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Point, y: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.drawing.Path")
@js.native
object Path extends js.Object {
  def fromArc(arc: typingsJapgolly.kendoUi.kendo.geometry.Arc): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def fromArc(arc: typingsJapgolly.kendoUi.kendo.geometry.Arc, options: js.Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def fromPoints(points: js.Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def fromPoints(points: js.Any, options: js.Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def fromRect(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def fromRect(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect, options: js.Any): typingsJapgolly.kendoUi.kendo.drawing.Path = js.native
  def parse(svgPath: String): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
  def parse(svgPath: String, options: js.Any): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = js.native
}

