package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitBuildAngular.anon.EntryPoints
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.StyleElement
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.BuildOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.WebpackConfigOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.WebpackDevServerOptions
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackConfigsMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/configs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildServePath(options: WebpackDevServerOptions, logger: LoggerApi): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildServePath")(options.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAnalyticsConfig(wco: WebpackConfigOptions[BuildOptions], context: BuilderContext): Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnalyticsConfig")(wco.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Configuration]
  
  inline def getCommonConfig(wco: WebpackConfigOptions[BuildOptions]): js.Promise[Configuration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommonConfig")(wco.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Configuration]]
  
  inline def getDevServerConfig(wco: WebpackConfigOptions[WebpackDevServerOptions]): js.Promise[Configuration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevServerConfig")(wco.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Configuration]]
  
  inline def getStylesConfig(wco: WebpackConfigOptions[BuildOptions]): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("getStylesConfig")(wco.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  
  inline def resolveGlobalStyles(styleEntrypoints: js.Array[StyleElement], root: String, preserveSymlinks: Boolean): EntryPoints = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlobalStyles")(styleEntrypoints.asInstanceOf[js.Any], root.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any])).asInstanceOf[EntryPoints]
  inline def resolveGlobalStyles(
    styleEntrypoints: js.Array[StyleElement],
    root: String,
    preserveSymlinks: Boolean,
    skipResolution: Boolean
  ): EntryPoints = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlobalStyles")(styleEntrypoints.asInstanceOf[js.Any], root.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any], skipResolution.asInstanceOf[js.Any])).asInstanceOf[EntryPoints]
}
