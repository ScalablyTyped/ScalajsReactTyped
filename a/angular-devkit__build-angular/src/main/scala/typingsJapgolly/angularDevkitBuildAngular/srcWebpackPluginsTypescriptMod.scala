package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.BuildOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.WebpackConfigOptions
import typingsJapgolly.ngtoolsWebpack.mod.AngularWebpackPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsTypescriptMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/typescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIvyPlugin(wco: WebpackConfigOptions[BuildOptions], aot: Boolean, tsconfig: String): AngularWebpackPlugin = (^.asInstanceOf[js.Dynamic].applyDynamic("createIvyPlugin")(wco.asInstanceOf[js.Any], aot.asInstanceOf[js.Any], tsconfig.asInstanceOf[js.Any])).asInstanceOf[AngularWebpackPlugin]
}
