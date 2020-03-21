package typingsJapgolly.atom

import typingsJapgolly.atom.mod.Point
import typingsJapgolly.atom.mod.PointCompatible
import typingsJapgolly.atom.mod.RangeCompatible
import typingsJapgolly.atom.mod.RangeLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<atom.atom.Range> */
@js.native
trait ReadonlyRangeCompare extends js.Object {
  val deserialize: js.Any = js.native
  val end: Point = js.native
  val fromObject: js.Any = js.native
  val start: Point = js.native
  def compare(otherRange: RangeCompatible): Double = js.native
  def containsPoint(point: PointCompatible): Boolean = js.native
  def containsPoint(point: PointCompatible, exclusive: Boolean): Boolean = js.native
  def containsRange(otherRange: RangeCompatible): Boolean = js.native
  def containsRange(otherRange: RangeCompatible, exclusive: Boolean): Boolean = js.native
  def copy(): this.type = js.native
  def coversSameRows(otherRange: RangeLike): Boolean = js.native
  def freeze(): ReadonlyRange = js.native
  def getRowCount(): Double = js.native
  def getRows(): js.Array[Double] = js.native
  def intersectsRow(row: Double): Boolean = js.native
  def intersectsRowRange(startRow: Double, endRow: Double): Boolean = js.native
  def intersectsWith(otherRange: RangeLike): Boolean = js.native
  def intersectsWith(otherRange: RangeLike, exclusive: Boolean): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def isEqual(otherRange: RangeCompatible): Boolean = js.native
  def isSingleLine(): Boolean = js.native
  def negate(): this.type = js.native
  def serialize(): js.Array[js.Array[Double]] = js.native
  def translate(startDelta: PointCompatible): this.type = js.native
  def translate(startDelta: PointCompatible, endDelta: PointCompatible): this.type = js.native
  def traverse(delta: PointCompatible): this.type = js.native
  def union(other: RangeLike): this.type = js.native
}

