package typingsJapgolly.chrome.chrome.cast

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiConfig extends StObject {
  
  var autoJoinPolicy: AutoJoinPolicy
  
  var defaultActionPolicy: DefaultActionPolicy
  
  def receiverListener(receiverAvailability: ReceiverAvailability): Unit
  
  def sessionListener(session: Session): Unit
  
  var sessionRequest: SessionRequest
}
object ApiConfig {
  
  inline def apply(
    autoJoinPolicy: AutoJoinPolicy,
    defaultActionPolicy: DefaultActionPolicy,
    receiverListener: ReceiverAvailability => Callback,
    sessionListener: Session => Callback,
    sessionRequest: SessionRequest
  ): ApiConfig = {
    val __obj = js.Dynamic.literal(autoJoinPolicy = autoJoinPolicy.asInstanceOf[js.Any], defaultActionPolicy = defaultActionPolicy.asInstanceOf[js.Any], receiverListener = js.Any.fromFunction1((t0: ReceiverAvailability) => receiverListener(t0).runNow()), sessionListener = js.Any.fromFunction1((t0: Session) => sessionListener(t0).runNow()), sessionRequest = sessionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiConfig]
  }
  
  extension [Self <: ApiConfig](x: Self) {
    
    inline def setAutoJoinPolicy(value: AutoJoinPolicy): Self = StObject.set(x, "autoJoinPolicy", value.asInstanceOf[js.Any])
    
    inline def setDefaultActionPolicy(value: DefaultActionPolicy): Self = StObject.set(x, "defaultActionPolicy", value.asInstanceOf[js.Any])
    
    inline def setReceiverListener(value: ReceiverAvailability => Callback): Self = StObject.set(x, "receiverListener", js.Any.fromFunction1((t0: ReceiverAvailability) => value(t0).runNow()))
    
    inline def setSessionListener(value: Session => Callback): Self = StObject.set(x, "sessionListener", js.Any.fromFunction1((t0: Session) => value(t0).runNow()))
    
    inline def setSessionRequest(value: SessionRequest): Self = StObject.set(x, "sessionRequest", value.asInstanceOf[js.Any])
  }
}
