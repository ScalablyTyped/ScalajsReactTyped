package typingsJapgolly.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrustStoreResponse extends StObject {
  
  /**
    * The ARN of the trust store.
    */
  var trustStoreArn: ARN
}
object CreateTrustStoreResponse {
  
  inline def apply(trustStoreArn: ARN): CreateTrustStoreResponse = {
    val __obj = js.Dynamic.literal(trustStoreArn = trustStoreArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrustStoreResponse]
  }
  
  extension [Self <: CreateTrustStoreResponse](x: Self) {
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
  }
}
