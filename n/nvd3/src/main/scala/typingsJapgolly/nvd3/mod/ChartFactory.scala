package typingsJapgolly.nvd3.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartFactory[TChart /* <: Nvd3Element */] extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* chart */ TChart, Unit]] = js.undefined
  
  def generate(): TChart
}
object ChartFactory {
  
  inline def apply[TChart /* <: Nvd3Element */](generate: CallbackTo[TChart]): ChartFactory[TChart] = {
    val __obj = js.Dynamic.literal(generate = generate.toJsFn)
    __obj.asInstanceOf[ChartFactory[TChart]]
  }
  
  extension [Self <: ChartFactory[?], TChart /* <: Nvd3Element */](x: Self & ChartFactory[TChart]) {
    
    inline def setCallback(value: /* chart */ TChart => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* chart */ TChart) => value(t0).runNow()))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setGenerate(value: CallbackTo[TChart]): Self = StObject.set(x, "generate", value.toJsFn)
  }
}
