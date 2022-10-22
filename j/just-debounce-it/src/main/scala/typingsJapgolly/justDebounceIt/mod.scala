package typingsJapgolly.justDebounceIt

import japgolly.scalajs.react.Callback
import typingsJapgolly.justDebounceIt.justDebounceItBooleans.`false`
import typingsJapgolly.justDebounceIt.justDebounceItBooleans.`true`
import typingsJapgolly.justDebounceIt.justDebounceItInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("just-debounce-it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Function */](fn: T): T & MethodTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[T & MethodTypes]
  inline def default[T /* <: js.Function */](fn: T, wait: Double): (js.Function1[/* args */ ArgumentTypes[T], Unit]) & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[(js.Function1[/* args */ ArgumentTypes[T], Unit]) & MethodTypes]
  inline def default[T /* <: js.Function */](fn: T, wait: Unit, callFirst: Boolean): T & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[T & MethodTypes]
  
  inline def default_0[T /* <: js.Function */](fn: T, wait: `0`): T & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[T & MethodTypes]
  inline def default_0[T /* <: js.Function */](fn: T, wait: `0`, callFirst: Boolean): T & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[T & MethodTypes]
  
  inline def default_false[T /* <: js.Function */](fn: T, wait: Double, callFirst: `false`): (js.Function1[/* args */ ArgumentTypes[T], Unit]) & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[(js.Function1[/* args */ ArgumentTypes[T], Unit]) & MethodTypes]
  
  inline def default_true[T /* <: js.Function */](fn: T, wait: Double, callFirst: `true`): T & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[T & MethodTypes]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    F extends (args : infer A): any ? A : never
    }}}
    */
  @js.native
  trait ArgumentTypes[F /* <: js.Function */] extends StObject
  
  trait MethodTypes extends StObject {
    
    def cancel(): Unit
    
    def flush(): Unit
  }
  object MethodTypes {
    
    inline def apply(cancel: Callback, flush: Callback): MethodTypes = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, flush = flush.toJsFn)
      __obj.asInstanceOf[MethodTypes]
    }
    
    extension [Self <: MethodTypes](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    }
  }
}
