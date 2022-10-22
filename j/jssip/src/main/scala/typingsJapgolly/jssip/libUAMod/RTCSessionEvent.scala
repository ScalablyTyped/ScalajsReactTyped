package typingsJapgolly.jssip.libUAMod

import typingsJapgolly.jssip.libRtcsessionMod.Originator.LOCAL
import typingsJapgolly.jssip.libRtcsessionMod.Originator.REMOTE
import typingsJapgolly.jssip.libRtcsessionMod.RTCSession
import typingsJapgolly.jssip.libSipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jssip.libUAMod.IncomingRTCSessionEvent
  - typingsJapgolly.jssip.libUAMod.OutgoingRTCSessionEvent
*/
trait RTCSessionEvent extends StObject
object RTCSessionEvent {
  
  inline def IncomingRTCSessionEvent(originator: REMOTE, request: IncomingRequest, session: RTCSession): typingsJapgolly.jssip.libUAMod.IncomingRTCSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jssip.libUAMod.IncomingRTCSessionEvent]
  }
  
  inline def OutgoingRTCSessionEvent(originator: LOCAL, request: IncomingRequest, session: RTCSession): typingsJapgolly.jssip.libUAMod.OutgoingRTCSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jssip.libUAMod.OutgoingRTCSessionEvent]
  }
}
