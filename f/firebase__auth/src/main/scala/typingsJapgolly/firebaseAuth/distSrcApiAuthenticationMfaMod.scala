package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.anon.RecaptchaToken
import typingsJapgolly.firebaseAuth.anon.SessionInfo
import typingsJapgolly.firebaseAuth.distSrcApiAccountManagementMfaMod.MfaEnrollment
import typingsJapgolly.firebaseAuth.distSrcApiAuthenticationSmsMod.SignInWithPhoneNumberRequest
import typingsJapgolly.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponse
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiAuthenticationMfaMod {
  
  @JSImport("@firebase/auth/dist/src/api/authentication/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def finalizeSignInPhoneMfa(auth: Auth, request: FinalizePhoneMfaSignInRequest): js.Promise[FinalizePhoneMfaSignInResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("finalizeSignInPhoneMfa")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FinalizePhoneMfaSignInResponse]]
  
  inline def startSignInPhoneMfa(auth: Auth, request: StartPhoneMfaSignInRequest): js.Promise[StartPhoneMfaSignInResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("startSignInPhoneMfa")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StartPhoneMfaSignInResponse]]
  
  trait FinalizeMfaResponse extends StObject {
    
    var idToken: String
    
    var refreshToken: String
  }
  object FinalizeMfaResponse {
    
    inline def apply(idToken: String, refreshToken: String): FinalizeMfaResponse = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalizeMfaResponse]
    }
    
    extension [Self <: FinalizeMfaResponse](x: Self) {
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait FinalizePhoneMfaSignInRequest extends StObject {
    
    var mfaPendingCredential: String
    
    var phoneVerificationInfo: SignInWithPhoneNumberRequest
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object FinalizePhoneMfaSignInRequest {
    
    inline def apply(mfaPendingCredential: String, phoneVerificationInfo: SignInWithPhoneNumberRequest): FinalizePhoneMfaSignInRequest = {
      val __obj = js.Dynamic.literal(mfaPendingCredential = mfaPendingCredential.asInstanceOf[js.Any], phoneVerificationInfo = phoneVerificationInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalizePhoneMfaSignInRequest]
    }
    
    extension [Self <: FinalizePhoneMfaSignInRequest](x: Self) {
      
      inline def setMfaPendingCredential(value: String): Self = StObject.set(x, "mfaPendingCredential", value.asInstanceOf[js.Any])
      
      inline def setPhoneVerificationInfo(value: SignInWithPhoneNumberRequest): Self = StObject.set(x, "phoneVerificationInfo", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  type FinalizePhoneMfaSignInResponse = FinalizeMfaResponse
  
  trait IdTokenMfaResponse
    extends StObject
       with IdTokenResponse {
    
    var mfaInfo: js.UndefOr[js.Array[MfaEnrollment]] = js.undefined
    
    var mfaPendingCredential: js.UndefOr[String] = js.undefined
  }
  object IdTokenMfaResponse {
    
    inline def apply(localId: String): IdTokenMfaResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdTokenMfaResponse]
    }
    
    extension [Self <: IdTokenMfaResponse](x: Self) {
      
      inline def setMfaInfo(value: js.Array[MfaEnrollment]): Self = StObject.set(x, "mfaInfo", value.asInstanceOf[js.Any])
      
      inline def setMfaInfoUndefined: Self = StObject.set(x, "mfaInfo", js.undefined)
      
      inline def setMfaInfoVarargs(value: MfaEnrollment*): Self = StObject.set(x, "mfaInfo", js.Array(value*))
      
      inline def setMfaPendingCredential(value: String): Self = StObject.set(x, "mfaPendingCredential", value.asInstanceOf[js.Any])
      
      inline def setMfaPendingCredentialUndefined: Self = StObject.set(x, "mfaPendingCredential", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.distSrcApiAuthenticationSmsMod.SignInWithPhoneNumberResponse
    - typingsJapgolly.firebaseAuth.distSrcApiAuthenticationIdpMod.SignInWithIdpResponse
    - typingsJapgolly.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponse
  */
  trait PhoneOrOauthTokenResponse extends StObject
  object PhoneOrOauthTokenResponse {
    
    inline def IdTokenResponse(localId: String): typingsJapgolly.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponse]
    }
    
    inline def SignInWithIdpResponse(localId: String): typingsJapgolly.firebaseAuth.distSrcApiAuthenticationIdpMod.SignInWithIdpResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distSrcApiAuthenticationIdpMod.SignInWithIdpResponse]
    }
    
    inline def SignInWithPhoneNumberResponse(localId: String): typingsJapgolly.firebaseAuth.distSrcApiAuthenticationSmsMod.SignInWithPhoneNumberResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distSrcApiAuthenticationSmsMod.SignInWithPhoneNumberResponse]
    }
  }
  
  trait StartPhoneMfaSignInRequest extends StObject {
    
    var mfaEnrollmentId: String
    
    var mfaPendingCredential: String
    
    var phoneSignInInfo: RecaptchaToken
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object StartPhoneMfaSignInRequest {
    
    inline def apply(mfaEnrollmentId: String, mfaPendingCredential: String, phoneSignInInfo: RecaptchaToken): StartPhoneMfaSignInRequest = {
      val __obj = js.Dynamic.literal(mfaEnrollmentId = mfaEnrollmentId.asInstanceOf[js.Any], mfaPendingCredential = mfaPendingCredential.asInstanceOf[js.Any], phoneSignInInfo = phoneSignInInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartPhoneMfaSignInRequest]
    }
    
    extension [Self <: StartPhoneMfaSignInRequest](x: Self) {
      
      inline def setMfaEnrollmentId(value: String): Self = StObject.set(x, "mfaEnrollmentId", value.asInstanceOf[js.Any])
      
      inline def setMfaPendingCredential(value: String): Self = StObject.set(x, "mfaPendingCredential", value.asInstanceOf[js.Any])
      
      inline def setPhoneSignInInfo(value: RecaptchaToken): Self = StObject.set(x, "phoneSignInInfo", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait StartPhoneMfaSignInResponse extends StObject {
    
    var phoneResponseInfo: SessionInfo
  }
  object StartPhoneMfaSignInResponse {
    
    inline def apply(phoneResponseInfo: SessionInfo): StartPhoneMfaSignInResponse = {
      val __obj = js.Dynamic.literal(phoneResponseInfo = phoneResponseInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartPhoneMfaSignInResponse]
    }
    
    extension [Self <: StartPhoneMfaSignInResponse](x: Self) {
      
      inline def setPhoneResponseInfo(value: SessionInfo): Self = StObject.set(x, "phoneResponseInfo", value.asInstanceOf[js.Any])
    }
  }
}
