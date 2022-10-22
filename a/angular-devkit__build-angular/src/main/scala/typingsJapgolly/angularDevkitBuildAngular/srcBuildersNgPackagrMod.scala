package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderOutput
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersNgPackagrSchemaMod.Schema
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersNgPackagrMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/ng-packagr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/builders/ng-packagr", JSImport.Default)
  @js.native
  val default: Builder[
    (Record[String, String]) & Schema & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src.JsonObject */ Any)
  ] = js.native
  
  inline def execute(options: Schema, context: BuilderContext): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
}
