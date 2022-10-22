package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventListenerOptions extends StObject {
  
  /* standard dom */
  var capture: js.UndefOr[scala.Boolean] = js.undefined
}
object EventListenerOptions {
  
  inline def apply(): EventListenerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventListenerOptions]
  }
  
  extension [Self <: EventListenerOptions](x: Self) {
    
    inline def setCapture(value: scala.Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
  }
}
