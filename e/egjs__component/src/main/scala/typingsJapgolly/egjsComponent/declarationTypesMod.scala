package typingsJapgolly.egjsComponent

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationTypesMod {
  
  @js.native
  trait AnyFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  @js.native
  trait ComponentEventConstructor
    extends StObject
       with Instantiable1[/* eventType */ String, DefaultProps[String, js.Object]]
       with Instantiable2[
          /* eventType */ String, 
          /* props */ Record[String, Any], 
          (DefaultProps[String, js.Object]) & (Record[String, Any])
        ]
  
  trait DefaultProps[TYPE /* <: String */, THIS] extends StObject {
    
    var currentTarget: THIS
    
    var eventType: TYPE
    
    def isCanceled(): Boolean
    
    def stop(): Unit
  }
  object DefaultProps {
    
    inline def apply[TYPE /* <: String */, THIS](currentTarget: THIS, eventType: TYPE, isCanceled: CallbackTo[Boolean], stop: Callback): DefaultProps[TYPE, THIS] = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], isCanceled = isCanceled.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[DefaultProps[TYPE, THIS]]
    }
    
    extension [Self <: DefaultProps[?, ?], TYPE /* <: String */, THIS](x: Self & (DefaultProps[TYPE, THIS])) {
      
      inline def setCurrentTarget(value: THIS): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setEventType(value: TYPE): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setIsCanceled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCanceled", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T[K] extends @egjs/component.@egjs/component/declaration/types.NoArguments ? (): any : T[K] extends @egjs/component.@egjs/component/declaration/types.AnyFunction ? T[K] : T[K] extends @egjs/component.@egjs/component/declaration/ComponentEvent.ComponentEvent<infer PROPS, string, any> ? (event : @egjs/component.@egjs/component/declaration/ComponentEvent.ComponentEvent<PROPS, K, THIS>): any : (event : T[K]): any
    }}}
    */
  @js.native
  trait EventCallback[T /* <: EventMap */, K /* <: EventKey[T] */, THIS] extends StObject
  
  type EventHash[T /* <: EventMap */, THIS] = Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in @egjs/component.@egjs/component/declaration/types.EventKey<T> ]: @egjs/component.@egjs/component/declaration/types.EventCallback<T, K, THIS>} */ js.Any
  ]
  
  type EventKey[T /* <: EventMap */] = String
  
  type EventMap = Record[String, Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T[K] extends @egjs/component.@egjs/component/declaration/types.NoArguments ? std.Array<void> : T[K] extends @egjs/component.@egjs/component/declaration/types.AnyFunction ? std.Parameters<T[K]> : [T[K]]
    }}}
    */
  @js.native
  trait EventTriggerParams[T, K /* <: EventKey[T] */] extends StObject
  
  type NoArguments = js.UndefOr[Null | Unit]
}
