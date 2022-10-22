package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitBuildAngular.anon.BuildFailureoutputFilesne
import typingsJapgolly.angularDevkitBuildAngular.anon.BuildResultoutputFilesArr
import typingsJapgolly.angularDevkitBuildAngular.anon.Errors
import typingsJapgolly.esbuild.mod.BuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersBrowserEsbuildEsbuildMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/browser-esbuild/esbuild", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bundle(options: BuildOptions): js.Promise[BuildResultoutputFilesArr | BuildFailureoutputFilesne] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildResultoutputFilesArr | BuildFailureoutputFilesne]]
  
  inline def isEsBuildFailure(value: Any): /* is esbuild.esbuild.BuildFailure */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEsBuildFailure")(value.asInstanceOf[js.Any]).asInstanceOf[/* is esbuild.esbuild.BuildFailure */ Boolean]
  
  inline def logMessages(context: BuilderContext, hasErrorsWarnings: Errors): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("logMessages")(context.asInstanceOf[js.Any], hasErrorsWarnings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
