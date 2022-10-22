package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityVerificationAttributes extends StObject {
  
  /**
    * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
    */
  var VerificationStatus: typingsJapgolly.awsSdk.clientsSesMod.VerificationStatus
  
  /**
    * The verification token for a domain identity. Null for email address identities.
    */
  var VerificationToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSesMod.VerificationToken] = js.undefined
}
object IdentityVerificationAttributes {
  
  inline def apply(VerificationStatus: VerificationStatus): IdentityVerificationAttributes = {
    val __obj = js.Dynamic.literal(VerificationStatus = VerificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityVerificationAttributes]
  }
  
  extension [Self <: IdentityVerificationAttributes](x: Self) {
    
    inline def setVerificationStatus(value: VerificationStatus): Self = StObject.set(x, "VerificationStatus", value.asInstanceOf[js.Any])
    
    inline def setVerificationToken(value: VerificationToken): Self = StObject.set(x, "VerificationToken", value.asInstanceOf[js.Any])
    
    inline def setVerificationTokenUndefined: Self = StObject.set(x, "VerificationToken", js.undefined)
  }
}
