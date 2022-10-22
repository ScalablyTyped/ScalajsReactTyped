package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.`process-task`
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.`task-completed`
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.`transformed-files`
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.`update-package-json`
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.error
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.ready
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionTasksApiMod.Task
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionTasksApiMod.TaskProcessingOutcome
import typingsJapgolly.angularCompilerCli.ngccSrcUtilsMod.JsonObject
import typingsJapgolly.angularCompilerCli.ngccSrcWritingPackageJsonUpdaterMod.PackageJsonChange
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionClusterApiMod {
  
  trait ErrorMessage
    extends StObject
       with JsonObject
       with MessageFromWorker {
    
    var error: String
    
    var `type`: error
  }
  object ErrorMessage {
    
    inline def apply(error: String): ErrorMessage = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[ErrorMessage]
    }
    
    extension [Self <: ErrorMessage](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.ReadyMessage
    - typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.ErrorMessage
    - typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.TaskCompletedMessage
    - typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.TransformedFilesMessage
    - typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.UpdatePackageJsonMessage
  */
  trait MessageFromWorker extends StObject
  object MessageFromWorker {
    
    inline def ErrorMessage(error: String): typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.ErrorMessage = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.ErrorMessage]
    }
    
    inline def ReadyMessage(): typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.ReadyMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ready")
      __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.ReadyMessage]
    }
    
    inline def TaskCompletedMessage(outcome: TaskProcessingOutcome): typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.TaskCompletedMessage = {
      val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any], message = null)
      __obj.updateDynamic("type")("task-completed")
      __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.TaskCompletedMessage]
    }
    
    inline def TransformedFilesMessage(files: js.Array[AbsoluteFsPath]): typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.TransformedFilesMessage = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("transformed-files")
      __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.TransformedFilesMessage]
    }
    
    inline def UpdatePackageJsonMessage(changes: js.Array[PackageJsonChange], packageJsonPath: AbsoluteFsPath): typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.UpdatePackageJsonMessage = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], packageJsonPath = packageJsonPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update-package-json")
      __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.ngccSrcExecutionClusterApiMod.UpdatePackageJsonMessage]
    }
  }
  
  type MessageToWorker = ProcessTaskMessage
  
  trait ProcessTaskMessage
    extends StObject
       with JsonObject {
    
    var task: Task
    
    var `type`: `process-task`
  }
  object ProcessTaskMessage {
    
    inline def apply(task: Task): ProcessTaskMessage = {
      val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("process-task")
      __obj.asInstanceOf[ProcessTaskMessage]
    }
    
    extension [Self <: ProcessTaskMessage](x: Self) {
      
      inline def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setType(value: `process-task`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadyMessage
    extends StObject
       with JsonObject
       with MessageFromWorker {
    
    var `type`: ready
  }
  object ReadyMessage {
    
    inline def apply(): ReadyMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ready")
      __obj.asInstanceOf[ReadyMessage]
    }
    
    extension [Self <: ReadyMessage](x: Self) {
      
      inline def setType(value: ready): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskCompletedMessage
    extends StObject
       with JsonObject
       with MessageFromWorker {
    
    var message: String | Null
    
    var outcome: TaskProcessingOutcome
    
    var `type`: `task-completed`
  }
  object TaskCompletedMessage {
    
    inline def apply(outcome: TaskProcessingOutcome): TaskCompletedMessage = {
      val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any], message = null)
      __obj.updateDynamic("type")("task-completed")
      __obj.asInstanceOf[TaskCompletedMessage]
    }
    
    extension [Self <: TaskCompletedMessage](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setOutcome(value: TaskProcessingOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
      
      inline def setType(value: `task-completed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformedFilesMessage
    extends StObject
       with JsonObject
       with MessageFromWorker {
    
    var files: js.Array[AbsoluteFsPath]
    
    var `type`: `transformed-files`
  }
  object TransformedFilesMessage {
    
    inline def apply(files: js.Array[AbsoluteFsPath]): TransformedFilesMessage = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("transformed-files")
      __obj.asInstanceOf[TransformedFilesMessage]
    }
    
    extension [Self <: TransformedFilesMessage](x: Self) {
      
      inline def setFiles(value: js.Array[AbsoluteFsPath]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: AbsoluteFsPath*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setType(value: `transformed-files`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdatePackageJsonMessage
    extends StObject
       with JsonObject
       with MessageFromWorker {
    
    var changes: js.Array[PackageJsonChange]
    
    var packageJsonPath: AbsoluteFsPath
    
    var `type`: `update-package-json`
  }
  object UpdatePackageJsonMessage {
    
    inline def apply(changes: js.Array[PackageJsonChange], packageJsonPath: AbsoluteFsPath): UpdatePackageJsonMessage = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], packageJsonPath = packageJsonPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update-package-json")
      __obj.asInstanceOf[UpdatePackageJsonMessage]
    }
    
    extension [Self <: UpdatePackageJsonMessage](x: Self) {
      
      inline def setChanges(value: js.Array[PackageJsonChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: PackageJsonChange*): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setPackageJsonPath(value: AbsoluteFsPath): Self = StObject.set(x, "packageJsonPath", value.asInstanceOf[js.Any])
      
      inline def setType(value: `update-package-json`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
