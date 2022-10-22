package typingsJapgolly.leafletCurve

import typingsJapgolly.leaflet.mod.LatLngBounds_
import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leaflet.mod.LayerOptions
import typingsJapgolly.leaflet.mod.Path
import typingsJapgolly.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "Curve")
  @js.native
  open class Curve_ () extends Path {
    def this(options: LayerOptions) = this()
    
    /*
      * Get bounds
      */
    def getBounds(): LatLngBounds_ = js.native
    
    /*
      * Get center
      */
    def getCenter(): LatLng_ = js.native
    
    /*
      * Return path
      */
    def getPath(): js.Array[String | js.Array[js.Array[Any]]] = js.native
    
    /*
      * Set path
      */
    def setPath(): Curve_ = js.native
  }
  
  /*
    * Drawing Bezier curves and other complex shapes.
    */
  inline def curve(path: js.Array[Any], options: js.UndefOr[PathOptions]): Curve_ = (^.asInstanceOf[js.Dynamic].applyDynamic("curve")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Curve_]
}
