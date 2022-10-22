package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcExecutionApiMod.AnalyzeEntryPointsFn
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionApiMod.CreateCompileFn
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionApiMod.Executor
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionTasksApiMod.CreateTaskCompletedCallback
import typingsJapgolly.angularCompilerCli.ngccSrcLockingAsyncLockerMod.AsyncLocker
import typingsJapgolly.angularCompilerCli.ngccSrcLockingSyncLockerMod.SyncLocker
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionSingleProcessExecutorMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/single_process_executor", "SingleProcessExecutorAsync")
  @js.native
  open class SingleProcessExecutorAsync protected ()
    extends SingleProcessorExecutorBase
       with Executor {
    def this(logger: Logger, lockFile: AsyncLocker, createTaskCompletedCallback: CreateTaskCompletedCallback) = this()
    
    /* CompleteClass */
    override def execute(analyzeEntryPoints: AnalyzeEntryPointsFn, createCompileFn: CreateCompileFn): Unit | js.Promise[Unit] = js.native
    
    /* private */ var lockFile: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/single_process_executor", "SingleProcessExecutorSync")
  @js.native
  open class SingleProcessExecutorSync protected ()
    extends SingleProcessorExecutorBase
       with Executor {
    def this(logger: Logger, lockFile: SyncLocker, createTaskCompletedCallback: CreateTaskCompletedCallback) = this()
    
    /* CompleteClass */
    override def execute(analyzeEntryPoints: AnalyzeEntryPointsFn, createCompileFn: CreateCompileFn): Unit | js.Promise[Unit] = js.native
    
    /* private */ var lockFile: Any = js.native
  }
  
  /* note: abstract class */ @JSImport("@angular/compiler-cli/ngcc/src/execution/single_process_executor", "SingleProcessorExecutorBase")
  @js.native
  open class SingleProcessorExecutorBase protected () extends StObject {
    def this(logger: Logger, createTaskCompletedCallback: CreateTaskCompletedCallback) = this()
    
    /* private */ var createTaskCompletedCallback: Any = js.native
    
    def doExecute(analyzeEntryPoints: AnalyzeEntryPointsFn, createCompileFn: CreateCompileFn): Unit | js.Promise[Unit] = js.native
    
    /* private */ var logger: Any = js.native
  }
}
