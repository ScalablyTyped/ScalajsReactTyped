package typingsJapgolly.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLunaClientRequest extends StObject {
  
  /**
    * The ARN of the client to delete.
    */
  var ClientArn: typingsJapgolly.awsSdk.clientsCloudhsmMod.ClientArn
}
object DeleteLunaClientRequest {
  
  inline def apply(ClientArn: ClientArn): DeleteLunaClientRequest = {
    val __obj = js.Dynamic.literal(ClientArn = ClientArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLunaClientRequest]
  }
  
  extension [Self <: DeleteLunaClientRequest](x: Self) {
    
    inline def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
  }
}
