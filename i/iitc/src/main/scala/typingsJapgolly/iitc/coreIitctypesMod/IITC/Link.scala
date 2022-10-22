package typingsJapgolly.iitc.coreIitctypesMod.IITC

import typingsJapgolly.iitc.leafletMod.GeodesicPolyline_
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Link-Marker */
@JSImport("iitc/core/iitctypes", "IITC.Link")
@js.native
open class Link protected () extends GeodesicPolyline_ {
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
  
  @JSName("options")
  var options_Link: LinkOptions = js.native
}
