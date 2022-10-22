package typingsJapgolly.webix.webix.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebixFilter extends StObject {
  
  def getValue(node: HTMLElement): Any
  
  def refresh(master: baseview, node: HTMLElement, value: Any): Unit
  
  def render(master: baseview, config: StringDictionary[Any]): String
  
  def setValue(node: HTMLElement, value: Any): Any
}
object WebixFilter {
  
  inline def apply(
    getValue: HTMLElement => Any,
    refresh: (baseview, HTMLElement, Any) => Callback,
    render: (baseview, StringDictionary[Any]) => String,
    setValue: (HTMLElement, Any) => Any
  ): WebixFilter = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), refresh = js.Any.fromFunction3((t0: baseview, t1: HTMLElement, t2: Any) => (refresh(t0, t1, t2)).runNow()), render = js.Any.fromFunction2(render), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[WebixFilter]
  }
  
  extension [Self <: WebixFilter](x: Self) {
    
    inline def setGetValue(value: HTMLElement => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: (baseview, HTMLElement, Any) => Callback): Self = StObject.set(x, "refresh", js.Any.fromFunction3((t0: baseview, t1: HTMLElement, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setRender(value: (baseview, StringDictionary[Any]) => String): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    
    inline def setSetValue(value: (HTMLElement, Any) => Any): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
  }
}
