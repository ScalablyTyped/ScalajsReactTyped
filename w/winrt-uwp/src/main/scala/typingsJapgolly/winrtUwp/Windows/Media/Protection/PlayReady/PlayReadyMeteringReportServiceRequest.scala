package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the service methods for content metering operations. */
trait PlayReadyMeteringReportServiceRequest extends StObject {
  
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): IAsyncAction
  
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: String
  
  /**
    * Begins the process of manually enabling.
    * @return The SOAP message to be used in a manual license acquisition challenge request.
    */
  def generateManualEnablingChallenge(): PlayReadySoapMessage
  
  /** Gets or sets the current metering certificate property. */
  var meteringCertificate: Double
  
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  def nextServiceRequest(): IPlayReadyServiceRequest
  
  /**
    * Process the raw binary result of a manual enabling challenge.
    * @param responseBytes The response result to be processed.
    * @return If the methods succeeds, it returns S_OK. If it fails, it returns an error code.
    */
  def processManualEnablingResponse(responseBytes: js.Array[Double]): WinRTError
  
  /** Gets the vendor content protection system identifier. */
  var protectionSystem: String
  
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: String
  
  /** Gets the GUID for the type of operation that the PlayReady metering report service request performs. */
  var `type`: String
  
  /** Gets or sets the URI used to perform a service request action. */
  var uri: Uri
}
object PlayReadyMeteringReportServiceRequest {
  
  inline def apply(
    beginServiceRequest: CallbackTo[IAsyncAction],
    challengeCustomData: String,
    generateManualEnablingChallenge: CallbackTo[PlayReadySoapMessage],
    meteringCertificate: Double,
    nextServiceRequest: CallbackTo[IPlayReadyServiceRequest],
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    responseCustomData: String,
    `type`: String,
    uri: Uri
  ): PlayReadyMeteringReportServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = beginServiceRequest.toJsFn, challengeCustomData = challengeCustomData.asInstanceOf[js.Any], generateManualEnablingChallenge = generateManualEnablingChallenge.toJsFn, meteringCertificate = meteringCertificate.asInstanceOf[js.Any], nextServiceRequest = nextServiceRequest.toJsFn, processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadyMeteringReportServiceRequest]
  }
  
  extension [Self <: PlayReadyMeteringReportServiceRequest](x: Self) {
    
    inline def setBeginServiceRequest(value: CallbackTo[IAsyncAction]): Self = StObject.set(x, "beginServiceRequest", value.toJsFn)
    
    inline def setChallengeCustomData(value: String): Self = StObject.set(x, "challengeCustomData", value.asInstanceOf[js.Any])
    
    inline def setGenerateManualEnablingChallenge(value: CallbackTo[PlayReadySoapMessage]): Self = StObject.set(x, "generateManualEnablingChallenge", value.toJsFn)
    
    inline def setMeteringCertificate(value: Double): Self = StObject.set(x, "meteringCertificate", value.asInstanceOf[js.Any])
    
    inline def setNextServiceRequest(value: CallbackTo[IPlayReadyServiceRequest]): Self = StObject.set(x, "nextServiceRequest", value.toJsFn)
    
    inline def setProcessManualEnablingResponse(value: js.Array[Double] => WinRTError): Self = StObject.set(x, "processManualEnablingResponse", js.Any.fromFunction1(value))
    
    inline def setProtectionSystem(value: String): Self = StObject.set(x, "protectionSystem", value.asInstanceOf[js.Any])
    
    inline def setResponseCustomData(value: String): Self = StObject.set(x, "responseCustomData", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
