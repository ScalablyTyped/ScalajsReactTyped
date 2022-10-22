package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.EntryPoints
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.StyleElement
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.BuildOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.WebpackConfigOptions
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackConfigsStylesMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/configs/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStylesConfig(wco: WebpackConfigOptions[BuildOptions]): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("getStylesConfig")(wco.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  
  inline def resolveGlobalStyles(styleEntrypoints: js.Array[StyleElement], root: String, preserveSymlinks: Boolean): EntryPoints = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlobalStyles")(styleEntrypoints.asInstanceOf[js.Any], root.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any])).asInstanceOf[EntryPoints]
  inline def resolveGlobalStyles(
    styleEntrypoints: js.Array[StyleElement],
    root: String,
    preserveSymlinks: Boolean,
    skipResolution: Boolean
  ): EntryPoints = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlobalStyles")(styleEntrypoints.asInstanceOf[js.Any], root.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any], skipResolution.asInstanceOf[js.Any])).asInstanceOf[EntryPoints]
}
