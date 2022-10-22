package typingsJapgolly.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientMetadata
  extends StObject
     with AllClientMetadata {
  
  @JSName("client_id")
  var client_id_ClientMetadata: String
}
object ClientMetadata {
  
  inline def apply(client_id: String): ClientMetadata = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
  
  extension [Self <: ClientMetadata](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
  }
}
