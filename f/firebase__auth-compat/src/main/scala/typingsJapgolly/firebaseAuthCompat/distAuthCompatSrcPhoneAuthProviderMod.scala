package typingsJapgolly.firebaseAuthCompat

import typingsJapgolly.firebaseAuthCompat.firebaseAuthCompatStrings.phone
import typingsJapgolly.firebaseAuthTypes.mod.ApplicationVerifier
import typingsJapgolly.firebaseAuthTypes.mod.AuthCredential
import typingsJapgolly.firebaseAuthTypes.mod.PhoneMultiFactorEnrollInfoOptions
import typingsJapgolly.firebaseAuthTypes.mod.PhoneMultiFactorSignInInfoOptions
import typingsJapgolly.firebaseAuthTypes.mod.PhoneSingleFactorInfoOptions
import typingsJapgolly.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthCompatSrcPhoneAuthProviderMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/src/phone_auth_provider", "PhoneAuthProvider")
  @js.native
  open class PhoneAuthProvider ()
    extends typingsJapgolly.firebaseAuthTypes.mod.PhoneAuthProvider
       with Compat[typingsJapgolly.firebaseAuth.internalMod.PhoneAuthProvider] {
    
    /* CompleteClass */
    var _delegate: typingsJapgolly.firebaseAuth.internalMod.PhoneAuthProvider = js.native
    
    def unwrap(): typingsJapgolly.firebaseAuth.internalMod.PhoneAuthProvider = js.native
    
    def verifyPhoneNumber(phoneInfoOptions: PhoneMultiFactorEnrollInfoOptions, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
    def verifyPhoneNumber(phoneInfoOptions: PhoneMultiFactorSignInInfoOptions, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
    def verifyPhoneNumber(phoneInfoOptions: PhoneSingleFactorInfoOptions, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
  }
  /* static members */
  object PhoneAuthProvider {
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/phone_auth_provider", "PhoneAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/phone_auth_provider", "PhoneAuthProvider.PHONE_SIGN_IN_METHOD")
    @js.native
    def PHONE_SIGN_IN_METHOD: phone = js.native
    inline def PHONE_SIGN_IN_METHOD_=(x: phone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHONE_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/phone_auth_provider", "PhoneAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: phone = js.native
    inline def PROVIDER_ID_=(x: phone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
    inline def credential(verificationId: String, verificationCode: String): AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[AuthCredential]
  }
}
