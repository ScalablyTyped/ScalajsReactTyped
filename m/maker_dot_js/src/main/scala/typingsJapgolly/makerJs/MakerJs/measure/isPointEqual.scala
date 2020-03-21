package typingsJapgolly.makerJs.MakerJs.measure

import typingsJapgolly.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.isPointEqual")
@js.native
object isPointEqual extends js.Object {
  /**
    * Find out if two points are equal.
    *
    * @param a First point.
    * @param b Second point.
    * @returns true if points are the same, false if they are not
    */
  def apply(a: IPoint, b: IPoint): Boolean = js.native
  def apply(a: IPoint, b: IPoint, withinDistance: Double): Boolean = js.native
}

