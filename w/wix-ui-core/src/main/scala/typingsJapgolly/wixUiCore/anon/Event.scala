package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: ReactEventFrom[org.scalajs.dom.Element]
  
  var page: Double
}
object Event {
  
  inline def apply(event: ReactEventFrom[org.scalajs.dom.Element], page: Double): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: ReactEventFrom[org.scalajs.dom.Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
