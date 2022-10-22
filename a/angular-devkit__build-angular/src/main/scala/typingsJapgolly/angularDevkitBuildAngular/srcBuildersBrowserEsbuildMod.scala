package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderOutput
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersBrowserEsbuildMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/browser-esbuild", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/builders/browser-esbuild", JSImport.Default)
  @js.native
  val default: Builder[
    Schema & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src.JsonObject */ Any)
  ] = js.native
  
  inline def buildEsbuildBrowser(options: Schema, context: BuilderContext): js.Promise[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEsbuildBrowser")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BuilderOutput]]
}
