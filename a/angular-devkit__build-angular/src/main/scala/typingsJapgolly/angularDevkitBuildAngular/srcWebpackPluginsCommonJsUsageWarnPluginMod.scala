package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsCommonJsUsageWarnPluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/common-js-usage-warn-plugin", "CommonJsUsageWarnPlugin")
  @js.native
  open class CommonJsUsageWarnPlugin () extends StObject {
    def this(options: CommonJsUsageWarnPluginOptions) = this()
    
    /* private */ var allowedDependencies: Any = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ var hasCommonJsDependencies: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var rawRequestToPackageName: Any = js.native
    
    /* private */ var shownWarnings: Any = js.native
  }
  
  trait CommonJsUsageWarnPluginOptions extends StObject {
    
    /** A list of CommonJS packages that are allowed to be used without a warning. */
    var allowedDependencies: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CommonJsUsageWarnPluginOptions {
    
    inline def apply(): CommonJsUsageWarnPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonJsUsageWarnPluginOptions]
    }
    
    extension [Self <: CommonJsUsageWarnPluginOptions](x: Self) {
      
      inline def setAllowedDependencies(value: js.Array[String]): Self = StObject.set(x, "allowedDependencies", value.asInstanceOf[js.Any])
      
      inline def setAllowedDependenciesUndefined: Self = StObject.set(x, "allowedDependencies", js.undefined)
      
      inline def setAllowedDependenciesVarargs(value: String*): Self = StObject.set(x, "allowedDependencies", js.Array(value*))
    }
  }
}
