package typingsJapgolly.fabric.mod.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Intersection")
@js.native
class Intersection ()
  extends typingsJapgolly.fabric.fabricImplMod.Intersection {
  def this(status: String) = this()
}

/* static members */
@JSImport("fabric", "fabric.Intersection")
@js.native
object Intersection extends js.Object {
  /**
  	 * Checks if one line intersects another
  	 */
  def intersectLineLine(
    a1: typingsJapgolly.fabric.fabricImplMod.Point,
    a2: typingsJapgolly.fabric.fabricImplMod.Point,
    b1: typingsJapgolly.fabric.fabricImplMod.Point,
    b2: typingsJapgolly.fabric.fabricImplMod.Point
  ): typingsJapgolly.fabric.fabricImplMod.Intersection = js.native
  /**
  	 * Checks if line intersects polygon
  	 */
  def intersectLinePolygon(
    a1: typingsJapgolly.fabric.fabricImplMod.Point,
    a2: typingsJapgolly.fabric.fabricImplMod.Point,
    points: js.Array[typingsJapgolly.fabric.fabricImplMod.Point]
  ): typingsJapgolly.fabric.fabricImplMod.Intersection = js.native
  /**
  	 * Checks if polygon intersects another polygon
  	 */
  def intersectPolygonPolygon(
    points1: js.Array[typingsJapgolly.fabric.fabricImplMod.Point],
    points2: js.Array[typingsJapgolly.fabric.fabricImplMod.Point]
  ): typingsJapgolly.fabric.fabricImplMod.Intersection = js.native
  /**
  	 * Checks if polygon intersects rectangle
  	 */
  def intersectPolygonRectangle(points: js.Array[typingsJapgolly.fabric.fabricImplMod.Point], r1: Double, r2: Double): typingsJapgolly.fabric.fabricImplMod.Intersection = js.native
}

