package typingsJapgolly.xstate.anon

import typingsJapgolly.xstate.xstateStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: _empty
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal(event = "")
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: _empty): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
