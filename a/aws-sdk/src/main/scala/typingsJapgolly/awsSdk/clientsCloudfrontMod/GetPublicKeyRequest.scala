package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicKeyRequest extends StObject {
  
  /**
    * The identifier of the public key you are getting.
    */
  var Id: String
}
object GetPublicKeyRequest {
  
  inline def apply(Id: String): GetPublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicKeyRequest]
  }
  
  extension [Self <: GetPublicKeyRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
