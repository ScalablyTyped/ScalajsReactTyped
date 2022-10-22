package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.WebpackConfigOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.WebpackDevServerOptions
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackConfigsDevServerMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/configs/dev-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildServePath(options: WebpackDevServerOptions, logger: LoggerApi): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildServePath")(options.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDevServerConfig(wco: WebpackConfigOptions[WebpackDevServerOptions]): js.Promise[Configuration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevServerConfig")(wco.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Configuration]]
}
