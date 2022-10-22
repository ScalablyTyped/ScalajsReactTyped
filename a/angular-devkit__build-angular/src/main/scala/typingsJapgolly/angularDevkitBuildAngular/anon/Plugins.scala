package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugins extends StObject {
  
  var plugins: js.Array[Any]
  
  var presets: js.Array[js.Array[Any]]
}
object Plugins {
  
  inline def apply(plugins: js.Array[Any], presets: js.Array[js.Array[Any]]): Plugins = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any], presets = presets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
  
  extension [Self <: Plugins](x: Self) {
    
    inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPresets(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
    
    inline def setPresetsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "presets", js.Array(value*))
  }
}
