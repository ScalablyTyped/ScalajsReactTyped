package typingsJapgolly.webAnimationsJs

import typingsJapgolly.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationPlaybackEventInit
  extends StObject
     with EventInit {
  
  var currentTime: js.UndefOr[Double | Null] = js.undefined
  
  var timelineTime: js.UndefOr[Double | Null] = js.undefined
}
object AnimationPlaybackEventInit {
  
  inline def apply(): AnimationPlaybackEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationPlaybackEventInit]
  }
  
  extension [Self <: AnimationPlaybackEventInit](x: Self) {
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeNull: Self = StObject.set(x, "currentTime", null)
    
    inline def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    inline def setTimelineTime(value: Double): Self = StObject.set(x, "timelineTime", value.asInstanceOf[js.Any])
    
    inline def setTimelineTimeNull: Self = StObject.set(x, "timelineTime", null)
    
    inline def setTimelineTimeUndefined: Self = StObject.set(x, "timelineTime", js.undefined)
  }
}
