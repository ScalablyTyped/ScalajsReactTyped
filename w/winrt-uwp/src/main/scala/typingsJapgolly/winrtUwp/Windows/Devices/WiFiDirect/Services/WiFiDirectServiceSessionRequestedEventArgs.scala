package typingsJapgolly.winrtUwp.Windows.Devices.WiFiDirect.Services

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returned when a WiFiDirectServiceAdvertiser.SessionRequested event is raised. */
trait WiFiDirectServiceSessionRequestedEventArgs extends StObject {
  
  /**
    * Gets information about the session request that raised a WiFiDirectServiceAdvertiser.SessionRequested event.
    * @return Information about a new session request.
    */
  def getSessionRequest(): WiFiDirectServiceSessionRequest
}
object WiFiDirectServiceSessionRequestedEventArgs {
  
  inline def apply(getSessionRequest: CallbackTo[WiFiDirectServiceSessionRequest]): WiFiDirectServiceSessionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(getSessionRequest = getSessionRequest.toJsFn)
    __obj.asInstanceOf[WiFiDirectServiceSessionRequestedEventArgs]
  }
  
  extension [Self <: WiFiDirectServiceSessionRequestedEventArgs](x: Self) {
    
    inline def setGetSessionRequest(value: CallbackTo[WiFiDirectServiceSessionRequest]): Self = StObject.set(x, "getSessionRequest", value.toJsFn)
  }
}
