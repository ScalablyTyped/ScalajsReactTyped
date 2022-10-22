package typingsJapgolly.leafletRastercoords

import typingsJapgolly.leaflet.mod.LatLngBounds_
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leaflet.mod.Map_
import typingsJapgolly.leaflet.mod.PointExpression
import typingsJapgolly.leaflet.mod.Point_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @JSImport("leaflet", "RasterCoords")
  @js.native
  open class RasterCoords protected () extends StObject {
    def this(map: Map_, imgsize: js.Array[Double]) = this()
    def this(map: Map_, imgsize: js.Array[Double], tilesize: Double) = this()
    
    def getMaxBounds(): LatLngBounds_ = js.native
    
    def project(coords: LatLngExpression): Point_ = js.native
    
    def setMaxBounds(): Unit = js.native
    
    def unproject(coords: PointExpression): LatLng_ = js.native
    
    def zoomLevel(): Double = js.native
  }
}
