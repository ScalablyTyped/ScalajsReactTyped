package typingsJapgolly.tailwindcss.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.tailwindcss.typesConfigMod.PluginAPI
import typingsJapgolly.tailwindcss.typesConfigMod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: js.UndefOr[this.type] = js.undefined
  
  def handler(api: PluginAPI): Unit
  @JSName("handler")
  var handler_Original: PluginCreator
}
object Config {
  
  inline def apply(handler: /* api */ PluginAPI => Callback): Config = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1((t0: /* api */ PluginAPI) => handler(t0).runNow()))
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setHandler(value: /* api */ PluginAPI => Callback): Self = StObject.set(x, "handler", js.Any.fromFunction1((t0: /* api */ PluginAPI) => value(t0).runNow()))
  }
}
