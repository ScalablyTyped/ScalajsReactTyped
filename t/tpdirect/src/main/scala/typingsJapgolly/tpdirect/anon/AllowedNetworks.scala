package typingsJapgolly.tpdirect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedNetworks extends StObject {
  
  var allowedNetworks: js.Array[typingsJapgolly.tpdirect.AllowedNetworks]
  
  var currency: js.UndefOr[String] = js.undefined
  
  var price: js.UndefOr[String] = js.undefined
}
object AllowedNetworks {
  
  inline def apply(allowedNetworks: js.Array[typingsJapgolly.tpdirect.AllowedNetworks]): AllowedNetworks = {
    val __obj = js.Dynamic.literal(allowedNetworks = allowedNetworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedNetworks]
  }
  
  extension [Self <: AllowedNetworks](x: Self) {
    
    inline def setAllowedNetworks(value: js.Array[typingsJapgolly.tpdirect.AllowedNetworks]): Self = StObject.set(x, "allowedNetworks", value.asInstanceOf[js.Any])
    
    inline def setAllowedNetworksVarargs(value: typingsJapgolly.tpdirect.AllowedNetworks*): Self = StObject.set(x, "allowedNetworks", js.Array(value*))
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
