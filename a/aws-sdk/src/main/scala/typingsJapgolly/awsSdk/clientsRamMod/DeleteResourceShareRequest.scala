package typingsJapgolly.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceShareRequest extends StObject {
  
  /**
    * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This lets you safely retry the request without accidentally performing the same operation a second time. Passing the same value to a later call to an operation requires that you also pass the same value for all other parameters. We recommend that you use a UUID type of value.. If you don't provide this value, then Amazon Web Services generates a random one for you.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Amazon Resoure Name (ARN) of the resource share to delete.
    */
  var resourceShareArn: String
}
object DeleteResourceShareRequest {
  
  inline def apply(resourceShareArn: String): DeleteResourceShareRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceShareRequest]
  }
  
  extension [Self <: DeleteResourceShareRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
  }
}
