package typingsJapgolly.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  var feature: js.Array[Any]
  
  var trafficMode: String
  
  var transportModes: js.Array[String]
  
  var `type`: String
}
object Feature {
  
  inline def apply(feature: js.Array[Any], trafficMode: String, transportModes: js.Array[String], `type`: String): Feature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], trafficMode = trafficMode.asInstanceOf[js.Any], transportModes = transportModes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  extension [Self <: Feature](x: Self) {
    
    inline def setFeature(value: js.Array[Any]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureVarargs(value: Any*): Self = StObject.set(x, "feature", js.Array(value*))
    
    inline def setTrafficMode(value: String): Self = StObject.set(x, "trafficMode", value.asInstanceOf[js.Any])
    
    inline def setTransportModes(value: js.Array[String]): Self = StObject.set(x, "transportModes", value.asInstanceOf[js.Any])
    
    inline def setTransportModesVarargs(value: String*): Self = StObject.set(x, "transportModes", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
