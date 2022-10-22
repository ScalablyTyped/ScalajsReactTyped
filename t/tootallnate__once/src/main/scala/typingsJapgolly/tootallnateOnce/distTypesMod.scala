package typingsJapgolly.tootallnateOnce

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Parameters
import typingsJapgolly.tootallnateOnce.distOverloadedParametersMod.OverloadedParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait AbortSignal extends StObject {
    
    def addEventListener(name: String, listener: js.Function1[/* repeated */ Any, Any]): Unit
    
    def removeEventListener(name: String, listener: js.Function1[/* repeated */ Any, Any]): Unit
  }
  object AbortSignal {
    
    inline def apply(
      addEventListener: (String, js.Function1[/* repeated */ Any, Any]) => Callback,
      removeEventListener: (String, js.Function1[/* repeated */ Any, Any]) => Callback
    ): AbortSignal = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Any]) => (addEventListener(t0, t1)).runNow()), removeEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Any]) => (removeEventListener(t0, t1)).runNow()))
      __obj.asInstanceOf[AbortSignal]
    }
    
    extension [Self <: AbortSignal](x: Self) {
      
      inline def setAddEventListener(value: (String, js.Function1[/* repeated */ Any, Any]) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Any]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveEventListener(value: (String, js.Function1[/* repeated */ Any, Any]) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Any]) => (value(t0, t1)).runNow()))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    F extends [T, infer R, ...std.Array<any>] ? R : never
    }}}
    */
  @js.native
  trait EventListener[F, T /* <: String | js.Symbol */] extends StObject
  
  type EventListenerParameters[Emitter /* <: EventEmitter */, Event /* <: EventNames[Emitter] */] = WithDefault[Parameters[EventListener[EventParameters[Emitter], Event]], js.Array[Any]]
  
  type EventNames[Emitter /* <: EventEmitter */] = FirstParameter[EventParameters[Emitter]]
  
  type EventParameters[Emitter /* <: EventEmitter */] = OverloadedParameters[
    /* import warning: importer.ImportType#apply Failed type conversion: Emitter['on'] */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [infer R, ...std.Array<any>] ? R : never
    }}}
    */
  @js.native
  trait FirstParameter[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [never] ? D : T
    }}}
    */
  @js.native
  trait WithDefault[T, D] extends StObject
}
