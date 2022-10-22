package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityVerificationAttributesResponse extends StObject {
  
  /**
    * A map of Identities to IdentityVerificationAttributes objects.
    */
  var VerificationAttributes: typingsJapgolly.awsSdk.clientsSesMod.VerificationAttributes
}
object GetIdentityVerificationAttributesResponse {
  
  inline def apply(VerificationAttributes: VerificationAttributes): GetIdentityVerificationAttributesResponse = {
    val __obj = js.Dynamic.literal(VerificationAttributes = VerificationAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityVerificationAttributesResponse]
  }
  
  extension [Self <: GetIdentityVerificationAttributesResponse](x: Self) {
    
    inline def setVerificationAttributes(value: VerificationAttributes): Self = StObject.set(x, "VerificationAttributes", value.asInstanceOf[js.Any])
  }
}
