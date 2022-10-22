package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.BuildOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.WebpackConfigOptions
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackConfigsCommonMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/configs/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCommonConfig(wco: WebpackConfigOptions[BuildOptions]): js.Promise[Configuration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommonConfig")(wco.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Configuration]]
}
