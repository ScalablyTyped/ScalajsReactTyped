package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages secure stop messages. */
trait IPlayReadySecureStopServiceRequest
  extends StObject
     with IPlayReadyServiceRequest {
  
  /** Gets the current publisher certificate property. */
  var publisherCertificate: Double
  
  /** Gets the secure stop session identifier property. */
  var sessionID: String
  
  /** Gets the secure stop session's start time property. */
  var startTime: js.Date
  
  /** Gets the secure stop session's stopped flag property which indicates whether the secure stop session for this request was cleanly shut down. */
  var stopped: Boolean
  
  /** Gets the secure stop session's update/stop time property. */
  var updateTime: js.Date
}
object IPlayReadySecureStopServiceRequest {
  
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
  ): IPlayReadySecureStopServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = beginServiceRequest.toJsFn, challengeCustomData = challengeCustomData.asInstanceOf[js.Any], generateManualEnablingChallenge = generateManualEnablingChallenge.toJsFn, nextServiceRequest = nextServiceRequest.toJsFn, processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], publisherCertificate = publisherCertificate.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], sessionID = sessionID.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadySecureStopServiceRequest]
  }
  
  extension [Self <: IPlayReadySecureStopServiceRequest](x: Self) {
    
    inline def setPublisherCertificate(value: Double): Self = StObject.set(x, "publisherCertificate", value.asInstanceOf[js.Any])
    
    inline def setSessionID(value: String): Self = StObject.set(x, "sessionID", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
