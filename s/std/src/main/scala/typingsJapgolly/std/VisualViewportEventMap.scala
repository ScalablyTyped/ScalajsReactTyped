package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualViewportEventMap extends StObject {
  
  /* standard dom */
  var resize: org.scalajs.dom.Event
  
  /* standard dom */
  var scroll: org.scalajs.dom.Event
}
object VisualViewportEventMap {
  
  inline def apply(resize: org.scalajs.dom.Event, scroll: org.scalajs.dom.Event): VisualViewportEventMap = {
    val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualViewportEventMap]
  }
  
  extension [Self <: VisualViewportEventMap](x: Self) {
    
    inline def setResize(value: org.scalajs.dom.Event): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: org.scalajs.dom.Event): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
