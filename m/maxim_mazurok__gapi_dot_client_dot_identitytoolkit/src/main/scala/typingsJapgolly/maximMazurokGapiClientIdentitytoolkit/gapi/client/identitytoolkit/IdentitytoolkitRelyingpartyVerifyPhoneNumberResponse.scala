package typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse extends StObject {
  
  var expiresIn: js.UndefOr[String] = js.undefined
  
  var idToken: js.UndefOr[String] = js.undefined
  
  var isNewUser: js.UndefOr[Boolean] = js.undefined
  
  var localId: js.UndefOr[String] = js.undefined
  
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  var refreshToken: js.UndefOr[String] = js.undefined
  
  var temporaryProof: js.UndefOr[String] = js.undefined
  
  var temporaryProofExpiresIn: js.UndefOr[String] = js.undefined
  
  var verificationProof: js.UndefOr[String] = js.undefined
  
  var verificationProofExpiresIn: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse {
  
  inline def apply(): IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  }
  
  extension [Self <: IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse](x: Self) {
    
    inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    inline def setIsNewUserUndefined: Self = StObject.set(x, "isNewUser", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setTemporaryProof(value: String): Self = StObject.set(x, "temporaryProof", value.asInstanceOf[js.Any])
    
    inline def setTemporaryProofExpiresIn(value: String): Self = StObject.set(x, "temporaryProofExpiresIn", value.asInstanceOf[js.Any])
    
    inline def setTemporaryProofExpiresInUndefined: Self = StObject.set(x, "temporaryProofExpiresIn", js.undefined)
    
    inline def setTemporaryProofUndefined: Self = StObject.set(x, "temporaryProof", js.undefined)
    
    inline def setVerificationProof(value: String): Self = StObject.set(x, "verificationProof", value.asInstanceOf[js.Any])
    
    inline def setVerificationProofExpiresIn(value: String): Self = StObject.set(x, "verificationProofExpiresIn", value.asInstanceOf[js.Any])
    
    inline def setVerificationProofExpiresInUndefined: Self = StObject.set(x, "verificationProofExpiresIn", js.undefined)
    
    inline def setVerificationProofUndefined: Self = StObject.set(x, "verificationProof", js.undefined)
  }
}
