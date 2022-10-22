package typingsJapgolly.next.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.next.distTraceMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attrs extends StObject {
  
  var attrs: js.UndefOr[Any] = js.undefined
  
  var onStart: js.UndefOr[js.Function2[/* span */ Span, /* repeated */ Any, Unit]] = js.undefined
  
  var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var parentSpan: js.UndefOr[js.Function0[Span]] = js.undefined
}
object Attrs {
  
  inline def apply(): Attrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attrs]
  }
  
  extension [Self <: Attrs](x: Self) {
    
    inline def setAttrs(value: Any): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setOnStart(value: (/* span */ Span, /* repeated */ Any) => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction2((t0: /* span */ Span, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOnStop(value: Callback): Self = StObject.set(x, "onStop", value.toJsFn)
    
    inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
    
    inline def setParentSpan(value: CallbackTo[Span]): Self = StObject.set(x, "parentSpan", value.toJsFn)
    
    inline def setParentSpanUndefined: Self = StObject.set(x, "parentSpan", js.undefined)
  }
}
