package typingsJapgolly.angularDevkitSchematics.mod

import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.SchematicContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "TaskScheduler")
@js.native
open class TaskScheduler protected ()
  extends typingsJapgolly.angularDevkitSchematics.srcEngineMod.TaskScheduler {
  def this(_context: SchematicContext) = this()
}
/* static members */
object TaskScheduler {
  
  @JSImport("@angular-devkit/schematics", "TaskScheduler")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/schematics", "TaskScheduler._taskIdCounter")
  @js.native
  def _taskIdCounter: Any = js.native
  inline def _taskIdCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_taskIdCounter")(x.asInstanceOf[js.Any])
}
