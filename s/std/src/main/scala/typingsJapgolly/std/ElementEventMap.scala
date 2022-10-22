package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementEventMap extends StObject {
  
  /* standard dom */
  var fullscreenchange: org.scalajs.dom.Event
  
  /* standard dom */
  var fullscreenerror: org.scalajs.dom.Event
}
object ElementEventMap {
  
  inline def apply(fullscreenchange: org.scalajs.dom.Event, fullscreenerror: org.scalajs.dom.Event): ElementEventMap = {
    val __obj = js.Dynamic.literal(fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementEventMap]
  }
  
  extension [Self <: ElementEventMap](x: Self) {
    
    inline def setFullscreenchange(value: org.scalajs.dom.Event): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
    
    inline def setFullscreenerror(value: org.scalajs.dom.Event): Self = StObject.set(x, "fullscreenerror", value.asInstanceOf[js.Any])
  }
}
