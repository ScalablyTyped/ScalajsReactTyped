package typingsJapgolly.dashjs.mod

import typingsJapgolly.dashjs.dashjsStrings.playbackSeeking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackSeekingEvent
  extends StObject
     with Event {
  
  var seekTime: Double | Null
  
  @JSName("type")
  var type_PlaybackSeekingEvent: playbackSeeking
}
object PlaybackSeekingEvent {
  
  inline def apply(): PlaybackSeekingEvent = {
    val __obj = js.Dynamic.literal(seekTime = null)
    __obj.updateDynamic("type")("playbackSeeking")
    __obj.asInstanceOf[PlaybackSeekingEvent]
  }
  
  extension [Self <: PlaybackSeekingEvent](x: Self) {
    
    inline def setSeekTime(value: Double): Self = StObject.set(x, "seekTime", value.asInstanceOf[js.Any])
    
    inline def setSeekTimeNull: Self = StObject.set(x, "seekTime", null)
    
    inline def setType(value: playbackSeeking): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
