package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTrackCueEventMap extends StObject {
  
  /* standard dom */
  var enter: org.scalajs.dom.Event
  
  /* standard dom */
  var exit: org.scalajs.dom.Event
}
object TextTrackCueEventMap {
  
  inline def apply(enter: org.scalajs.dom.Event, exit: org.scalajs.dom.Event): TextTrackCueEventMap = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCueEventMap]
  }
  
  extension [Self <: TextTrackCueEventMap](x: Self) {
    
    inline def setEnter(value: org.scalajs.dom.Event): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setExit(value: org.scalajs.dom.Event): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
  }
}
