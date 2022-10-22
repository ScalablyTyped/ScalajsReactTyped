package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Event
import typingsJapgolly.vscode.mod.TaskEndEvent
import typingsJapgolly.vscode.mod.TaskExecution
import typingsJapgolly.vscode.mod.TaskFilter
import typingsJapgolly.vscode.mod.TaskProcessEndEvent
import typingsJapgolly.vscode.mod.TaskProcessStartEvent
import typingsJapgolly.vscode.mod.TaskProvider
import typingsJapgolly.vscode.mod.TaskStartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasks {
  
  @JSGlobal("vscode.tasks")
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeTask(task: typingsJapgolly.vscode.mod.Task): Thenable[TaskExecution] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeTask")(task.asInstanceOf[js.Any]).asInstanceOf[Thenable[TaskExecution]]
  
  inline def fetchTasks(): Thenable[js.Array[typingsJapgolly.vscode.mod.Task]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchTasks")().asInstanceOf[Thenable[js.Array[typingsJapgolly.vscode.mod.Task]]]
  inline def fetchTasks(filter: TaskFilter): Thenable[js.Array[typingsJapgolly.vscode.mod.Task]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchTasks")(filter.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.Array[typingsJapgolly.vscode.mod.Task]]]
  
  @JSGlobal("vscode.tasks.onDidEndTask")
  @js.native
  val onDidEndTask: Event[TaskEndEvent] = js.native
  
  @JSGlobal("vscode.tasks.onDidEndTaskProcess")
  @js.native
  val onDidEndTaskProcess: Event[TaskProcessEndEvent] = js.native
  
  @JSGlobal("vscode.tasks.onDidStartTask")
  @js.native
  val onDidStartTask: Event[TaskStartEvent] = js.native
  
  @JSGlobal("vscode.tasks.onDidStartTaskProcess")
  @js.native
  val onDidStartTaskProcess: Event[TaskProcessStartEvent] = js.native
  
  inline def registerTaskProvider(`type`: String, provider: TaskProvider[typingsJapgolly.vscode.mod.Task]): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTaskProvider")(`type`.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  @JSGlobal("vscode.tasks.taskExecutions")
  @js.native
  val taskExecutions: js.Array[TaskExecution] = js.native
}
