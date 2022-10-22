package typingsJapgolly.esriLeafletGeocoder

import typingsJapgolly.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: String
    
    var latlng: LatLng_
  }
  object Address {
    
    inline def apply(address: String, latlng: LatLng_): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setLatlng(value: LatLng_): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
    }
  }
  
  trait Results extends StObject {
    
    var results: js.Array[Any]
  }
  object Results {
    
    inline def apply(results: js.Array[Any]): Results = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setResults(value: js.Array[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: Any*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
}
