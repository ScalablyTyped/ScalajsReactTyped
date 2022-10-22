package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.opentracing.mod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Injector extends StObject {
  
  def inject(spanContext: SpanContext, carrier: Any): Unit
}
object Injector {
  
  inline def apply(inject: (SpanContext, Any) => Callback): Injector = {
    val __obj = js.Dynamic.literal(inject = js.Any.fromFunction2((t0: SpanContext, t1: Any) => (inject(t0, t1)).runNow()))
    __obj.asInstanceOf[Injector]
  }
  
  extension [Self <: Injector](x: Self) {
    
    inline def setInject(value: (SpanContext, Any) => Callback): Self = StObject.set(x, "inject", js.Any.fromFunction2((t0: SpanContext, t1: Any) => (value(t0, t1)).runNow()))
  }
}
