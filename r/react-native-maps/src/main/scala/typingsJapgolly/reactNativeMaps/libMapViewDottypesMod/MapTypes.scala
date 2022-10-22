package typingsJapgolly.reactNativeMaps.libMapViewDottypesMod

import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.hybrid
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.mutedStandard
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.none
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.satellite
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.standard
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.terrain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTypes extends StObject {
  
  var HYBRID: hybrid
  
  var MUTEDSTANDARD: mutedStandard
  
  var NONE: none
  
  var SATELLITE: satellite
  
  var STANDARD: standard
  
  var TERRAIN: terrain
}
object MapTypes {
  
  inline def apply(): MapTypes = {
    val __obj = js.Dynamic.literal(HYBRID = "hybrid", MUTEDSTANDARD = "mutedStandard", NONE = "none", SATELLITE = "satellite", STANDARD = "standard", TERRAIN = "terrain")
    __obj.asInstanceOf[MapTypes]
  }
  
  extension [Self <: MapTypes](x: Self) {
    
    inline def setHYBRID(value: hybrid): Self = StObject.set(x, "HYBRID", value.asInstanceOf[js.Any])
    
    inline def setMUTEDSTANDARD(value: mutedStandard): Self = StObject.set(x, "MUTEDSTANDARD", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: none): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setSATELLITE(value: satellite): Self = StObject.set(x, "SATELLITE", value.asInstanceOf[js.Any])
    
    inline def setSTANDARD(value: standard): Self = StObject.set(x, "STANDARD", value.asInstanceOf[js.Any])
    
    inline def setTERRAIN(value: terrain): Self = StObject.set(x, "TERRAIN", value.asInstanceOf[js.Any])
  }
}
