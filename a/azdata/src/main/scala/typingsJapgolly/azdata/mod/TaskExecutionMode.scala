package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskExecutionMode extends StObject
@JSImport("azdata", "TaskExecutionMode")
@js.native
object TaskExecutionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskExecutionMode & Double] = js.native
  
  @js.native
  sealed trait execute
    extends StObject
       with TaskExecutionMode
  /* 0 */ val execute: typingsJapgolly.azdata.mod.TaskExecutionMode.execute & Double = js.native
  
  @js.native
  sealed trait executeAndScript
    extends StObject
       with TaskExecutionMode
  /* 2 */ val executeAndScript: typingsJapgolly.azdata.mod.TaskExecutionMode.executeAndScript & Double = js.native
  
  @js.native
  sealed trait script
    extends StObject
       with TaskExecutionMode
  /* 1 */ val script: typingsJapgolly.azdata.mod.TaskExecutionMode.script & Double = js.native
}
