package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioScheduledSourceNodeEventMap extends StObject {
  
  /* standard dom */
  var ended: org.scalajs.dom.Event
}
object AudioScheduledSourceNodeEventMap {
  
  inline def apply(ended: org.scalajs.dom.Event): AudioScheduledSourceNodeEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioScheduledSourceNodeEventMap]
  }
  
  extension [Self <: AudioScheduledSourceNodeEventMap](x: Self) {
    
    inline def setEnded(value: org.scalajs.dom.Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
  }
}
