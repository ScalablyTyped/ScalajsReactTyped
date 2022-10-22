package typingsJapgolly.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantLeftEvent extends StObject {
  
  var id: String
}
object ParticipantLeftEvent {
  
  inline def apply(id: String): ParticipantLeftEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantLeftEvent]
  }
  
  extension [Self <: ParticipantLeftEvent](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
