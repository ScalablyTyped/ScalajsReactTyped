package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var event: org.scalajs.dom.Event
}
object Event {
  
  inline def apply(event: org.scalajs.dom.Event): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: org.scalajs.dom.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
