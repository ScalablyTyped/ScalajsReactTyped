package typingsJapgolly.configurable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: js.Object */](obj: T): T & Configurable[T] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[T & Configurable[T]]
  
  @JSImport("configurable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Configurable[T] extends StObject {
    
    def disable(name: String): T & Configurable[T]
    
    def disabled(name: String): Boolean
    
    def enable(name: String): T & Configurable[T]
    
    def enabled(name: String): Boolean
    
    def get(name: String): Any
    
    def set(name: String, `val`: Any): T & Configurable[T]
    
    var settings: StringDictionary[Any]
  }
  object Configurable {
    
    inline def apply[T](
      disable: String => T & Configurable[T],
      disabled: String => Boolean,
      enable: String => T & Configurable[T],
      enabled: String => Boolean,
      get: String => Any,
      set: (String, Any) => T & Configurable[T],
      settings: StringDictionary[Any]
    ): Configurable[T] = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), disabled = js.Any.fromFunction1(disabled), enable = js.Any.fromFunction1(enable), enabled = js.Any.fromFunction1(enabled), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configurable[T]]
    }
    
    extension [Self <: Configurable[?], T](x: Self & Configurable[T]) {
      
      inline def setDisable(value: String => T & Configurable[T]): Self = StObject.set(x, "disable", js.Any.fromFunction1(value))
      
      inline def setDisabled(value: String => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
      
      inline def setEnable(value: String => T & Configurable[T]): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      inline def setEnabled(value: String => Boolean): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, Any) => T & Configurable[T]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSettings(value: StringDictionary[Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
}
