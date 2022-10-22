package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.webpack.mod.Compilation
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsScriptsWebpackPluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/scripts-webpack-plugin", "ScriptsWebpackPlugin")
  @js.native
  open class ScriptsWebpackPlugin protected () extends StObject {
    def this(options: ScriptsWebpackPluginOptions) = this()
    
    /* private */ var _cachedOutput: Any = js.native
    
    /* private */ var _insertOutput: Any = js.native
    
    /* private */ var _lastBuildTime: Any = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ var options: Any = js.native
    
    def shouldSkip(compilation: Compilation, scripts: js.Array[String]): js.Promise[Boolean] = js.native
  }
  
  trait ScriptsWebpackPluginOptions extends StObject {
    
    var basePath: String
    
    var filename: String
    
    var name: String
    
    var scripts: js.Array[String]
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
  }
  object ScriptsWebpackPluginOptions {
    
    inline def apply(basePath: String, filename: String, name: String, scripts: js.Array[String]): ScriptsWebpackPluginOptions = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptsWebpackPluginOptions]
    }
    
    extension [Self <: ScriptsWebpackPluginOptions](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value*))
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
}
