package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsJsonStatsPluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/json-stats-plugin", "JsonStatsPlugin")
  @js.native
  open class JsonStatsPlugin protected () extends StObject {
    def this(statsOutputPath: String) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ val statsOutputPath: Any = js.native
  }
}
