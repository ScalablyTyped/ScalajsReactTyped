package typingsJapgolly.kendoUi.kendo.geometry

import typingsJapgolly.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.geometry.Arc")
@js.native
class Arc protected () extends Observable_ {
  def this(center: js.Any) = this()
  def this(center: Point) = this()
  def this(center: js.Any, options: ArcOptions) = this()
  def this(center: Point, options: ArcOptions) = this()
  var anticlockwise: Boolean = js.native
  var center: Point = js.native
  var endAngle: Double = js.native
  var options: ArcOptions = js.native
  var radiusX: Double = js.native
  var radiusY: Double = js.native
  var startAngle: Double = js.native
  def bbox(matrix: Matrix): Rect = js.native
  def getAnticlockwise(): Boolean = js.native
  def getCenter(): Point = js.native
  def getEndAngle(): Double = js.native
  def getRadiusX(): Double = js.native
  def getRadiusY(): Double = js.native
  def getStartAngle(): Double = js.native
  def pointAt(angle: Double): Point = js.native
  def setAnticlockwise(value: Boolean): Arc = js.native
  def setCenter(value: Point): Arc = js.native
  def setEndAngle(value: Double): Arc = js.native
  def setRadiusX(value: Double): Arc = js.native
  def setRadiusY(value: Double): Arc = js.native
  def setStartAngle(value: Double): Arc = js.native
}

