package typingsJapgolly.storybookManagerWebpack4

import typingsJapgolly.webpack.mod.CallbackWebpack
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.Configuration
import typingsJapgolly.webpack.mod.MultiCompiler
import typingsJapgolly.webpack.mod.MultiCompilerOptions
import typingsJapgolly.webpack.mod.MultiStats
import typingsJapgolly.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ConfigDir extends StObject {
    
    var configDir: String
    
    var managerEntry: String
    
    var modern: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigDir {
    
    inline def apply(configDir: String, managerEntry: String): ConfigDir = {
      val __obj = js.Dynamic.literal(configDir = configDir.asInstanceOf[js.Any], managerEntry = managerEntry.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigDir]
    }
    
    extension [Self <: ConfigDir](x: Self) {
      
      inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
      
      inline def setManagerEntry(value: String): Self = StObject.set(x, "managerEntry", value.asInstanceOf[js.Any])
      
      inline def setModern(value: Boolean): Self = StObject.set(x, "modern", value.asInstanceOf[js.Any])
      
      inline def setModernUndefined: Self = StObject.set(x, "modern", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(options: js.Array[Configuration] & MultiCompilerOptions): MultiCompiler = js.native
    def apply(options: js.Array[Configuration] & MultiCompilerOptions, callback: CallbackWebpack[MultiStats]): MultiCompiler = js.native
    def apply(options: Configuration): Compiler = js.native
    def apply(options: Configuration, callback: CallbackWebpack[Stats]): Compiler = js.native
  }
}
