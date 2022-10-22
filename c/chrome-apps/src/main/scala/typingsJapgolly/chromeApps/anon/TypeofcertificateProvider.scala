package typingsJapgolly.chromeApps.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.certificateProvider.CertificateInfo
import typingsJapgolly.chromeApps.chrome.certificateProvider.PinResponseDetails
import typingsJapgolly.chromeApps.chrome.certificateProvider.RequestPinDetails
import typingsJapgolly.chromeApps.chrome.certificateProvider.SignRequest
import typingsJapgolly.chromeApps.chrome.certificateProvider.StopRequestPinDetails
import typingsJapgolly.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofcertificateProvider extends StObject {
  
  /**
    * The types of errors that can be presented to the user through the requestPin function.
    * @enum
    */
  val PinRequestErrorType: INVALIDPIN
  
  /**
    * The type of code being requested by the extension with requestPin function.
    * @enum
    */
  val PinRequestType: PIN
  
  /**
    * This event fires every time the browser requests the current list of
    * certificates provided by this app. The app must call *reportCallback*
    * exactly once with the current list of certificates.
    */
  val onCertificatesRequested: Event[
    js.Function2[
      /* certificates */ js.Array[CertificateInfo], 
      /* callback */ js.Function1[/* rejectedCertificates */ js.Array[js.typedarray.ArrayBuffer], Unit], 
      Any
    ]
  ]
  
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
  val onSignDigestRequested: Event[
    js.Function2[
      /* signRequest */ SignRequest, 
      /* signCallback */ js.Function1[/* signature */ js.UndefOr[js.typedarray.ArrayBuffer], Unit], 
      Any
    ]
  ]
  
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
  def requestPin(
    details: RequestPinDetails,
    callback: js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]
  ): Unit
  
  /**
    * @description Stops the pin request started by the *requestPin* function.
    * @param details Contains the details about the reason for stopping the request flow.
    * @param callback To be used by Chrome to send to the app the status from
    * their request to close PIN dialog for user.
    */
  def stopPinRequest(details: StopRequestPinDetails, callback: js.Function0[Unit]): Unit
}
object TypeofcertificateProvider {
  
  inline def apply(
    PinRequestErrorType: INVALIDPIN,
    PinRequestType: PIN,
    onCertificatesRequested: Event[
      js.Function2[
        /* certificates */ js.Array[CertificateInfo], 
        /* callback */ js.Function1[/* rejectedCertificates */ js.Array[js.typedarray.ArrayBuffer], Unit], 
        Any
      ]
    ],
    onSignDigestRequested: Event[
      js.Function2[
        /* signRequest */ SignRequest, 
        /* signCallback */ js.Function1[/* signature */ js.UndefOr[js.typedarray.ArrayBuffer], Unit], 
        Any
      ]
    ],
    requestPin: (RequestPinDetails, js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]) => Callback,
    stopPinRequest: (StopRequestPinDetails, js.Function0[Unit]) => Callback
  ): TypeofcertificateProvider = {
    val __obj = js.Dynamic.literal(PinRequestErrorType = PinRequestErrorType.asInstanceOf[js.Any], PinRequestType = PinRequestType.asInstanceOf[js.Any], onCertificatesRequested = onCertificatesRequested.asInstanceOf[js.Any], onSignDigestRequested = onSignDigestRequested.asInstanceOf[js.Any], requestPin = js.Any.fromFunction2((t0: RequestPinDetails, t1: js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]) => (requestPin(t0, t1)).runNow()), stopPinRequest = js.Any.fromFunction2((t0: StopRequestPinDetails, t1: js.Function0[Unit]) => (stopPinRequest(t0, t1)).runNow()))
    __obj.asInstanceOf[TypeofcertificateProvider]
  }
  
  extension [Self <: TypeofcertificateProvider](x: Self) {
    
    inline def setOnCertificatesRequested(
      value: Event[
          js.Function2[
            /* certificates */ js.Array[CertificateInfo], 
            /* callback */ js.Function1[/* rejectedCertificates */ js.Array[js.typedarray.ArrayBuffer], Unit], 
            Any
          ]
        ]
    ): Self = StObject.set(x, "onCertificatesRequested", value.asInstanceOf[js.Any])
    
    inline def setOnSignDigestRequested(
      value: Event[
          js.Function2[
            /* signRequest */ SignRequest, 
            /* signCallback */ js.Function1[/* signature */ js.UndefOr[js.typedarray.ArrayBuffer], Unit], 
            Any
          ]
        ]
    ): Self = StObject.set(x, "onSignDigestRequested", value.asInstanceOf[js.Any])
    
    inline def setPinRequestErrorType(value: INVALIDPIN): Self = StObject.set(x, "PinRequestErrorType", value.asInstanceOf[js.Any])
    
    inline def setPinRequestType(value: PIN): Self = StObject.set(x, "PinRequestType", value.asInstanceOf[js.Any])
    
    inline def setRequestPin(
      value: (RequestPinDetails, js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]) => Callback
    ): Self = StObject.set(x, "requestPin", js.Any.fromFunction2((t0: RequestPinDetails, t1: js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setStopPinRequest(value: (StopRequestPinDetails, js.Function0[Unit]) => Callback): Self = StObject.set(x, "stopPinRequest", js.Any.fromFunction2((t0: StopRequestPinDetails, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
  }
}
