package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.geomGeometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomLinearRingMod {
  
  @JSImport("ol/geom/LinearRing", JSImport.Default)
  @js.native
  open class default protected () extends LinearRing {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  trait LinearRing
    extends typingsJapgolly.ol.geomSimpleGeometryMod.default {
    
    /**
      * Return the area of the linear ring on projected plane.
      */
    def getArea(): Double = js.native
  }
}
