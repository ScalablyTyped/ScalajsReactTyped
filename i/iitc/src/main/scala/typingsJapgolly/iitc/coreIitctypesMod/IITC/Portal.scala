package typingsJapgolly.iitc.coreIitctypesMod.IITC

import typingsJapgolly.leaflet.mod.CircleMarkerOptions
import typingsJapgolly.leaflet.mod.CircleMarker_
import typingsJapgolly.leaflet.mod.LatLngExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Portal-Marker */
@JSImport("iitc/core/iitctypes", "IITC.Portal")
@js.native
open class Portal protected () extends CircleMarker_[Any] {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: CircleMarkerOptions) = this()
  
  @JSName("options")
  var options_Portal: PortalOptions = js.native
}
