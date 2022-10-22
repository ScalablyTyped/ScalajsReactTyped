package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.BuildOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.WebpackConfigOptions
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackConfigsAnalyticsMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/configs/analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnalyticsConfig(wco: WebpackConfigOptions[BuildOptions], context: BuilderContext): Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnalyticsConfig")(wco.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Configuration]
}
