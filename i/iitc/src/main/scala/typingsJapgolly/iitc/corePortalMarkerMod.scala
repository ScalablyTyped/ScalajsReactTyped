package typingsJapgolly.iitc

import typingsJapgolly.iitc.coreIitctypesMod.IITC.Portal
import typingsJapgolly.iitc.coreIitctypesMod.IITC.PortalData
import typingsJapgolly.iitc.coreIitctypesMod.IITC.PortalOptions
import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePortalMarkerMod {
  
  object global {
    
    /**
      *  create a new marker. 'data' contain the IITC-specific entity data to be stored in the object options
      */
    inline def createMarker(latlng: LatLng_, data: PortalData): Portal = (js.Dynamic.global.applyDynamic("createMarker")(latlng.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Portal]
    
    inline def getMarkerStyleOptions(details: PortalOptions): PathOptions = js.Dynamic.global.applyDynamic("getMarkerStyleOptions")(details.asInstanceOf[js.Any]).asInstanceOf[PathOptions]
    
    inline def portalMarkerScale(): Double = js.Dynamic.global.applyDynamic("portalMarkerScale")().asInstanceOf[Double]
    
    inline def setMarkerStyle(marker: Portal, selected: Boolean): Unit = (js.Dynamic.global.applyDynamic("setMarkerStyle")(marker.asInstanceOf[js.Any], selected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
