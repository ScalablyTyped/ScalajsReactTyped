package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderOutput
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsRunModuleAsObservableForkMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/run-module-as-observable-fork", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runModuleAsObservableFork(cwd: String, modulePath: String, exportName: String, args: js.Array[Any]): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("runModuleAsObservableFork")(cwd.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any], exportName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def runModuleAsObservableFork(cwd: String, modulePath: String, exportName: Unit, args: js.Array[Any]): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("runModuleAsObservableFork")(cwd.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any], exportName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
}
