package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppConfig extends StObject {
  
  var appKey: String
  
  var component: js.UndefOr[ComponentProvider] = js.undefined
  
  var run: js.UndefOr[Runnable] = js.undefined
}
object AppConfig {
  
  inline def apply(appKey: String): AppConfig = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppConfig]
  }
  
  extension [Self <: AppConfig](x: Self) {
    
    inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: CallbackTo[ComponentType[Any]]): Self = StObject.set(x, "component", value.toJsFn)
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setRun(value: /* appParameters */ Any => Callback): Self = StObject.set(x, "run", js.Any.fromFunction1((t0: /* appParameters */ Any) => value(t0).runNow()))
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
  }
}
