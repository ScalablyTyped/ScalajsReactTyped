package typingsJapgolly.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResourceSharePermissionResponse extends StObject {
  
  /**
    * The idempotency identifier associated with this request. If you want to repeat the same operation in an idempotent manner then you must include this value in the clientToken request parameter of that later call. All other parameters must also have the same values that you used in the first call.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A return value of true indicates that the request succeeded. A value of false indicates that the request failed.
    */
  var returnValue: js.UndefOr[Boolean] = js.undefined
}
object DisassociateResourceSharePermissionResponse {
  
  inline def apply(): DisassociateResourceSharePermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateResourceSharePermissionResponse]
  }
  
  extension [Self <: DisassociateResourceSharePermissionResponse](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
  }
}
