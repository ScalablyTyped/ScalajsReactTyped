package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderOutput
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersProtractorSchemaMod.Schema
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersProtractorMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/protractor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/builders/protractor", JSImport.Default)
  @js.native
  val default: Builder[Schema & JsonObject] = js.native
  
  inline def execute(options: Schema, context: BuilderContext): js.Promise[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BuilderOutput]]
}
