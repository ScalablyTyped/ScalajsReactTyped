package typingsJapgolly.mparticleWebSdk.mod

import typingsJapgolly.mparticleWebSdk.anon.Latitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var coords: Latitude
  
  var timestamp: Double
}
object Location {
  
  inline def apply(coords: Latitude, timestamp: Double): Location = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setCoords(value: Latitude): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
