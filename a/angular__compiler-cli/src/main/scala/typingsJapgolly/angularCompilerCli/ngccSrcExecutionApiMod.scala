package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcExecutionTasksApiMod.Task
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionTasksApiMod.TaskCompletedCallback
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionTasksApiMod.TaskQueue
import typingsJapgolly.angularCompilerCli.ngccSrcRenderingUtilsMod.FileToWrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionApiMod {
  
  type AnalyzeEntryPointsFn = js.Function0[TaskQueue]
  
  type CompileFn[T] = js.Function1[/* task */ Task, Unit | T]
  
  type CreateCompileFn = js.Function2[
    /* beforeWritingFiles */ js.Function1[/* transformedFiles */ js.Array[FileToWrite], Unit | js.Promise[Unit]], 
    /* onTaskCompleted */ TaskCompletedCallback, 
    CompileFn[Unit | js.Promise[Unit]]
  ]
  
  trait Executor extends StObject {
    
    def execute(analyzeEntryPoints: AnalyzeEntryPointsFn, createCompileFn: CreateCompileFn): Unit | js.Promise[Unit]
  }
  object Executor {
    
    inline def apply(execute: (AnalyzeEntryPointsFn, CreateCompileFn) => Unit | js.Promise[Unit]): Executor = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute))
      __obj.asInstanceOf[Executor]
    }
    
    extension [Self <: Executor](x: Self) {
      
      inline def setExecute(value: (AnalyzeEntryPointsFn, CreateCompileFn) => Unit | js.Promise[Unit]): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
    }
  }
}
