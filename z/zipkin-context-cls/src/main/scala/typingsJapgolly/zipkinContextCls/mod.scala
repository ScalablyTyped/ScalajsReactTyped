package typingsJapgolly.zipkinContextCls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.zipkin.mod.Context
import typingsJapgolly.zipkin.mod.TraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipkin-context-cls", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CLSContext {
    def this(name: String) = this()
    def this(name: String, supportAsyncAwait: Boolean) = this()
    
    /* CompleteClass */
    override def getContext(): Any = js.native
    
    /* CompleteClass */
    override def letContext[V](ctx: Any, callback: js.Function0[V]): V = js.native
    /* CompleteClass */
    override def letContext[V](ctx: TraceId, callback: js.Function0[V]): V = js.native
    
    /* CompleteClass */
    override def scoped[V](callback: js.Function0[V]): V = js.native
    
    /* CompleteClass */
    override def setContext(ctx: Any): Unit = js.native
    /* CompleteClass */
    override def setContext(ctx: TraceId): Unit = js.native
  }
  
  trait CLSContext
    extends StObject
       with Context[Any] {
    
    def letContext[V](ctx: TraceId, callback: js.Function0[V]): V
    
    def setContext(ctx: TraceId): Unit
  }
  object CLSContext {
    
    inline def apply(
      getContext: CallbackTo[Any],
      letContext: (TraceId, js.Function0[Any]) => Any,
      scoped: js.Function0[Any] => Any,
      setContext: TraceId => Callback
    ): CLSContext = {
      val __obj = js.Dynamic.literal(getContext = getContext.toJsFn, letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1((t0: TraceId) => setContext(t0).runNow()))
      __obj.asInstanceOf[CLSContext]
    }
    
    extension [Self <: CLSContext](x: Self) {
      
      inline def setLetContext(value: (TraceId, js.Function0[Any]) => Any): Self = StObject.set(x, "letContext", js.Any.fromFunction2(value))
      
      inline def setSetContext(value: TraceId => Callback): Self = StObject.set(x, "setContext", js.Any.fromFunction1((t0: TraceId) => value(t0).runNow()))
    }
  }
}
