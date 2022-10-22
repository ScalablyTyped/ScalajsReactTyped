package typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceServerResponse extends StObject {
  
  /**
    * The resource server.
    */
  var ResourceServer: ResourceServerType
}
object UpdateResourceServerResponse {
  
  inline def apply(ResourceServer: ResourceServerType): UpdateResourceServerResponse = {
    val __obj = js.Dynamic.literal(ResourceServer = ResourceServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceServerResponse]
  }
  
  extension [Self <: UpdateResourceServerResponse](x: Self) {
    
    inline def setResourceServer(value: ResourceServerType): Self = StObject.set(x, "ResourceServer", value.asInstanceOf[js.Any])
  }
}
