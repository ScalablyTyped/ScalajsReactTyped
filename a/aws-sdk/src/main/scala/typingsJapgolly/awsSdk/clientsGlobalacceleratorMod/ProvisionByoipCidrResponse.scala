package typingsJapgolly.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionByoipCidrResponse extends StObject {
  
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typingsJapgolly.awsSdk.clientsGlobalacceleratorMod.ByoipCidr] = js.undefined
}
object ProvisionByoipCidrResponse {
  
  inline def apply(): ProvisionByoipCidrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionByoipCidrResponse]
  }
  
  extension [Self <: ProvisionByoipCidrResponse](x: Self) {
    
    inline def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    inline def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
