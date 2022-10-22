package typingsJapgolly.winrtUwp.Windows.Devices.SmartCards

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a smart card personal identification number (PIN) reset request. */
trait SmartCardPinResetRequest extends StObject {
  
  /** Gets the smart card's challenge value. */
  var challenge: IBuffer
  
  /** Gets the length of time to wait before requesting the smart card personal identification number (PIN) reset. */
  var deadline: js.Date
  
  /**
    * Gets an instance of a wait time for a requested smart card personal identification number (PIN) reset.
    * @return An instance of a wait time for a requested smart card PIN reset.
    */
  def getDeferral(): SmartCardPinResetDeferral
  
  /**
    * Sets the response to a smart card authentication challenge/response operation.
    * @param response The response to a smart card authentication challenge/response operation.
    */
  def setResponse(response: IBuffer): Unit
}
object SmartCardPinResetRequest {
  
  inline def apply(
    challenge: IBuffer,
    deadline: js.Date,
    getDeferral: CallbackTo[SmartCardPinResetDeferral],
    setResponse: IBuffer => Callback
  ): SmartCardPinResetRequest = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, setResponse = js.Any.fromFunction1((t0: IBuffer) => setResponse(t0).runNow()))
    __obj.asInstanceOf[SmartCardPinResetRequest]
  }
  
  extension [Self <: SmartCardPinResetRequest](x: Self) {
    
    inline def setChallenge(value: IBuffer): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[SmartCardPinResetDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setSetResponse(value: IBuffer => Callback): Self = StObject.set(x, "setResponse", js.Any.fromFunction1((t0: IBuffer) => value(t0).runNow()))
  }
}
