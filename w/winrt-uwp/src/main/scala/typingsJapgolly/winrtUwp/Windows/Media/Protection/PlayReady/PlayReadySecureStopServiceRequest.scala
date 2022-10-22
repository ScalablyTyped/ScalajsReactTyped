package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages secure stop messages. */
trait PlayReadySecureStopServiceRequest extends StObject {
  
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
  
  /** Gets the current publisher certificate property. */
  var publisherCertificate: Double
  
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: String
  
  /** Gets the session identifier property. */
  var sessionID: String
  
  /** Gets the secure stop session's start time property. */
  var startTime: js.Date
  
  /** Gets the secure stop session's stopped flag property which indicates whether the secure stop session for this request was cleanly shut down. */
  var stopped: Boolean
  
  /** Gets the GUID for the type of operation that the PlayReady secure stop service request performs. */
  var `type`: String
  
  /** Gets the secure stop session's update/stop time property. */
  var updateTime: js.Date
  
  /** Gets or sets the URI used to perform a service request action. */
  var uri: Uri
}
object PlayReadySecureStopServiceRequest {
  
  inline def apply(
    beginServiceRequest: CallbackTo[IAsyncAction],
    challengeCustomData: String,
    generateManualEnablingChallenge: CallbackTo[PlayReadySoapMessage],
    nextServiceRequest: CallbackTo[IPlayReadyServiceRequest],
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    publisherCertificate: Double,
    responseCustomData: String,
    sessionID: String,
    startTime: js.Date,
    stopped: Boolean,
    `type`: String,
    updateTime: js.Date,
    uri: Uri
  ): PlayReadySecureStopServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = beginServiceRequest.toJsFn, challengeCustomData = challengeCustomData.asInstanceOf[js.Any], generateManualEnablingChallenge = generateManualEnablingChallenge.toJsFn, nextServiceRequest = nextServiceRequest.toJsFn, processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], publisherCertificate = publisherCertificate.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], sessionID = sessionID.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadySecureStopServiceRequest]
  }
  
  extension [Self <: PlayReadySecureStopServiceRequest](x: Self) {
    
    inline def setBeginServiceRequest(value: CallbackTo[IAsyncAction]): Self = StObject.set(x, "beginServiceRequest", value.toJsFn)
    
    inline def setChallengeCustomData(value: String): Self = StObject.set(x, "challengeCustomData", value.asInstanceOf[js.Any])
    
    inline def setGenerateManualEnablingChallenge(value: CallbackTo[PlayReadySoapMessage]): Self = StObject.set(x, "generateManualEnablingChallenge", value.toJsFn)
    
    inline def setNextServiceRequest(value: CallbackTo[IPlayReadyServiceRequest]): Self = StObject.set(x, "nextServiceRequest", value.toJsFn)
    
    inline def setProcessManualEnablingResponse(value: js.Array[Double] => WinRTError): Self = StObject.set(x, "processManualEnablingResponse", js.Any.fromFunction1(value))
    
    inline def setProtectionSystem(value: String): Self = StObject.set(x, "protectionSystem", value.asInstanceOf[js.Any])
    
    inline def setPublisherCertificate(value: Double): Self = StObject.set(x, "publisherCertificate", value.asInstanceOf[js.Any])
    
    inline def setResponseCustomData(value: String): Self = StObject.set(x, "responseCustomData", value.asInstanceOf[js.Any])
    
    inline def setSessionID(value: String): Self = StObject.set(x, "sessionID", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
