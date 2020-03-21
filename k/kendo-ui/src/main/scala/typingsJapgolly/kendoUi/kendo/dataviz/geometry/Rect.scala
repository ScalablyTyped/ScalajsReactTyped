package typingsJapgolly.kendoUi.kendo.dataviz.geometry

import typingsJapgolly.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
class Rect protected () extends Observable_ {
  def this(origin: js.Any, size: js.Any) = this()
  def this(origin: js.Any, size: typingsJapgolly.kendoUi.kendo.geometry.Size) = this()
  def this(origin: typingsJapgolly.kendoUi.kendo.geometry.Point, size: js.Any) = this()
  def this(
    origin: typingsJapgolly.kendoUi.kendo.geometry.Point,
    size: typingsJapgolly.kendoUi.kendo.geometry.Size
  ) = this()
  var options: RectOptions = js.native
  var origin: typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  var size: typingsJapgolly.kendoUi.kendo.geometry.Size = js.native
  def bbox(matrix: typingsJapgolly.kendoUi.kendo.geometry.Matrix): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def bottomLeft(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def bottomRight(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def center(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def equals(other: typingsJapgolly.kendoUi.kendo.geometry.Rect): Boolean = js.native
  def getOrigin(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def getSize(): typingsJapgolly.kendoUi.kendo.geometry.Size = js.native
  def height(): Double = js.native
  def setOrigin(value: js.Any): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def setOrigin(value: typingsJapgolly.kendoUi.kendo.geometry.Point): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def setSize(value: js.Any): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def setSize(value: typingsJapgolly.kendoUi.kendo.geometry.Size): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def topLeft(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def topRight(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  def width(): Double = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
object Rect extends js.Object {
  def fromPoints(
    pointA: typingsJapgolly.kendoUi.kendo.geometry.Point,
    pointB: typingsJapgolly.kendoUi.kendo.geometry.Point
  ): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def union(
    rectA: typingsJapgolly.kendoUi.kendo.geometry.Rect,
    rectB: typingsJapgolly.kendoUi.kendo.geometry.Rect
  ): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
}

