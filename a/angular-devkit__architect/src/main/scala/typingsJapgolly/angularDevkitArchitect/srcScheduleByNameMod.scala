package typingsJapgolly.angularDevkitArchitect

import typingsJapgolly.angularDevkitArchitect.anon.Analytics
import typingsJapgolly.angularDevkitArchitect.anon.CurrentDirectory
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderRun
import typingsJapgolly.angularDevkitArchitect.srcApiMod.Target
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcScheduleByNameMod {
  
  @JSImport("@angular-devkit/architect/src/schedule-by-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scheduleByName(name: String, buildOptions: JsonObject, options: Analytics): js.Promise[BuilderRun] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleByName")(name.asInstanceOf[js.Any], buildOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BuilderRun]]
  
  inline def scheduleByTarget(target: Target, overrides: JsonObject, options: CurrentDirectory): js.Promise[BuilderRun] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleByTarget")(target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BuilderRun]]
}
