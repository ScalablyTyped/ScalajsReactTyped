package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodeRedEditorClient.anon.ApiRootUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  def get[T](key: String, defaultIfUndefined: T): T
  
  def init(options: ApiRootUrl, done: js.Function0[Unit]): Unit
  
  def load(done: js.Function0[Unit]): Unit
  
  def loadUserSettings(done: js.Function0[Unit]): Unit
  
  def remove(key: String): Unit
  
  def set(key: String, value: Any): Unit
  
  def theme[T](property: String, defaultValue: T): T
}
object Settings {
  
  inline def apply(
    get: (String, Any) => Any,
    init: (ApiRootUrl, js.Function0[Unit]) => Callback,
    load: js.Function0[Unit] => Callback,
    loadUserSettings: js.Function0[Unit] => Callback,
    remove: String => Callback,
    set: (String, Any) => Callback,
    theme: (String, Any) => Any
  ): Settings = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), init = js.Any.fromFunction2((t0: ApiRootUrl, t1: js.Function0[Unit]) => (init(t0, t1)).runNow()), load = js.Any.fromFunction1((t0: js.Function0[Unit]) => load(t0).runNow()), loadUserSettings = js.Any.fromFunction1((t0: js.Function0[Unit]) => loadUserSettings(t0).runNow()), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), set = js.Any.fromFunction2((t0: String, t1: Any) => (set(t0, t1)).runNow()), theme = js.Any.fromFunction2(theme))
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setGet(value: (String, Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setInit(value: (ApiRootUrl, js.Function0[Unit]) => Callback): Self = StObject.set(x, "init", js.Any.fromFunction2((t0: ApiRootUrl, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setLoad(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setLoadUserSettings(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "loadUserSettings", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet(value: (String, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setTheme(value: (String, Any) => Any): Self = StObject.set(x, "theme", js.Any.fromFunction2(value))
  }
}
