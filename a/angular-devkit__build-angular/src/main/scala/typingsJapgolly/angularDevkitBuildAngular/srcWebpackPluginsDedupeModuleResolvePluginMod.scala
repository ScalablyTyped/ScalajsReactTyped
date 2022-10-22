package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.Request
import typingsJapgolly.std.Map
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsDedupeModuleResolvePluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/dedupe-module-resolve-plugin", "DedupeModuleResolvePlugin")
  @js.native
  open class DedupeModuleResolvePlugin () extends StObject {
    def this(options: DedupeModuleResolvePluginOptions) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    var modules: Map[String, Request] = js.native
    
    /* private */ var options: Any = js.native
  }
  
  trait DedupeModuleResolvePluginOptions extends StObject {
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object DedupeModuleResolvePluginOptions {
    
    inline def apply(): DedupeModuleResolvePluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DedupeModuleResolvePluginOptions]
    }
    
    extension [Self <: DedupeModuleResolvePluginOptions](x: Self) {
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
