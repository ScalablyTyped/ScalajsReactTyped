package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitBuildAngular.anon.Assets
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersBrowserEsbuildOptionsMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/browser-esbuild/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeOptions(context: BuilderContext, projectName: String, options: Schema): js.Promise[Assets] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeOptions")(context.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Assets]]
}
