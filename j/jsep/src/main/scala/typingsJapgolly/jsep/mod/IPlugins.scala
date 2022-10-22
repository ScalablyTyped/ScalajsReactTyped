package typingsJapgolly.jsep.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlugins extends StObject {
  
  def register(plugins: IPlugin*): Unit
  
  var registered: StringDictionary[IPlugin]
}
object IPlugins {
  
  inline def apply(register: /* repeated */ IPlugin => Callback, registered: StringDictionary[IPlugin]): IPlugins = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1((t0: /* repeated */ IPlugin) => register(t0).runNow()), registered = registered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlugins]
  }
  
  extension [Self <: IPlugins](x: Self) {
    
    inline def setRegister(value: /* repeated */ IPlugin => Callback): Self = StObject.set(x, "register", js.Any.fromFunction1((t0: /* repeated */ IPlugin) => value(t0).runNow()))
    
    inline def setRegistered(value: StringDictionary[IPlugin]): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
  }
}
