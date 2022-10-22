package typingsJapgolly.chromeApps.global.chrome

import typingsJapgolly.chromeApps.chrome.certificateProvider.CertificateInfo
import typingsJapgolly.chromeApps.chrome.certificateProvider.PinResponseDetails
import typingsJapgolly.chromeApps.chrome.certificateProvider.RequestPinDetails
import typingsJapgolly.chromeApps.chrome.certificateProvider.SignRequest
import typingsJapgolly.chromeApps.chrome.certificateProvider.StopRequestPinDetails
import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PIN
import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PUK
import typingsJapgolly.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typingsJapgolly.chromeApps.chromeAppsStrings.PIN
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
  
  @JSGlobal("chrome.certificateProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The types of errors that can be presented to the user through the requestPin function.
    * @enum
    */
  object PinRequestErrorType {
    
    @JSGlobal("chrome.certificateProvider.PinRequestErrorType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.certificateProvider.PinRequestErrorType.INVALID_PIN")
    @js.native
    def INVALID_PIN: typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PIN = js.native
    inline def INVALID_PIN_=(x: INVALID_PIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_PIN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.certificateProvider.PinRequestErrorType.INVALID_PUK")
    @js.native
    def INVALID_PUK: typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PUK = js.native
    inline def INVALID_PUK_=(x: INVALID_PUK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_PUK")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.certificateProvider.PinRequestErrorType.MAX_ATTEMPTS_EXCEEDED")
    @js.native
    def MAX_ATTEMPTS_EXCEEDED: typingsJapgolly.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED = js.native
    inline def MAX_ATTEMPTS_EXCEEDED_=(x: MAX_ATTEMPTS_EXCEEDED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_ATTEMPTS_EXCEEDED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.certificateProvider.PinRequestErrorType.UNKNOWN_ERROR")
    @js.native
    def UNKNOWN_ERROR: typingsJapgolly.chromeApps.chromeAppsStrings.UNKNOWN_ERROR = js.native
    inline def UNKNOWN_ERROR_=(x: UNKNOWN_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(x.asInstanceOf[js.Any])
  }
  
  /**
    * The type of code being requested by the extension with requestPin function.
    * @enum
    */
  object PinRequestType {
    
    @JSGlobal("chrome.certificateProvider.PinRequestType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.certificateProvider.PinRequestType.PIN")
    @js.native
    def PIN: typingsJapgolly.chromeApps.chromeAppsStrings.PIN = js.native
    inline def PIN_=(x: PIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PIN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.certificateProvider.PinRequestType.PUK")
    @js.native
    def PUK: typingsJapgolly.chromeApps.chromeAppsStrings.PUK = js.native
    inline def PUK_=(x: PUK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUK")(x.asInstanceOf[js.Any])
  }
  
  /**
    * This event fires every time the browser requests the current list of
    * certificates provided by this app. The app must call *reportCallback*
    * exactly once with the current list of certificates.
    */
  @JSGlobal("chrome.certificateProvider.onCertificatesRequested")
  @js.native
  val onCertificatesRequested: typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function2[
      /* certificates */ js.Array[CertificateInfo], 
      /* callback */ js.Function1[/* rejectedCertificates */ js.Array[js.typedarray.ArrayBuffer], Unit], 
      Any
    ]
  ] = js.native
  
  /**
    * This event fires every time the browser needs to sign
    * a message using a certificate provided by this app
    * in reply to an *onCertificatesRequested* event.
    *
    * The app must sign the data in *request* using the
    * appropriate algorithm and private key and return it by calling
    * *reportCallback*. *reportCallback* must be called exactly once.
    * @param request: Contains the details about the sign request.
    */
  @JSGlobal("chrome.certificateProvider.onSignDigestRequested")
  @js.native
  val onSignDigestRequested: typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function2[
      /* signRequest */ SignRequest, 
      /* signCallback */ js.Function1[/* signature */ js.UndefOr[js.typedarray.ArrayBuffer], Unit], 
      Any
    ]
  ] = js.native
  
  /**
    * Requests the PIN from the user. Only one ongoing request at a time is
    * allowed. The requests issued while another flow is ongoing are rejected.
    * It's the apps's responsibility to try again later if another flow is
    * in progress.
    * @param details Contains the details about the requested dialog.
    * @param callback Is called when the dialog is resolved with the user input, or
    * when the dialog request finishes unsuccessfully (e.g. the dialog was
    * canceled by the user or was not allowed to be shown).
    */
  inline def requestPin(
    details: RequestPinDetails,
    callback: js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestPin")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @description Stops the pin request started by the *requestPin* function.
    * @param details Contains the details about the reason for stopping the request flow.
    * @param callback To be used by Chrome to send to the app the status from
    * their request to close PIN dialog for user.
    */
  inline def stopPinRequest(details: StopRequestPinDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stopPinRequest")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
