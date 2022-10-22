package typingsJapgolly.chromeApps.chrome

import typingsJapgolly.chromeApps.anon.INVALIDPIN
import typingsJapgolly.chromeApps.anon.PIN
import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PIN
import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PUK
import typingsJapgolly.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typingsJapgolly.chromeApps.chromeAppsStrings.PUK
import typingsJapgolly.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.certificateProvider
//////////////////////////
// Certificate Provider //
//////////////////////////
/**
  * @requires(CrOS) Chrome OS only.
  * @requires Permissions: 'certificateProvider'
  * @description
  * Use this API to expose certificates to the platform which
  * can use these certificates for TLS authentications.
  */
object certificateProvider {
  
  trait CertificateInfo extends StObject {
    
    /**
      * Must be the DER encoding of a X.509 certificate. Currently, only
      * certificates of RSA keys are supported.
      */
    var certificate: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
    
    /**
      * Must be set to all hashes supported for this certificate. This app
      * will only be asked for signatures of digests calculated with one of these
      * hash algorithms. This should be in order of decreasing hash preference.
      * @see Hash
      */
    var supportedHashes: js.UndefOr[js.Array[Hash]] = js.undefined
  }
  object CertificateInfo {
    
    inline def apply(): CertificateInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateInfo]
    }
    
    extension [Self <: CertificateInfo](x: Self) {
      
      inline def setCertificate(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      inline def setSupportedHashes(value: js.Array[Hash]): Self = StObject.set(x, "supportedHashes", value.asInstanceOf[js.Any])
      
      inline def setSupportedHashesUndefined: Self = StObject.set(x, "supportedHashes", js.undefined)
      
      inline def setSupportedHashesVarargs(value: Hash*): Self = StObject.set(x, "supportedHashes", js.Array(value*))
    }
  }
  
  /** Hash type */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.MD5_SHA1
    - typingsJapgolly.chromeApps.chromeAppsStrings.SHA1
    - typingsJapgolly.chromeApps.chromeAppsStrings.SHA256
    - typingsJapgolly.chromeApps.chromeAppsStrings.SHA384
    - typingsJapgolly.chromeApps.chromeAppsStrings.SHA512
  */
  trait Hash extends StObject
  object Hash {
    
    inline def MD5_SHA1: typingsJapgolly.chromeApps.chromeAppsStrings.MD5_SHA1 = "MD5_SHA1".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.MD5_SHA1]
    
    inline def SHA1: typingsJapgolly.chromeApps.chromeAppsStrings.SHA1 = "SHA1".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.SHA1]
    
    inline def SHA256: typingsJapgolly.chromeApps.chromeAppsStrings.SHA256 = "SHA256".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.SHA256]
    
    inline def SHA384: typingsJapgolly.chromeApps.chromeAppsStrings.SHA384 = "SHA384".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.SHA384]
    
    inline def SHA512: typingsJapgolly.chromeApps.chromeAppsStrings.SHA512 = "SHA512".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.SHA512]
  }
  
  trait PinResponseDetails extends StObject {
    
    var userInput: js.UndefOr[String] = js.undefined
  }
  object PinResponseDetails {
    
    inline def apply(): PinResponseDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinResponseDetails]
    }
    
    extension [Self <: PinResponseDetails](x: Self) {
      
      inline def setUserInput(value: String): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
      
      inline def setUserInputUndefined: Self = StObject.set(x, "userInput", js.undefined)
    }
  }
  
  trait RequestPinDetails extends StObject {
    
    /**
      * The number of attempts left. This is provided so that any UI can present
      * this information to the user. Chrome is not expected to enforce this,
      * instead stopPinRequest should be called by the app with
      * errorType = MAX_ATTEMPTS_EXCEEDED when the number of pin requests is
      * exceeded.
      */
    var attemptsLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * The error template displayed to the user. This should be set if the
      * previous request failed, to notify the user of the failure reason.
      * @see PinRequestErrorType
      */
    var errorType: js.UndefOr[
        ToStringLiteral[
          INVALIDPIN, 
          /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'} extends keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'} ? std.Exclude<keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'}, 'INVALID_PIN' | 'INVALID_PUK' | 'MAX_ATTEMPTS_EXCEEDED' | 'UNKNOWN_ERROR'> : never */ js.Any
        ]
      ] = js.undefined
    
    /**
      * The type of code requested. Default is PIN.
      * @see PinRequestType
      */
    var requestType: js.UndefOr[
        ToStringLiteral[
          PIN, 
          /* keyof chrome-apps.anon.PIN */ typingsJapgolly.chromeApps.chromeAppsStrings.PIN | PUK, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  PIN :'PIN',   PUK :'PUK'} extends keyof {  PIN :'PIN',   PUK :'PUK'} ? std.Exclude<keyof {  PIN :'PIN',   PUK :'PUK'}, 'PIN' | 'PUK'> : never */ js.Any
        ]
      ] = js.undefined
    
    /**
      * The ID given by Chrome in SignRequest.
      */
    var signRequestId: Double
  }
  object RequestPinDetails {
    
    inline def apply(signRequestId: Double): RequestPinDetails = {
      val __obj = js.Dynamic.literal(signRequestId = signRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestPinDetails]
    }
    
    extension [Self <: RequestPinDetails](x: Self) {
      
      inline def setAttemptsLeft(value: Double): Self = StObject.set(x, "attemptsLeft", value.asInstanceOf[js.Any])
      
      inline def setAttemptsLeftUndefined: Self = StObject.set(x, "attemptsLeft", js.undefined)
      
      inline def setErrorType(
        value: ToStringLiteral[
              INVALIDPIN, 
              /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'} extends keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'} ? std.Exclude<keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'}, 'INVALID_PIN' | 'INVALID_PUK' | 'MAX_ATTEMPTS_EXCEEDED' | 'UNKNOWN_ERROR'> : never */ js.Any
            ]
      ): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
      
      inline def setRequestType(
        value: ToStringLiteral[
              PIN, 
              /* keyof chrome-apps.anon.PIN */ typingsJapgolly.chromeApps.chromeAppsStrings.PIN | PUK, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  PIN :'PIN',   PUK :'PUK'} extends keyof {  PIN :'PIN',   PUK :'PUK'} ? std.Exclude<keyof {  PIN :'PIN',   PUK :'PUK'}, 'PIN' | 'PUK'> : never */ js.Any
            ]
      ): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setSignRequestId(value: Double): Self = StObject.set(x, "signRequestId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignRequest extends StObject {
    
    /**
      * The DER encoding of a X.509 certificate. The app must sign
      * *digest* using the associated private key.
      */
    var certificate: js.typedarray.ArrayBuffer
    
    /** The digest that must be signed */
    var digest: js.typedarray.ArrayBuffer
    
    /** Refers to the hash algorithm that was used to create *digest*. */
    var hash: Hash
    
    /**
      * The unique ID to be used by the app should it need to call a method
      * that requires it, e.g. requestPin.
      */
    var signRequestId: integer
  }
  object SignRequest {
    
    inline def apply(
      certificate: js.typedarray.ArrayBuffer,
      digest: js.typedarray.ArrayBuffer,
      hash: Hash,
      signRequestId: integer
    ): SignRequest = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], signRequestId = signRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignRequest]
    }
    
    extension [Self <: SignRequest](x: Self) {
      
      inline def setCertificate(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setDigest(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setSignRequestId(value: integer): Self = StObject.set(x, "signRequestId", value.asInstanceOf[js.Any])
    }
  }
  
  trait StopRequestPinDetails extends StObject {
    
    /**
      * The error template. If present it is displayed to user. Intended to
      * contain the reason for stopping the flow if it was caused by an error,
      * e.g. MAX_ATTEMPTS_EXCEEDED.
      * @see PinRequestErrorType
      */
    var errorType: js.UndefOr[
        ToStringLiteral[
          INVALIDPIN, 
          /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'} extends keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'} ? std.Exclude<keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'}, 'INVALID_PIN' | 'INVALID_PUK' | 'MAX_ATTEMPTS_EXCEEDED' | 'UNKNOWN_ERROR'> : never */ js.Any
        ]
      ] = js.undefined
    
    /**
      * The ID given by Chrome in SignRequest
      */
    var signRequestId: Double
  }
  object StopRequestPinDetails {
    
    inline def apply(signRequestId: Double): StopRequestPinDetails = {
      val __obj = js.Dynamic.literal(signRequestId = signRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[StopRequestPinDetails]
    }
    
    extension [Self <: StopRequestPinDetails](x: Self) {
      
      inline def setErrorType(
        value: ToStringLiteral[
              INVALIDPIN, 
              /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'} extends keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'} ? std.Exclude<keyof {  INVALID_PIN :'INVALID_PIN',   INVALID_PUK :'INVALID_PUK',   MAX_ATTEMPTS_EXCEEDED :'MAX_ATTEMPTS_EXCEEDED',   UNKNOWN_ERROR :'UNKNOWN_ERROR'}, 'INVALID_PIN' | 'INVALID_PUK' | 'MAX_ATTEMPTS_EXCEEDED' | 'UNKNOWN_ERROR'> : never */ js.Any
            ]
      ): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
      
      inline def setSignRequestId(value: Double): Self = StObject.set(x, "signRequestId", value.asInstanceOf[js.Any])
    }
  }
}
