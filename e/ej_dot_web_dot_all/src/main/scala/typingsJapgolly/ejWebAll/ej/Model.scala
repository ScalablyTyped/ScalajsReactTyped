package typingsJapgolly.ejWebAll.ej

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  def bindTo(element: Any): Unit
  
  def changeState(state: Boolean, args: Any): Unit
  
  def computes(value: Any): Unit
  
  var formElements: js.Array[String]
  
  def get(field: String): Any
  
  def markCommit(): Unit
  
  def markDelete(): Unit
  
  def off(eventName: String, handler: Any): Unit
  
  def on(eventName: String, handler: Any): Unit
  
  def properties(): Any
  
  def revert(suspendEvent: Any): Unit
  
  def save(dm: DataManager, key: String): Unit
  
  def set(field: String, value: Any): Unit
  
  def unbind(element: Any): Unit
}
object Model {
  
  inline def apply(
    bindTo: Any => Callback,
    changeState: (Boolean, Any) => Callback,
    computes: Any => Callback,
    formElements: js.Array[String],
    get: String => Any,
    markCommit: Callback,
    markDelete: Callback,
    off: (String, Any) => Callback,
    on: (String, Any) => Callback,
    properties: CallbackTo[Any],
    revert: Any => Callback,
    save: (DataManager, String) => Callback,
    set: (String, Any) => Callback,
    unbind: Any => Callback
  ): Model = {
    val __obj = js.Dynamic.literal(bindTo = js.Any.fromFunction1((t0: Any) => bindTo(t0).runNow()), changeState = js.Any.fromFunction2((t0: Boolean, t1: Any) => (changeState(t0, t1)).runNow()), computes = js.Any.fromFunction1((t0: Any) => computes(t0).runNow()), formElements = formElements.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), markCommit = markCommit.toJsFn, markDelete = markDelete.toJsFn, off = js.Any.fromFunction2((t0: String, t1: Any) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: Any) => (on(t0, t1)).runNow()), properties = properties.toJsFn, revert = js.Any.fromFunction1((t0: Any) => revert(t0).runNow()), save = js.Any.fromFunction2((t0: DataManager, t1: String) => (save(t0, t1)).runNow()), set = js.Any.fromFunction2((t0: String, t1: Any) => (set(t0, t1)).runNow()), unbind = js.Any.fromFunction1((t0: Any) => unbind(t0).runNow()))
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setBindTo(value: Any => Callback): Self = StObject.set(x, "bindTo", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setChangeState(value: (Boolean, Any) => Callback): Self = StObject.set(x, "changeState", js.Any.fromFunction2((t0: Boolean, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setComputes(value: Any => Callback): Self = StObject.set(x, "computes", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setFormElements(value: js.Array[String]): Self = StObject.set(x, "formElements", value.asInstanceOf[js.Any])
    
    inline def setFormElementsVarargs(value: String*): Self = StObject.set(x, "formElements", js.Array(value*))
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setMarkCommit(value: Callback): Self = StObject.set(x, "markCommit", value.toJsFn)
    
    inline def setMarkDelete(value: Callback): Self = StObject.set(x, "markDelete", value.toJsFn)
    
    inline def setOff(value: (String, Any) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setOn(value: (String, Any) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setProperties(value: CallbackTo[Any]): Self = StObject.set(x, "properties", value.toJsFn)
    
    inline def setRevert(value: Any => Callback): Self = StObject.set(x, "revert", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSave(value: (DataManager, String) => Callback): Self = StObject.set(x, "save", js.Any.fromFunction2((t0: DataManager, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSet(value: (String, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setUnbind(value: Any => Callback): Self = StObject.set(x, "unbind", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
