package typingsJapgolly.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEnterLifecycle extends StObject {
  
  /**
    * Specifies the actions that are performed when the state is entered and the condition is TRUE.
    */
  var events: js.UndefOr[Events] = js.undefined
}
object OnEnterLifecycle {
  
  inline def apply(): OnEnterLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnEnterLifecycle]
  }
  
  extension [Self <: OnEnterLifecycle](x: Self) {
    
    inline def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
