package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamTrackEventMap extends StObject {
  
  /* standard dom */
  var ended: org.scalajs.dom.Event
  
  /* standard dom */
  var mute: org.scalajs.dom.Event
  
  /* standard dom */
  var unmute: org.scalajs.dom.Event
}
object MediaStreamTrackEventMap {
  
  inline def apply(ended: org.scalajs.dom.Event, mute: org.scalajs.dom.Event, unmute: org.scalajs.dom.Event): MediaStreamTrackEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], unmute = unmute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackEventMap]
  }
  
  extension [Self <: MediaStreamTrackEventMap](x: Self) {
    
    inline def setEnded(value: org.scalajs.dom.Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    inline def setMute(value: org.scalajs.dom.Event): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setUnmute(value: org.scalajs.dom.Event): Self = StObject.set(x, "unmute", value.asInstanceOf[js.Any])
  }
}
