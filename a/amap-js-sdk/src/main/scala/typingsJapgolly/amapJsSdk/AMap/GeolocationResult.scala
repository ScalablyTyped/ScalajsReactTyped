package typingsJapgolly.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationResult extends StObject {
  
  var accuracy: Double
  
  var info: String
  
  var isConverted: Boolean
  
  var position: LngLat
}
object GeolocationResult {
  
  inline def apply(accuracy: Double, info: String, isConverted: Boolean, position: LngLat): GeolocationResult = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isConverted = isConverted.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationResult]
  }
  
  extension [Self <: GeolocationResult](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setIsConverted(value: Boolean): Self = StObject.set(x, "isConverted", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: LngLat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
