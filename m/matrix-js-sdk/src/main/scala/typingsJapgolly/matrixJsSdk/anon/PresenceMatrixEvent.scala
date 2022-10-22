package typingsJapgolly.matrixJsSdk.anon

import typingsJapgolly.matrixJsSdk.mod.EventContentTypeMessage
import typingsJapgolly.matrixJsSdk.mod.EventType
import typingsJapgolly.matrixJsSdk.mod.MatrixEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresenceMatrixEvent extends StObject {
  
  var presence: MatrixEvent[EventContentTypeMessage, EventType]
}
object PresenceMatrixEvent {
  
  inline def apply(presence: MatrixEvent[EventContentTypeMessage, EventType]): PresenceMatrixEvent = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresenceMatrixEvent]
  }
  
  extension [Self <: PresenceMatrixEvent](x: Self) {
    
    inline def setPresence(value: MatrixEvent[EventContentTypeMessage, EventType]): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
  }
}
