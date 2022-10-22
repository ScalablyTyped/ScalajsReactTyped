package typingsJapgolly.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Unsupported API. */
trait CivicAddress extends StObject {
  
  /** Unsupported API. */
  var city: String
  
  /** Unsupported API. */
  var country: String
  
  /** Unsupported API. */
  var postalCode: String
  
  /** Unsupported API. */
  var state: String
  
  /** Unsupported API. */
  var timestamp: js.Date
}
object CivicAddress {
  
  inline def apply(city: String, country: String, postalCode: String, state: String, timestamp: js.Date): CivicAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CivicAddress]
  }
  
  extension [Self <: CivicAddress](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
