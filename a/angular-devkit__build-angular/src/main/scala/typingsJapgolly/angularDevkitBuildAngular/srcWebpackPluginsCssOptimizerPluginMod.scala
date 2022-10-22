package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsCssOptimizerPluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/css-optimizer-plugin", "CssOptimizerPlugin")
  @js.native
  open class CssOptimizerPlugin () extends StObject {
    def this(options: CssOptimizerPluginOptions) = this()
    
    /* private */ var addWarnings: Any = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ var esbuild: Any = js.native
    
    /**
      * Optimizes a CSS asset using esbuild.
      *
      * @param input The CSS asset source content to optimize.
      * @param name The name of the CSS asset. Used to generate source maps.
      * @param inputMap Optionally specifies the CSS asset's original source map that will
      * be merged with the intermediate optimized source map.
      * @param target Optionally specifies the target browsers for the output code.
      * @returns A promise resolving to the optimized CSS, source map, and any warnings.
      */
    /* private */ var optimize: Any = js.native
    
    /* private */ var targets: Any = js.native
    
    /* private */ var transformSupportedBrowsersToTargets: Any = js.native
  }
  
  trait CssOptimizerPluginOptions extends StObject {
    
    var supportedBrowsers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CssOptimizerPluginOptions {
    
    inline def apply(): CssOptimizerPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssOptimizerPluginOptions]
    }
    
    extension [Self <: CssOptimizerPluginOptions](x: Self) {
      
      inline def setSupportedBrowsers(value: js.Array[String]): Self = StObject.set(x, "supportedBrowsers", value.asInstanceOf[js.Any])
      
      inline def setSupportedBrowsersUndefined: Self = StObject.set(x, "supportedBrowsers", js.undefined)
      
      inline def setSupportedBrowsersVarargs(value: String*): Self = StObject.set(x, "supportedBrowsers", js.Array(value*))
    }
  }
}
