package typingsJapgolly.kendoUi.kendo.dataviz.geometry

import typingsJapgolly.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
class Point protected () extends Observable_ {
  def this(x: Double, y: Double) = this()
  var options: PointOptions = js.native
  var x: Double = js.native
  var y: Double = js.native
  def distanceTo(point: typingsJapgolly.kendoUi.kendo.geometry.Point): Double = js.native
  def equals(other: typingsJapgolly.kendoUi.kendo.geometry.Point): Boolean = js.native
  def getX(): Double = js.native
  def getY(): Double = js.native
  def move(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: js.Any): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: typingsJapgolly.kendoUi.kendo.geometry.Point): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def round(digits: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def scale(scaleX: Double, scaleY: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def scaleCopy(scaleX: Double, scaleY: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def setX(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def setY(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def toArray(digits: Double): js.Any = js.native
  def toString(digits: Double, separator: String): String = js.native
  def transform(tansformation: typingsJapgolly.kendoUi.kendo.geometry.Transformation): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def transformCopy(tansformation: typingsJapgolly.kendoUi.kendo.geometry.Transformation): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def translate(dx: Double, dy: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def translateWith(vector: js.Any): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def translateWith(vector: typingsJapgolly.kendoUi.kendo.geometry.Point): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
object Point extends js.Object {
  def create(x: js.Any, y: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def create(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def create(x: typingsJapgolly.kendoUi.kendo.geometry.Point, y: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def max(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def maxPoint(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def min(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def minPoint(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
}

