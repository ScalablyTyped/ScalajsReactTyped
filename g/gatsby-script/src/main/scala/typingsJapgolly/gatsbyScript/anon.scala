package typingsJapgolly.gatsbyScript

import org.scalajs.dom.ErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callbacks extends StObject {
    
    var callbacks: js.UndefOr[js.Array[js.Function1[/* event */ org.scalajs.dom.Event, Unit]]] = js.undefined
    
    var event: js.UndefOr[org.scalajs.dom.Event] = js.undefined
  }
  object Callbacks {
    
    inline def apply(): Callbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callbacks]
    }
    
    extension [Self <: Callbacks](x: Self) {
      
      inline def setCallbacks(value: js.Array[js.Function1[/* event */ org.scalajs.dom.Event, Unit]]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setCallbacksVarargs(value: (js.Function1[/* event */ org.scalajs.dom.Event, Unit])*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setEvent(value: org.scalajs.dom.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: js.UndefOr[Event] = js.undefined
    
    var load: js.UndefOr[Callbacks] = js.undefined
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLoad(value: Callbacks): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    }
  }
  
  trait Event extends StObject {
    
    var callbacks: js.UndefOr[js.Array[js.Function1[/* event */ ErrorEvent, Unit]]] = js.undefined
    
    var event: js.UndefOr[ErrorEvent] = js.undefined
  }
  object Event {
    
    inline def apply(): Event = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setCallbacks(value: js.Array[js.Function1[/* event */ ErrorEvent, Unit]]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setCallbacksVarargs(value: (js.Function1[/* event */ ErrorEvent, Unit])*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setEvent(value: ErrorEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    }
  }
}
