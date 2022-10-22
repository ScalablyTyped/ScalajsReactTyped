package typingsJapgolly.jqueryElang

import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interfaces for jQuery.fn.__plugin
trait IFnNewInstance extends StObject {
  
  def createInstance(el: HTMLElement, options: Any, pluginName: String): JQuery[HTMLElement]
}
object IFnNewInstance {
  
  inline def apply(createInstance: (HTMLElement, Any, String) => JQuery[HTMLElement]): IFnNewInstance = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction3(createInstance))
    __obj.asInstanceOf[IFnNewInstance]
  }
  
  extension [Self <: IFnNewInstance](x: Self) {
    
    inline def setCreateInstance(value: (HTMLElement, Any, String) => JQuery[HTMLElement]): Self = StObject.set(x, "createInstance", js.Any.fromFunction3(value))
  }
}
