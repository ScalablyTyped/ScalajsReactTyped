package typingsJapgolly.ejWebAll.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofwidget extends StObject {
  
  val autoInit: Boolean
  
  def destroyAll(elements: Element): Unit
  
  def init(element: Element): Unit
  
  def register(pluginName: String, className: String, prototype: Any): Unit
  
  def registerInstance(element: Element, pluginName: String, className: String, prototype: Any): Unit
  
  val registeredInstances: js.Array[Any]
  
  val registeredWidgets: js.Array[Any]
}
object Typeofwidget {
  
  inline def apply(
    autoInit: Boolean,
    destroyAll: Element => Callback,
    init: Element => Callback,
    register: (String, String, Any) => Callback,
    registerInstance: (Element, String, String, Any) => Callback,
    registeredInstances: js.Array[Any],
    registeredWidgets: js.Array[Any]
  ): Typeofwidget = {
    val __obj = js.Dynamic.literal(autoInit = autoInit.asInstanceOf[js.Any], destroyAll = js.Any.fromFunction1((t0: Element) => destroyAll(t0).runNow()), init = js.Any.fromFunction1((t0: Element) => init(t0).runNow()), register = js.Any.fromFunction3((t0: String, t1: String, t2: Any) => (register(t0, t1, t2)).runNow()), registerInstance = js.Any.fromFunction4((t0: Element, t1: String, t2: String, t3: Any) => (registerInstance(t0, t1, t2, t3)).runNow()), registeredInstances = registeredInstances.asInstanceOf[js.Any], registeredWidgets = registeredWidgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwidget]
  }
  
  extension [Self <: Typeofwidget](x: Self) {
    
    inline def setAutoInit(value: Boolean): Self = StObject.set(x, "autoInit", value.asInstanceOf[js.Any])
    
    inline def setDestroyAll(value: Element => Callback): Self = StObject.set(x, "destroyAll", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setInit(value: Element => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setRegister(value: (String, String, Any) => Callback): Self = StObject.set(x, "register", js.Any.fromFunction3((t0: String, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setRegisterInstance(value: (Element, String, String, Any) => Callback): Self = StObject.set(x, "registerInstance", js.Any.fromFunction4((t0: Element, t1: String, t2: String, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRegisteredInstances(value: js.Array[Any]): Self = StObject.set(x, "registeredInstances", value.asInstanceOf[js.Any])
    
    inline def setRegisteredInstancesVarargs(value: Any*): Self = StObject.set(x, "registeredInstances", js.Array(value*))
    
    inline def setRegisteredWidgets(value: js.Array[Any]): Self = StObject.set(x, "registeredWidgets", value.asInstanceOf[js.Any])
    
    inline def setRegisteredWidgetsVarargs(value: Any*): Self = StObject.set(x, "registeredWidgets", js.Array(value*))
  }
}
