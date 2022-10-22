package typingsJapgolly.editly.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.fabric.fabricImplMod.Point
import typingsJapgolly.fabric.mod.fabric.Intersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIntersection
  extends StObject
     with Instantiable0[Intersection] {
  
  /**
    * Checks if one line intersects another
    */
  def intersectLineLine(a1: Point, a2: Point, b1: Point, b2: Point): typingsJapgolly.fabric.fabricImplMod.Intersection = js.native
  
  /**
    * Checks if line intersects polygon
    */
  def intersectLinePolygon(a1: Point, a2: Point, points: js.Array[Point]): typingsJapgolly.fabric.fabricImplMod.Intersection = js.native
  
  /**
    * Checks if polygon intersects another polygon
    */
  def intersectPolygonPolygon(points1: js.Array[Point], points2: js.Array[Point]): typingsJapgolly.fabric.fabricImplMod.Intersection = js.native
  
  /**
    * Checks if polygon intersects rectangle
    */
  def intersectPolygonRectangle(points: js.Array[Point], r1: Double, r2: Double): typingsJapgolly.fabric.fabricImplMod.Intersection = js.native
}
