package typingsJapgolly.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvertiseByoipCidrResponse extends StObject {
  
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typingsJapgolly.awsSdk.clientsGlobalacceleratorMod.ByoipCidr] = js.undefined
}
object AdvertiseByoipCidrResponse {
  
  inline def apply(): AdvertiseByoipCidrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiseByoipCidrResponse]
  }
  
  extension [Self <: AdvertiseByoipCidrResponse](x: Self) {
    
    inline def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    inline def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
