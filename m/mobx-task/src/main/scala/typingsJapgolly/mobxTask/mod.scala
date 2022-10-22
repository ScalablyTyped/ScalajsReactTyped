package typingsJapgolly.mobxTask

import typingsJapgolly.mobxTask.libTaskMod.TaskFactory
import typingsJapgolly.mobxTask.libTaskMod.Task_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobx-task", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TaskGroup[A /* <: js.Array[Any] */, R](tasks: js.Array[Task_[A, R]]): typingsJapgolly.mobxTask.libTaskGroupMod.TaskGroup[A, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("TaskGroup")(tasks.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mobxTask.libTaskGroupMod.TaskGroup[A, R]]
  
  /**
    * Creates a task in the `pending` state.
    */
  @JSImport("mobx-task", "task")
  @js.native
  val task: TaskFactory = js.native
}
