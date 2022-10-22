package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationEventMap extends StObject {
  
  /* standard dom */
  var click: org.scalajs.dom.Event
  
  /* standard dom */
  var close: org.scalajs.dom.Event
  
  /* standard dom */
  var error: org.scalajs.dom.Event
  
  /* standard dom */
  var show: org.scalajs.dom.Event
}
object NotificationEventMap {
  
  inline def apply(
    click: org.scalajs.dom.Event,
    close: org.scalajs.dom.Event,
    error: org.scalajs.dom.Event,
    show: org.scalajs.dom.Event
  ): NotificationEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventMap]
  }
  
  extension [Self <: NotificationEventMap](x: Self) {
    
    inline def setClick(value: org.scalajs.dom.Event): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClose(value: org.scalajs.dom.Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setError(value: org.scalajs.dom.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setShow(value: org.scalajs.dom.Event): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
