package typingsJapgolly.next

import typingsJapgolly.next.anon.CustomAppFile
import typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackConfigMod_ {
  
  @JSImport("next/dist/build/webpack/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(
    config: Configuration,
    hasSupportedBrowsersRootDirectoryCustomAppFileIsDevelopmentIsServerIsEdgeRuntimeTargetWebAssetPrefixSassOptionsProductionBrowserSourceMapsFutureExperimentalDisableStaticImages: CustomAppFile
  ): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(config.asInstanceOf[js.Any], hasSupportedBrowsersRootDirectoryCustomAppFileIsDevelopmentIsServerIsEdgeRuntimeTargetWebAssetPrefixSassOptionsProductionBrowserSourceMapsFutureExperimentalDisableStaticImages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
}
