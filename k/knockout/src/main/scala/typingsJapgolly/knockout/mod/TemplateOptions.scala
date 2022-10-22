package typingsJapgolly.knockout.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateOptions[T] extends StObject {
  
  var afterRender: js.UndefOr[js.Function2[/* elements */ js.Array[Node], /* dataItem */ T, Unit]] = js.undefined
  
  var templateEngine: js.UndefOr[typingsJapgolly.knockout.mod.templateEngine] = js.undefined
}
object TemplateOptions {
  
  inline def apply[T](): TemplateOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptions[T]]
  }
  
  extension [Self <: TemplateOptions[?], T](x: Self & TemplateOptions[T]) {
    
    inline def setAfterRender(value: (/* elements */ js.Array[Node], /* dataItem */ T) => Callback): Self = StObject.set(x, "afterRender", js.Any.fromFunction2((t0: /* elements */ js.Array[Node], t1: /* dataItem */ T) => (value(t0, t1)).runNow()))
    
    inline def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    inline def setTemplateEngine(value: templateEngine): Self = StObject.set(x, "templateEngine", value.asInstanceOf[js.Any])
    
    inline def setTemplateEngineUndefined: Self = StObject.set(x, "templateEngine", js.undefined)
  }
}
