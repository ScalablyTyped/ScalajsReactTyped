package typingsJapgolly.parcelTypes.anon

import typingsJapgolly.parcelTypes.mod.PluginLogger
import typingsJapgolly.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: typingsJapgolly.parcelTypes.mod.Config
  
  var logger: PluginLogger
  
  var options: PluginOptions
}
object Config {
  
  inline def apply(config: typingsJapgolly.parcelTypes.mod.Config, logger: PluginLogger, options: PluginOptions): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: typingsJapgolly.parcelTypes.mod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
