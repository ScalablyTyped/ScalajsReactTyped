package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumGetAddress extends StObject {
  
  var address_n: js.Array[Double]
  
  var show_display: js.UndefOr[Boolean] = js.undefined
}
object EthereumGetAddress {
  
  inline def apply(address_n: js.Array[Double]): EthereumGetAddress = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumGetAddress]
  }
  
  extension [Self <: EthereumGetAddress](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setShow_display(value: Boolean): Self = StObject.set(x, "show_display", value.asInstanceOf[js.Any])
    
    inline def setShow_displayUndefined: Self = StObject.set(x, "show_display", js.undefined)
  }
}
