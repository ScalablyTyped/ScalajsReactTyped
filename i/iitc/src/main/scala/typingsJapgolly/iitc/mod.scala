package typingsJapgolly.iitc

import typingsJapgolly.leaflet.mod.CircleMarkerOptions
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iitc", "DataCache")
  @js.native
  open class DataCache ()
    extends typingsJapgolly.iitc.coreDataCacheMod.DataCache
  
  object IITC {
    
    /** Field-Polygon */
    @JSImport("iitc", "IITC.Field")
    @js.native
    open class Field protected ()
      extends typingsJapgolly.iitc.coreIitctypesMod.IITC.Field {
      def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
      def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
    }
    
    /** Link-Marker */
    @JSImport("iitc", "IITC.Link")
    @js.native
    open class Link protected ()
      extends typingsJapgolly.iitc.coreIitctypesMod.IITC.Link {
      def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
      def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
    }
    
    /** Portal-Marker */
    @JSImport("iitc", "IITC.Portal")
    @js.native
    open class Portal protected ()
      extends typingsJapgolly.iitc.coreIitctypesMod.IITC.Portal {
      def this(latlng: LatLngExpression) = this()
      def this(latlng: LatLngExpression, options: CircleMarkerOptions) = this()
    }
  }
  
  @JSImport("iitc", "MapDataRequest")
  @js.native
  open class MapDataRequest ()
    extends typingsJapgolly.iitc.coreMapDataRequestMod.MapDataRequest
  
  @JSImport("iitc", "Render")
  @js.native
  open class Render ()
    extends typingsJapgolly.iitc.coreMapDataRenderMod.Render
  
  @JSImport("iitc", "RenderDebugTiles")
  @js.native
  open class RenderDebugTiles ()
    extends typingsJapgolly.iitc.coreMapDataDebugMod.RenderDebugTiles
}
