package typingsJapgolly.typeSignals

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("type-signals", "Signal")
  @js.native
  open class Signal[T /* <: js.Function */] () extends StObject {
    
    /* private */ var _addSignalBinding: Any = js.native
    
    /* private */ var _filter: Any = js.native
    
    /* private */ var _head: Any = js.native
    
    /* private */ var _tail: Any = js.native
    
    def add(fn: WithVoidReturn[T]): SignalBinding = js.native
    def add(fn: WithVoidReturn[T], thisArg: Any): SignalBinding = js.native
    
    def detach(node_ : SignalBinding): this.type = js.native
    
    def detachAll(): this.type = js.native
    
    def dispatch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgumentTypes<T> is not an array type */ args: ArgumentTypes[T]
    ): Boolean = js.native
    
    def filter(filter: WithBoolReturn[T]): Unit = js.native
    
    def handlers(): js.Array[SignalBinding] = js.native
    
    def has(node: SignalBinding): Boolean = js.native
    
    def hasAny(): Boolean = js.native
    
    def once(fn: WithVoidReturn[T]): SignalBinding = js.native
    def once(fn: WithVoidReturn[T], thisArg: Any): SignalBinding = js.native
    
    def proxy(signals: Signal[T]*): this.type = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (args : infer U): infer R ? U : never
    }}}
    */
  @js.native
  trait ArgumentTypes[T] extends StObject
  
  type ReplaceReturnType[T, TNewReturn] = js.Function1[/* a */ ArgumentTypes[T], TNewReturn]
  
  trait SignalBinding extends StObject {
    
    def detach(): Boolean
    
    def dispose(): Unit
  }
  object SignalBinding {
    
    inline def apply(detach: CallbackTo[Boolean], dispose: Callback): SignalBinding = {
      val __obj = js.Dynamic.literal(detach = detach.toJsFn, dispose = dispose.toJsFn)
      __obj.asInstanceOf[SignalBinding]
    }
    
    extension [Self <: SignalBinding](x: Self) {
      
      inline def setDetach(value: CallbackTo[Boolean]): Self = StObject.set(x, "detach", value.toJsFn)
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    }
  }
  
  type WithBoolReturn[T] = ReplaceReturnType[T, Boolean]
  
  type WithVoidReturn[T] = ReplaceReturnType[T, Unit]
}
