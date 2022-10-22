package typingsJapgolly.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoMuteStatusChangedEvent extends StObject {
  
  var muted: Boolean
}
object VideoMuteStatusChangedEvent {
  
  inline def apply(muted: Boolean): VideoMuteStatusChangedEvent = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoMuteStatusChangedEvent]
  }
  
  extension [Self <: VideoMuteStatusChangedEvent](x: Self) {
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
  }
}
