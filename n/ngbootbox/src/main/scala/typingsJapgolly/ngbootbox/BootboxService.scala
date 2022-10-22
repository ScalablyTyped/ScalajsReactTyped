package typingsJapgolly.ngbootbox

import japgolly.scalajs.react.Callback
import typingsJapgolly.bootbox.BootboxDefaultOptions
import typingsJapgolly.bootbox.BootboxLocaleValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootboxService extends StObject {
  
  def addLocale(name: String, values: BootboxLocaleValues): Unit
  
  def alert(msg: String): js.Promise[Any]
  
  def confirm(msg: String): js.Promise[Any]
  
  def customDialog(options: NgBootboxDialog): Unit
  
  def hideAll(): Unit
  
  def prompt(msg: String): js.Promise[Any]
  
  def removeLocale(name: String): Unit
  
  def setDefaults(options: BootboxDefaultOptions): Unit
  
  def setLocale(name: String): Unit
}
object BootboxService {
  
  inline def apply(
    addLocale: (String, BootboxLocaleValues) => Callback,
    alert: String => js.Promise[Any],
    confirm: String => js.Promise[Any],
    customDialog: NgBootboxDialog => Callback,
    hideAll: Callback,
    prompt: String => js.Promise[Any],
    removeLocale: String => Callback,
    setDefaults: BootboxDefaultOptions => Callback,
    setLocale: String => Callback
  ): BootboxService = {
    val __obj = js.Dynamic.literal(addLocale = js.Any.fromFunction2((t0: String, t1: BootboxLocaleValues) => (addLocale(t0, t1)).runNow()), alert = js.Any.fromFunction1(alert), confirm = js.Any.fromFunction1(confirm), customDialog = js.Any.fromFunction1((t0: NgBootboxDialog) => customDialog(t0).runNow()), hideAll = hideAll.toJsFn, prompt = js.Any.fromFunction1(prompt), removeLocale = js.Any.fromFunction1((t0: String) => removeLocale(t0).runNow()), setDefaults = js.Any.fromFunction1((t0: BootboxDefaultOptions) => setDefaults(t0).runNow()), setLocale = js.Any.fromFunction1((t0: String) => setLocale(t0).runNow()))
    __obj.asInstanceOf[BootboxService]
  }
  
  extension [Self <: BootboxService](x: Self) {
    
    inline def setAddLocale(value: (String, BootboxLocaleValues) => Callback): Self = StObject.set(x, "addLocale", js.Any.fromFunction2((t0: String, t1: BootboxLocaleValues) => (value(t0, t1)).runNow()))
    
    inline def setAlert(value: String => js.Promise[Any]): Self = StObject.set(x, "alert", js.Any.fromFunction1(value))
    
    inline def setConfirm(value: String => js.Promise[Any]): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
    
    inline def setCustomDialog(value: NgBootboxDialog => Callback): Self = StObject.set(x, "customDialog", js.Any.fromFunction1((t0: NgBootboxDialog) => value(t0).runNow()))
    
    inline def setHideAll(value: Callback): Self = StObject.set(x, "hideAll", value.toJsFn)
    
    inline def setPrompt(value: String => js.Promise[Any]): Self = StObject.set(x, "prompt", js.Any.fromFunction1(value))
    
    inline def setRemoveLocale(value: String => Callback): Self = StObject.set(x, "removeLocale", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDefaults(value: BootboxDefaultOptions => Callback): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1((t0: BootboxDefaultOptions) => value(t0).runNow()))
    
    inline def setSetLocale(value: String => Callback): Self = StObject.set(x, "setLocale", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
