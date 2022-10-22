package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleTextMarkerTemplate extends StObject {
  
  def getText(item: js.Object, textDelegate: js.Object): Unit
  
  def measure(measureInfo: js.Object): Unit
  
  def render(renderInfo: js.Object): Unit
}
object SimpleTextMarkerTemplate {
  
  inline def apply(
    getText: (js.Object, js.Object) => Callback,
    measure: js.Object => Callback,
    render: js.Object => Callback
  ): SimpleTextMarkerTemplate = {
    val __obj = js.Dynamic.literal(getText = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (getText(t0, t1)).runNow()), measure = js.Any.fromFunction1((t0: js.Object) => measure(t0).runNow()), render = js.Any.fromFunction1((t0: js.Object) => render(t0).runNow()))
    __obj.asInstanceOf[SimpleTextMarkerTemplate]
  }
  
  extension [Self <: SimpleTextMarkerTemplate](x: Self) {
    
    inline def setGetText(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "getText", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setMeasure(value: js.Object => Callback): Self = StObject.set(x, "measure", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setRender(value: js.Object => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
