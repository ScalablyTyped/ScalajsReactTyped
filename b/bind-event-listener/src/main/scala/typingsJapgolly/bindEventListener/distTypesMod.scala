package typingsJapgolly.bindEventListener

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import typingsJapgolly.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait Binding[Target /* <: EventTarget */, EventName /* <: String */] extends StObject {
    
    var listener: Listener[Target, EventName]
    
    var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.undefined
    
    var `type`: EventName
  }
  object Binding {
    
    inline def apply[Target /* <: EventTarget */, EventName /* <: String */](listener: Listener[Target, EventName], `type`: EventName): Binding[Target, EventName] = {
      val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Binding[Target, EventName]]
    }
    
    extension [Self <: Binding[?, ?], Target /* <: EventTarget */, EventName /* <: String */](x: Self & (Binding[Target, EventName])) {
      
      inline def setListener(value: Listener[Target, EventName]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Boolean | AddEventListenerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    MaybeFn extends (this : any, event : infer MaybeEvent): any ? MaybeEvent extends std.Event ? MaybeEvent : std.Event : never
    }}}
    */
  @js.native
  trait ExtractEventTypeFromHandler[MaybeFn /* <: Any */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    / * template literal string: on${EventName} * / string extends keyof Target ? bind-event-listener.bind-event-listener/dist/types.ExtractEventTypeFromHandler<Target[/ * template literal string: on${EventName} * / string]> : std.Event
    }}}
    */
  @js.native
  trait GetEventType[Target /* <: EventTarget */, EventName /* <: String */] extends StObject
  
  type Listener[Target /* <: EventTarget */, EventName /* <: String */] = (ListenerObject[GetEventType[Target, EventName]]) | (js.ThisFunction1[/* this */ Target, /* e */ GetEventType[Target, EventName], Unit])
  
  trait ListenerObject[TEvent /* <: Event */] extends StObject {
    
    def handleEvent(e: TEvent): Unit
  }
  object ListenerObject {
    
    inline def apply[TEvent /* <: Event */](handleEvent: TEvent => Callback): ListenerObject[TEvent] = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1((t0: TEvent) => handleEvent(t0).runNow()))
      __obj.asInstanceOf[ListenerObject[TEvent]]
    }
    
    extension [Self <: ListenerObject[?], TEvent /* <: Event */](x: Self & ListenerObject[TEvent]) {
      
      inline def setHandleEvent(value: TEvent => Callback): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1((t0: TEvent) => value(t0).runNow()))
    }
  }
  
  type UnbindFn = js.Function0[Unit]
}
