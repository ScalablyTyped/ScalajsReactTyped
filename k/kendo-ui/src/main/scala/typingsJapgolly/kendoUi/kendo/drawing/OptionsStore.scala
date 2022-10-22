package typingsJapgolly.kendoUi.kendo.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsStore
  extends StObject
     with Class {
  
  def get(field: String): Any
  
  var observer: Any
  
  var options: OptionsStoreOptions
  
  def set(field: String, value: Any): Unit
}
object OptionsStore {
  
  inline def apply(get: String => Any, observer: Any, options: OptionsStoreOptions, set: (String, Any) => Callback): OptionsStore = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), observer = observer.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], set = js.Any.fromFunction2((t0: String, t1: Any) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[OptionsStore]
  }
  
  extension [Self <: OptionsStore](x: Self) {
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setObserver(value: Any): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: OptionsStoreOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (String, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
