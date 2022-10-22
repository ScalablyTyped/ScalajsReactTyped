package typingsJapgolly.firebaseAuthTypes

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.firebaseAuthTypes.mod.AuthCredential
import typingsJapgolly.firebaseAuthTypes.mod.EmailAuthProvider
import typingsJapgolly.firebaseAuthTypes.mod.EmailAuthProviderInstance
import typingsJapgolly.firebaseAuthTypes.mod.FacebookAuthProvider
import typingsJapgolly.firebaseAuthTypes.mod.FacebookAuthProviderInstance
import typingsJapgolly.firebaseAuthTypes.mod.FirebaseAuth
import typingsJapgolly.firebaseAuthTypes.mod.GithubAuthProvider
import typingsJapgolly.firebaseAuthTypes.mod.GithubAuthProviderInstance
import typingsJapgolly.firebaseAuthTypes.mod.GoogleAuthProvider
import typingsJapgolly.firebaseAuthTypes.mod.GoogleAuthProviderInstance
import typingsJapgolly.firebaseAuthTypes.mod.MultiFactorInfo
import typingsJapgolly.firebaseAuthTypes.mod.Operation
import typingsJapgolly.firebaseAuthTypes.mod.Persistence
import typingsJapgolly.firebaseAuthTypes.mod.PhoneAuthCredential
import typingsJapgolly.firebaseAuthTypes.mod.PhoneAuthProvider
import typingsJapgolly.firebaseAuthTypes.mod.PhoneAuthProviderInstance
import typingsJapgolly.firebaseAuthTypes.mod.PhoneMultiFactorAssertion
import typingsJapgolly.firebaseAuthTypes.mod.PhoneMultiFactorGenerator
import typingsJapgolly.firebaseAuthTypes.mod.RecaptchaVerifierInstance
import typingsJapgolly.firebaseAuthTypes.mod.TwitterAuthProvider
import typingsJapgolly.firebaseAuthTypes.mod.TwitterAuthProviderInstance
import typingsJapgolly.firebaseAuthTypes.mod.firebaseAppTypesAugmentingMod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var disableWarnings: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setDisableWarnings(value: Boolean): Self = StObject.set(x, "disableWarnings", value.asInstanceOf[js.Any])
      
      inline def setDisableWarningsUndefined: Self = StObject.set(x, "disableWarnings", js.undefined)
    }
  }
  
  trait BundleId extends StObject {
    
    var bundleId: String
  }
  object BundleId {
    
    inline def apply(bundleId: String): BundleId = {
      val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleId]
    }
    
    extension [Self <: BundleId](x: Self) {
      
      inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(): FirebaseAuth = js.native
    def apply(app: FirebaseApp): FirebaseAuth = js.native
    
    var Auth: TypeofFirebaseAuth = js.native
    
    var EmailAuthProvider: TypeofEmailAuthProvider = js.native
    
    var EmailAuthProvider_Instance: Instantiable0[EmailAuthProviderInstance] = js.native
    
    var FacebookAuthProvider: TypeofFacebookAuthProvide = js.native
    
    var FacebookAuthProvider_Instance: Instantiable0[FacebookAuthProviderInstance] = js.native
    
    var GithubAuthProvider: TypeofGithubAuthProvider = js.native
    
    var GithubAuthProvider_Instance: Instantiable0[GithubAuthProviderInstance] = js.native
    
    var GoogleAuthProvider: TypeofGoogleAuthProvider = js.native
    
    var GoogleAuthProvider_Instance: Instantiable0[GoogleAuthProviderInstance] = js.native
    
    var OAuthProvider: Instantiable1[/* providerId */ String, typingsJapgolly.firebaseAuthTypes.mod.OAuthProvider] = js.native
    
    var PhoneAuthProvider: TypeofPhoneAuthProvider = js.native
    
    var PhoneAuthProvider_Instance: Instantiable1[/* auth */ js.UndefOr[FirebaseAuth | Null], PhoneAuthProviderInstance] = js.native
    
    var PhoneMultiFactorGenerator: TypeofPhoneMultiFactorGen = js.native
    
    var RecaptchaVerifier: Instantiable0[typingsJapgolly.firebaseAuthTypes.mod.RecaptchaVerifier] = js.native
    
    var RecaptchaVerifier_Instance: Instantiable3[
        /* container */ Any | String, 
        /* parameters */ js.UndefOr[js.Object | Null], 
        /* app */ js.UndefOr[typingsJapgolly.firebaseAppTypes.mod.FirebaseApp | Null], 
        RecaptchaVerifierInstance
      ] = js.native
    
    var SAMLAuthProvider: Instantiable1[/* providerId */ String, typingsJapgolly.firebaseAuthTypes.mod.SAMLAuthProvider] = js.native
    
    var TwitterAuthProvider: TypeofTwitterAuthProvider = js.native
    
    var TwitterAuthProvider_Instance: Instantiable0[TwitterAuthProviderInstance] = js.native
  }
  
  trait DisableWarnings extends StObject {
    
    val disableWarnings: Boolean
  }
  object DisableWarnings {
    
    inline def apply(disableWarnings: Boolean): DisableWarnings = {
      val __obj = js.Dynamic.literal(disableWarnings = disableWarnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisableWarnings]
    }
    
    extension [Self <: DisableWarnings](x: Self) {
      
      inline def setDisableWarnings(value: Boolean): Self = StObject.set(x, "disableWarnings", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisplayName extends StObject {
    
    var displayName: js.UndefOr[String | Null] = js.undefined
    
    var photoURL: js.UndefOr[String | Null] = js.undefined
  }
  object DisplayName {
    
    inline def apply(): DisplayName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayName]
    }
    
    extension [Self <: DisplayName](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
      
      inline def setPhotoURLNull: Self = StObject.set(x, "photoURL", null)
      
      inline def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
    }
  }
  
  trait EMAILSIGNIN extends StObject {
    
    var EMAIL_SIGNIN: Operation
    
    var PASSWORD_RESET: Operation
    
    var RECOVER_EMAIL: Operation
    
    var REVERT_SECOND_FACTOR_ADDITION: Operation
    
    var VERIFY_AND_CHANGE_EMAIL: Operation
    
    var VERIFY_EMAIL: Operation
  }
  object EMAILSIGNIN {
    
    inline def apply(
      EMAIL_SIGNIN: Operation,
      PASSWORD_RESET: Operation,
      RECOVER_EMAIL: Operation,
      REVERT_SECOND_FACTOR_ADDITION: Operation,
      VERIFY_AND_CHANGE_EMAIL: Operation,
      VERIFY_EMAIL: Operation
    ): EMAILSIGNIN = {
      val __obj = js.Dynamic.literal(EMAIL_SIGNIN = EMAIL_SIGNIN.asInstanceOf[js.Any], PASSWORD_RESET = PASSWORD_RESET.asInstanceOf[js.Any], RECOVER_EMAIL = RECOVER_EMAIL.asInstanceOf[js.Any], REVERT_SECOND_FACTOR_ADDITION = REVERT_SECOND_FACTOR_ADDITION.asInstanceOf[js.Any], VERIFY_AND_CHANGE_EMAIL = VERIFY_AND_CHANGE_EMAIL.asInstanceOf[js.Any], VERIFY_EMAIL = VERIFY_EMAIL.asInstanceOf[js.Any])
      __obj.asInstanceOf[EMAILSIGNIN]
    }
    
    extension [Self <: EMAILSIGNIN](x: Self) {
      
      inline def setEMAIL_SIGNIN(value: Operation): Self = StObject.set(x, "EMAIL_SIGNIN", value.asInstanceOf[js.Any])
      
      inline def setPASSWORD_RESET(value: Operation): Self = StObject.set(x, "PASSWORD_RESET", value.asInstanceOf[js.Any])
      
      inline def setRECOVER_EMAIL(value: Operation): Self = StObject.set(x, "RECOVER_EMAIL", value.asInstanceOf[js.Any])
      
      inline def setREVERT_SECOND_FACTOR_ADDITION(value: Operation): Self = StObject.set(x, "REVERT_SECOND_FACTOR_ADDITION", value.asInstanceOf[js.Any])
      
      inline def setVERIFY_AND_CHANGE_EMAIL(value: Operation): Self = StObject.set(x, "VERIFY_AND_CHANGE_EMAIL", value.asInstanceOf[js.Any])
      
      inline def setVERIFY_EMAIL(value: Operation): Self = StObject.set(x, "VERIFY_EMAIL", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    var email: js.UndefOr[String | Null] = js.undefined
    
    var fromEmail: js.UndefOr[String | Null] = js.undefined
    
    var multiFactorInfo: js.UndefOr[MultiFactorInfo | Null] = js.undefined
    
    var previousEmail: js.UndefOr[String | Null] = js.undefined
  }
  object Email {
    
    inline def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailNull: Self = StObject.set(x, "email", null)
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFromEmail(value: String): Self = StObject.set(x, "fromEmail", value.asInstanceOf[js.Any])
      
      inline def setFromEmailNull: Self = StObject.set(x, "fromEmail", null)
      
      inline def setFromEmailUndefined: Self = StObject.set(x, "fromEmail", js.undefined)
      
      inline def setMultiFactorInfo(value: MultiFactorInfo): Self = StObject.set(x, "multiFactorInfo", value.asInstanceOf[js.Any])
      
      inline def setMultiFactorInfoNull: Self = StObject.set(x, "multiFactorInfo", null)
      
      inline def setMultiFactorInfoUndefined: Self = StObject.set(x, "multiFactorInfo", js.undefined)
      
      inline def setPreviousEmail(value: String): Self = StObject.set(x, "previousEmail", value.asInstanceOf[js.Any])
      
      inline def setPreviousEmailNull: Self = StObject.set(x, "previousEmail", null)
      
      inline def setPreviousEmailUndefined: Self = StObject.set(x, "previousEmail", js.undefined)
    }
  }
  
  trait InstallApp extends StObject {
    
    var installApp: js.UndefOr[Boolean] = js.undefined
    
    var minimumVersion: js.UndefOr[String] = js.undefined
    
    var packageName: String
  }
  object InstallApp {
    
    inline def apply(packageName: String): InstallApp = {
      val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallApp]
    }
    
    extension [Self <: InstallApp](x: Self) {
      
      inline def setInstallApp(value: Boolean): Self = StObject.set(x, "installApp", value.asInstanceOf[js.Any])
      
      inline def setInstallAppUndefined: Self = StObject.set(x, "installApp", js.undefined)
      
      inline def setMinimumVersion(value: String): Self = StObject.set(x, "minimumVersion", value.asInstanceOf[js.Any])
      
      inline def setMinimumVersionUndefined: Self = StObject.set(x, "minimumVersion", js.undefined)
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    }
  }
  
  trait LOCAL extends StObject {
    
    var LOCAL: Persistence
    
    var NONE: Persistence
    
    var SESSION: Persistence
  }
  object LOCAL {
    
    inline def apply(LOCAL: Persistence, NONE: Persistence, SESSION: Persistence): LOCAL = {
      val __obj = js.Dynamic.literal(LOCAL = LOCAL.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], SESSION = SESSION.asInstanceOf[js.Any])
      __obj.asInstanceOf[LOCAL]
    }
    
    extension [Self <: LOCAL](x: Self) {
      
      inline def setLOCAL(value: Persistence): Self = StObject.set(x, "LOCAL", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: Persistence): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setSESSION(value: Persistence): Self = StObject.set(x, "SESSION", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofEmailAuthProvider
    extends StObject
       with Instantiable0[EmailAuthProvider] {
    
    var EMAIL_LINK_SIGN_IN_METHOD: String = js.native
    
    var EMAIL_PASSWORD_SIGN_IN_METHOD: String = js.native
    
    var PROVIDER_ID: String = js.native
    
    def credential(email: String, password: String): AuthCredential = js.native
    
    def credentialWithLink(email: String, emailLink: String): AuthCredential = js.native
  }
  
  @js.native
  trait TypeofFacebookAuthProvide
    extends StObject
       with Instantiable0[FacebookAuthProvider] {
    
    var FACEBOOK_SIGN_IN_METHOD: String = js.native
    
    var PROVIDER_ID: String = js.native
    
    def credential(token: String): AuthCredential = js.native
  }
  
  @js.native
  trait TypeofFirebaseAuth
    extends StObject
       with Instantiable0[FirebaseAuth] {
    
    var Persistence: LOCAL = js.native
  }
  
  @js.native
  trait TypeofGithubAuthProvider
    extends StObject
       with Instantiable0[GithubAuthProvider] {
    
    var GITHUB_SIGN_IN_METHOD: String = js.native
    
    var PROVIDER_ID: String = js.native
    
    def credential(token: String): AuthCredential = js.native
  }
  
  @js.native
  trait TypeofGoogleAuthProvider
    extends StObject
       with Instantiable0[GoogleAuthProvider] {
    
    var GOOGLE_SIGN_IN_METHOD: String = js.native
    
    var PROVIDER_ID: String = js.native
    
    def credential(): AuthCredential = js.native
    def credential(idToken: String): AuthCredential = js.native
    def credential(idToken: String, accessToken: String): AuthCredential = js.native
    def credential(idToken: Null, accessToken: String): AuthCredential = js.native
    def credential(idToken: Unit, accessToken: String): AuthCredential = js.native
  }
  
  @js.native
  trait TypeofPhoneAuthProvider
    extends StObject
       with Instantiable0[PhoneAuthProvider] {
    
    var PHONE_SIGN_IN_METHOD: String = js.native
    
    var PROVIDER_ID: String = js.native
    
    def credential(verificationId: String, verificationCode: String): AuthCredential = js.native
  }
  
  @js.native
  trait TypeofPhoneMultiFactorGen
    extends StObject
       with Instantiable0[PhoneMultiFactorGenerator] {
    
    var FACTOR_ID: String = js.native
    
    def assertion(phoneAuthCredential: PhoneAuthCredential): PhoneMultiFactorAssertion = js.native
  }
  
  @js.native
  trait TypeofTwitterAuthProvider
    extends StObject
       with Instantiable0[TwitterAuthProvider] {
    
    var PROVIDER_ID: String = js.native
    
    var TWITTER_SIGN_IN_METHOD: String = js.native
    
    def credential(token: String, secret: String): AuthCredential = js.native
  }
}
