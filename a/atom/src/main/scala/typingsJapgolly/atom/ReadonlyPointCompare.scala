package typingsJapgolly.atom

import typingsJapgolly.atom.mod.PointCompatible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<atom.atom.Point> */
@js.native
trait ReadonlyPointCompare extends js.Object {
  val column: Double = js.native
  val fromObject: js.Any = js.native
  val min: js.Any = js.native
  val row: Double = js.native
  def compare(other: PointCompatible): Double = js.native
  def copy(): this.type = js.native
  def freeze(): ReadonlyPointColumn = js.native
  def isEqual(other: PointCompatible): Boolean = js.native
  def isGreaterThan(other: PointCompatible): Boolean = js.native
  def isGreaterThanOrEqual(other: PointCompatible): Boolean = js.native
  def isLessThan(other: PointCompatible): Boolean = js.native
  def isLessThanOrEqual(other: PointCompatible): Boolean = js.native
  def negate(): this.type = js.native
  def serialize(): js.Tuple2[Double, Double] = js.native
  def toArray(): js.Tuple2[Double, Double] = js.native
  def translate(other: PointCompatible): this.type = js.native
  def traverse(other: PointCompatible): this.type = js.native
}

