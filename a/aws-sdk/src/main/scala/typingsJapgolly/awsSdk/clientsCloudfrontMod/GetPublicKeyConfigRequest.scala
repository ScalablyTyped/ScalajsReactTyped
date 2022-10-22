package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicKeyConfigRequest extends StObject {
  
  /**
    * The identifier of the public key whose configuration you are getting.
    */
  var Id: String
}
object GetPublicKeyConfigRequest {
  
  inline def apply(Id: String): GetPublicKeyConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicKeyConfigRequest]
  }
  
  extension [Self <: GetPublicKeyConfigRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
