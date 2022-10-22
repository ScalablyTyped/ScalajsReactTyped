package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.LoadPaths
import typingsJapgolly.esbuild.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersBrowserEsbuildSassPluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/browser-esbuild/sass-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSassPlugin(options: LoadPaths): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("createSassPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
}
