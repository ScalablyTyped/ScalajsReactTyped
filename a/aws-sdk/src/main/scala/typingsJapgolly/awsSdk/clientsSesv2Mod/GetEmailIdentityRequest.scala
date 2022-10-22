package typingsJapgolly.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEmailIdentityRequest extends StObject {
  
  /**
    * The email identity.
    */
  var EmailIdentity: Identity
}
object GetEmailIdentityRequest {
  
  inline def apply(EmailIdentity: Identity): GetEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailIdentityRequest]
  }
  
  extension [Self <: GetEmailIdentityRequest](x: Self) {
    
    inline def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
  }
}
