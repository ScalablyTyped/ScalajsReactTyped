package typingsJapgolly.trezorConnect.libTypescriptNetworksStellarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarGetAddress extends StObject {
  
  var address: js.UndefOr[String] = js.undefined
  
  var path: String | js.Array[Double]
  
  var showOnTrezor: js.UndefOr[Boolean] = js.undefined
}
object StellarGetAddress {
  
  inline def apply(path: String | js.Array[Double]): StellarGetAddress = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarGetAddress]
  }
  
  extension [Self <: StellarGetAddress](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
    
    inline def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
  }
}
