package typingsJapgolly.fabric.mod.fabric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Intersection")
@js.native
open class Intersection ()
  extends typingsJapgolly.fabric.fabricImplMod.Intersection {
  def this(status: String) = this()
}
/* static members */
object Intersection {
  
  @JSImport("fabric", "fabric.Intersection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks if one line intersects another
    */
  inline def intersectLineLine(
    a1: typingsJapgolly.fabric.fabricImplMod.Point,
    a2: typingsJapgolly.fabric.fabricImplMod.Point,
    b1: typingsJapgolly.fabric.fabricImplMod.Point,
    b2: typingsJapgolly.fabric.fabricImplMod.Point
  ): typingsJapgolly.fabric.fabricImplMod.Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectLineLine")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Intersection]
  
  /**
    * Checks if line intersects polygon
    */
  inline def intersectLinePolygon(
    a1: typingsJapgolly.fabric.fabricImplMod.Point,
    a2: typingsJapgolly.fabric.fabricImplMod.Point,
    points: js.Array[typingsJapgolly.fabric.fabricImplMod.Point]
  ): typingsJapgolly.fabric.fabricImplMod.Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectLinePolygon")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Intersection]
  
  /**
    * Checks if polygon intersects another polygon
    */
  inline def intersectPolygonPolygon(
    points1: js.Array[typingsJapgolly.fabric.fabricImplMod.Point],
    points2: js.Array[typingsJapgolly.fabric.fabricImplMod.Point]
  ): typingsJapgolly.fabric.fabricImplMod.Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectPolygonPolygon")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Intersection]
  
  /**
    * Checks if polygon intersects rectangle
    */
  inline def intersectPolygonRectangle(points: js.Array[typingsJapgolly.fabric.fabricImplMod.Point], r1: Double, r2: Double): typingsJapgolly.fabric.fabricImplMod.Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectPolygonRectangle")(points.asInstanceOf[js.Any], r1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Intersection]
}
