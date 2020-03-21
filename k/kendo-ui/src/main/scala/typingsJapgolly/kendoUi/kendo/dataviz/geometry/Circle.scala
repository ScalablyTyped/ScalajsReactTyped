package typingsJapgolly.kendoUi.kendo.dataviz.geometry

import typingsJapgolly.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Circle")
@js.native
class Circle protected () extends Observable_ {
  def this(center: js.Any, radius: Double) = this()
  def this(center: typingsJapgolly.kendoUi.kendo.geometry.Point, radius: Double) = this()
  var center: typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  var options: CircleOptions = js.native
  var radius: Double = js.native
  def bbox(matrix: typingsJapgolly.kendoUi.kendo.geometry.Matrix): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def equals(other: typingsJapgolly.kendoUi.kendo.geometry.Circle): Boolean = js.native
  def getCenter(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def getRadius(): Double = js.native
  def pointAt(angle: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def setCenter(value: js.Any): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def setCenter(value: typingsJapgolly.kendoUi.kendo.geometry.Point): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def setRadius(value: Double): typingsJapgolly.kendoUi.kendo.geometry.Circle = js.native
}

