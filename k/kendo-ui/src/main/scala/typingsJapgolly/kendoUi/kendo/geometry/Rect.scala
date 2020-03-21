package typingsJapgolly.kendoUi.kendo.geometry

import typingsJapgolly.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.geometry.Rect")
@js.native
class Rect protected () extends Observable_ {
  def this(origin: js.Any, size: js.Any) = this()
  def this(origin: js.Any, size: Size) = this()
  def this(origin: Point, size: js.Any) = this()
  def this(origin: Point, size: Size) = this()
  var options: RectOptions = js.native
  var origin: Point = js.native
  var size: Size = js.native
  def bbox(matrix: Matrix): Rect = js.native
  def bottomLeft(): Point = js.native
  def bottomRight(): Point = js.native
  def center(): Point = js.native
  def equals(other: Rect): Boolean = js.native
  def getOrigin(): Point = js.native
  def getSize(): Size = js.native
  def height(): Double = js.native
  def setOrigin(value: js.Any): Rect = js.native
  def setOrigin(value: Point): Rect = js.native
  def setSize(value: js.Any): Rect = js.native
  def setSize(value: Size): Rect = js.native
  def topLeft(): Point = js.native
  def topRight(): Point = js.native
  def width(): Double = js.native
}

/* static members */
@JSGlobal("kendo.geometry.Rect")
@js.native
object Rect extends js.Object {
  def fromPoints(pointA: Point, pointB: Point): Rect = js.native
  def union(rectA: Rect, rectB: Rect): Rect = js.native
}

