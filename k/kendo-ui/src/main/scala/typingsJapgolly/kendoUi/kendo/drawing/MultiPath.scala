package typingsJapgolly.kendoUi.kendo.drawing

import typingsJapgolly.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.MultiPath")
@js.native
class MultiPath () extends Element {
  def this(options: MultiPathOptions) = this()
  @JSName("options")
  var options_MultiPath: MultiPathOptions = js.native
  var paths: js.Any = js.native
  def close(): MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): MultiPath = js.native
  def fill(color: String): MultiPath = js.native
  def fill(color: String, opacity: Double): MultiPath = js.native
  def lineTo(x: js.Any): MultiPath = js.native
  def lineTo(x: js.Any, y: Double): MultiPath = js.native
  def lineTo(x: Double): MultiPath = js.native
  def lineTo(x: Double, y: Double): MultiPath = js.native
  def lineTo(x: Point): MultiPath = js.native
  def lineTo(x: Point, y: Double): MultiPath = js.native
  def moveTo(x: js.Any): MultiPath = js.native
  def moveTo(x: js.Any, y: Double): MultiPath = js.native
  def moveTo(x: Double): MultiPath = js.native
  def moveTo(x: Double, y: Double): MultiPath = js.native
  def moveTo(x: Point): MultiPath = js.native
  def moveTo(x: Point, y: Double): MultiPath = js.native
  def stroke(color: String): MultiPath = js.native
  def stroke(color: String, width: Double): MultiPath = js.native
  def stroke(color: String, width: Double, opacity: Double): MultiPath = js.native
}

