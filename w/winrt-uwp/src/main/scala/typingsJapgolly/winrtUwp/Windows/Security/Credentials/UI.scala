package typingsJapgolly.winrtUwp.Windows.Security.Credentials

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables you to use credentials without the complexity of the underlying operations, providing a uniform experience for credentials that reduces credential prompting to an absolute minimum. This namespace collects various types of credentials from users, stores them on the local computer, and presents them to web services and proxies by using existing authentication models. */
object UI {
  
  @js.native
  sealed trait AuthenticationProtocol extends StObject
  /** Identifies which authentication protocol to use. */
  @JSGlobal("Windows.Security.Credentials.UI.AuthenticationProtocol")
  @js.native
  object AuthenticationProtocol extends StObject {
    
    /** The authentication protocol is basic. Credentials are returned to the caller as plaintext. */
    @js.native
    sealed trait basic
      extends StObject
         with AuthenticationProtocol
    
    /** The authentication protocol is for remote access using the Credential Security Support Provider (CredSSP) protocol. */
    @js.native
    sealed trait credSsp
      extends StObject
         with AuthenticationProtocol
    
    /** The authentication protocol is anything other than the previous ones. Credentials are returned to the caller as plaintext. */
    @js.native
    sealed trait custom
      extends StObject
         with AuthenticationProtocol
    
    /** The authentication protocol is digest. Credentials are returned to the caller as plaintext. */
    @js.native
    sealed trait digest
      extends StObject
         with AuthenticationProtocol
    
    /** The authentication protocol is Kerberos. Credentials are transformed before being returned to the caller. */
    @js.native
    sealed trait kerberos
      extends StObject
         with AuthenticationProtocol
    
    /** The authentication protocol is negotiate, including negotiate extensions. Credentials are transformed before being returned to the caller. */
    @js.native
    sealed trait negotiate
      extends StObject
         with AuthenticationProtocol
    
    /** The authentication protocol is NTLM. Credentials are transformed before being returned to the caller. */
    @js.native
    sealed trait ntlm
      extends StObject
         with AuthenticationProtocol
  }
  
  @js.native
  sealed trait CredentialSaveOption extends StObject
  /** Identifies the state of the dialog box option on whether to save credentials. */
  @JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
  @js.native
  object CredentialSaveOption extends StObject {
    
    /** The "Save credentials?" dialog box is not displayed at all. */
    @js.native
    sealed trait hidden
      extends StObject
         with CredentialSaveOption
    
    /** The "Save credentials?" dialog box is selected, indicating that the user wants their credentials saved. */
    @js.native
    sealed trait selected
      extends StObject
         with CredentialSaveOption
    
    /** The "Save credentials?" dialog box is not selected, indicating that the user doesn't want their credentials saved. */
    @js.native
    sealed trait unselected
      extends StObject
         with CredentialSaveOption
  }
  
  @js.native
  sealed trait UserConsentVerificationResult extends StObject
  /** Describes the result of a biometric (fingerprint) verification operation. */
  @JSGlobal("Windows.Security.Credentials.UI.UserConsentVerificationResult")
  @js.native
  object UserConsentVerificationResult extends StObject {
    
    /** The verification operation was canceled. */
    @js.native
    sealed trait canceled
      extends StObject
         with UserConsentVerificationResult
    
    /** The biometric verifier device is performing an operation and is unavailable. */
    @js.native
    sealed trait deviceBusy
      extends StObject
         with UserConsentVerificationResult
    
    /** There is no biometric verifier device available. */
    @js.native
    sealed trait deviceNotPresent
      extends StObject
         with UserConsentVerificationResult
    
    /** Group policy has disabled the biometric verifier device. */
    @js.native
    sealed trait disabledByPolicy
      extends StObject
         with UserConsentVerificationResult
    
    /** A biometric verifier device is not configured for this user. */
    @js.native
    sealed trait notConfiguredForUser
      extends StObject
         with UserConsentVerificationResult
    
    /** After 10 attempts, the original verification request and all subsequent attempts at the same verification were not verified. */
    @js.native
    sealed trait retriesExhausted
      extends StObject
         with UserConsentVerificationResult
    
    /** The fingerprint was verified. */
    @js.native
    sealed trait verified
      extends StObject
         with UserConsentVerificationResult
  }
  
  @js.native
  sealed trait UserConsentVerifierAvailability extends StObject
  /** Describes the result of a check for a biometric (fingerprint) verifier device. */
  @JSGlobal("Windows.Security.Credentials.UI.UserConsentVerifierAvailability")
  @js.native
  object UserConsentVerifierAvailability extends StObject {
    
    /** A biometric verifier device is available. */
    @js.native
    sealed trait available
      extends StObject
         with UserConsentVerifierAvailability
    
    /** The biometric verifier device is performing an operation and is unavailable. */
    @js.native
    sealed trait deviceBusy
      extends StObject
         with UserConsentVerifierAvailability
    
    /** There is no biometric verifier device available. */
    @js.native
    sealed trait deviceNotPresent
      extends StObject
         with UserConsentVerifierAvailability
    
    /** Group policy has disabled the biometric verifier device. */
    @js.native
    sealed trait disabledByPolicy
      extends StObject
         with UserConsentVerifierAvailability
    
    /** A biometric verifier device is not configured for this user. */
    @js.native
    sealed trait notConfiguredForUser
      extends StObject
         with UserConsentVerifierAvailability
  }
  
  /** Creates an asynchronous object that displays a dialog box of credentials to the user and collects the user's response. */
  trait CredentialPicker extends StObject
  
  /** Controls the appearance and behavior of a credential prompt. */
  trait CredentialPickerOptions extends StObject {
    
    /** Gets or sets the option of whether the dialog box is displayed. */
    var alwaysDisplayDialog: Boolean
    
    /** Gets or sets the authentication protocol. */
    var authenticationProtocol: AuthenticationProtocol
    
    /** Gets or sets whether the caller wants to save the credentials. */
    var callerSavesCredential: Boolean
    
    /** Gets or sets the caption text that is displayed to the user. */
    var caption: String
    
    /** Gets or sets the option on saving credentials. */
    var credentialSaveOption: CredentialSaveOption
    
    /** Gets or sets whether the authentication protocol is custom rather than a standard authentication protocol. */
    var customAuthenticationProtocol: String
    
    /** Gets or sets the error code. */
    var errorCode: Double
    
    /** Gets or sets the body of text that displays to the user. */
    var message: String
    
    /** Gets or sets whether to fill dialog box fields with previous credentials. */
    var previousCredential: IBuffer
    
    /** Gets or sets the name of the target computer. */
    var targetName: String
  }
  object CredentialPickerOptions {
    
    inline def apply(
      alwaysDisplayDialog: Boolean,
      authenticationProtocol: AuthenticationProtocol,
      callerSavesCredential: Boolean,
      caption: String,
      credentialSaveOption: CredentialSaveOption,
      customAuthenticationProtocol: String,
      errorCode: Double,
      message: String,
      previousCredential: IBuffer,
      targetName: String
    ): CredentialPickerOptions = {
      val __obj = js.Dynamic.literal(alwaysDisplayDialog = alwaysDisplayDialog.asInstanceOf[js.Any], authenticationProtocol = authenticationProtocol.asInstanceOf[js.Any], callerSavesCredential = callerSavesCredential.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], credentialSaveOption = credentialSaveOption.asInstanceOf[js.Any], customAuthenticationProtocol = customAuthenticationProtocol.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], previousCredential = previousCredential.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialPickerOptions]
    }
    
    extension [Self <: CredentialPickerOptions](x: Self) {
      
      inline def setAlwaysDisplayDialog(value: Boolean): Self = StObject.set(x, "alwaysDisplayDialog", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationProtocol(value: AuthenticationProtocol): Self = StObject.set(x, "authenticationProtocol", value.asInstanceOf[js.Any])
      
      inline def setCallerSavesCredential(value: Boolean): Self = StObject.set(x, "callerSavesCredential", value.asInstanceOf[js.Any])
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCredentialSaveOption(value: CredentialSaveOption): Self = StObject.set(x, "credentialSaveOption", value.asInstanceOf[js.Any])
      
      inline def setCustomAuthenticationProtocol(value: String): Self = StObject.set(x, "customAuthenticationProtocol", value.asInstanceOf[js.Any])
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPreviousCredential(value: IBuffer): Self = StObject.set(x, "previousCredential", value.asInstanceOf[js.Any])
      
      inline def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    }
  }
  
  /** Describes the results of the dialog box operation. */
  trait CredentialPickerResults extends StObject {
    
    /** Gets the opaque credential. */
    var credential: IBuffer
    
    /** Gets the domain name portion of the unpacked credential. */
    var credentialDomainName: String
    
    /** Gets the password portion of the unpacked credential. */
    var credentialPassword: String
    
    /** Gets the state of the "Save Credentials" check box. */
    var credentialSaveOption: CredentialSaveOption
    
    /** Gets the status of the credential save operation. */
    var credentialSaved: Boolean
    
    /** Gets the user name of the unpacked credential. */
    var credentialUserName: String
    
    /** Gets the value of the error code. */
    var errorCode: Double
  }
  object CredentialPickerResults {
    
    inline def apply(
      credential: IBuffer,
      credentialDomainName: String,
      credentialPassword: String,
      credentialSaveOption: CredentialSaveOption,
      credentialSaved: Boolean,
      credentialUserName: String,
      errorCode: Double
    ): CredentialPickerResults = {
      val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialDomainName = credentialDomainName.asInstanceOf[js.Any], credentialPassword = credentialPassword.asInstanceOf[js.Any], credentialSaveOption = credentialSaveOption.asInstanceOf[js.Any], credentialSaved = credentialSaved.asInstanceOf[js.Any], credentialUserName = credentialUserName.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialPickerResults]
    }
    
    extension [Self <: CredentialPickerResults](x: Self) {
      
      inline def setCredential(value: IBuffer): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setCredentialDomainName(value: String): Self = StObject.set(x, "credentialDomainName", value.asInstanceOf[js.Any])
      
      inline def setCredentialPassword(value: String): Self = StObject.set(x, "credentialPassword", value.asInstanceOf[js.Any])
      
      inline def setCredentialSaveOption(value: CredentialSaveOption): Self = StObject.set(x, "credentialSaveOption", value.asInstanceOf[js.Any])
      
      inline def setCredentialSaved(value: Boolean): Self = StObject.set(x, "credentialSaved", value.asInstanceOf[js.Any])
      
      inline def setCredentialUserName(value: String): Self = StObject.set(x, "credentialUserName", value.asInstanceOf[js.Any])
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    }
  }
  
  /** Checks for availability of a biometric (fingerprint) verifier device and performs a biometric verification. */
  trait UserConsentVerifier extends StObject
}
