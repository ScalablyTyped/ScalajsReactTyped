package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.AdvancedOptimizations
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildStylesheetsMod.BundleStylesheetOptions
import typingsJapgolly.esbuild.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersBrowserEsbuildCompilerPluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/browser-esbuild/compiler-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCompilerPlugin(pluginOptions: AdvancedOptimizations, styleOptions: BundleStylesheetOptions): Plugin = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerPlugin")(pluginOptions.asInstanceOf[js.Any], styleOptions.asInstanceOf[js.Any])).asInstanceOf[Plugin]
}
