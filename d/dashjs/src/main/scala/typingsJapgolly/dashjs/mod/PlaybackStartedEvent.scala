package typingsJapgolly.dashjs.mod

import typingsJapgolly.dashjs.dashjsStrings.playbackStarted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackStartedEvent
  extends StObject
     with Event {
  
  var startTime: Double | Null
  
  @JSName("type")
  var type_PlaybackStartedEvent: playbackStarted
}
object PlaybackStartedEvent {
  
  inline def apply(): PlaybackStartedEvent = {
    val __obj = js.Dynamic.literal(startTime = null)
    __obj.updateDynamic("type")("playbackStarted")
    __obj.asInstanceOf[PlaybackStartedEvent]
  }
  
  extension [Self <: PlaybackStartedEvent](x: Self) {
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setType(value: playbackStarted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
