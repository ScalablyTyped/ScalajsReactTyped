package typingsJapgolly.hapiGlue

import typingsJapgolly.hapiGlue.mod.PluginObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Plugins extends StObject {
    
    var plugins: js.Array[PluginObject | String]
  }
  object Plugins {
    
    inline def apply(plugins: js.Array[PluginObject | String]): Plugins = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setPlugins(value: js.Array[PluginObject | String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: (PluginObject | String)*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
