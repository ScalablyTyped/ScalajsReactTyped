package typingsJapgolly.jestConfig

import typingsJapgolly.jestConfig.mod.AllOptions
import typingsJapgolly.jestTypes.mod.GlobalConfig
import typingsJapgolly.jestTypes.mod.InitialOptions
import typingsJapgolly.jestTypes.mod.ProjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Config extends StObject {
    
    var config: InitialOptions
    
    var configPath: String | Null
  }
  object Config {
    
    inline def apply(config: InitialOptions): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], configPath = null)
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: InitialOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setConfigPathNull: Self = StObject.set(x, "configPath", null)
    }
  }
  
  trait Configs extends StObject {
    
    var configs: js.Array[ProjectConfig]
    
    var globalConfig: GlobalConfig
    
    var hasDeprecationWarnings: Boolean
  }
  object Configs {
    
    inline def apply(configs: js.Array[ProjectConfig], globalConfig: GlobalConfig, hasDeprecationWarnings: Boolean): Configs = {
      val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configs]
    }
    
    extension [Self <: Configs](x: Self) {
      
      inline def setConfigs(value: js.Array[ProjectConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setConfigsVarargs(value: ProjectConfig*): Self = StObject.set(x, "configs", js.Array(value*))
      
      inline def setGlobalConfig(value: GlobalConfig): Self = StObject.set(x, "globalConfig", value.asInstanceOf[js.Any])
      
      inline def setHasDeprecationWarnings(value: Boolean): Self = StObject.set(x, "hasDeprecationWarnings", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasDeprecationWarnings extends StObject {
    
    var hasDeprecationWarnings: Boolean
    
    var options: AllOptions
  }
  object HasDeprecationWarnings {
    
    inline def apply(hasDeprecationWarnings: Boolean, options: AllOptions): HasDeprecationWarnings = {
      val __obj = js.Dynamic.literal(hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasDeprecationWarnings]
    }
    
    extension [Self <: HasDeprecationWarnings](x: Self) {
      
      inline def setHasDeprecationWarnings(value: Boolean): Self = StObject.set(x, "hasDeprecationWarnings", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: AllOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
