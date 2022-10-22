package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcExecutionApiMod.AnalyzeEntryPointsFn
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionApiMod.CreateCompileFn
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionApiMod.Executor
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionTasksApiMod.CreateTaskCompletedCallback
import typingsJapgolly.angularCompilerCli.ngccSrcLockingAsyncLockerMod.AsyncLocker
import typingsJapgolly.angularCompilerCli.ngccSrcWritingFileWriterMod.FileWriter
import typingsJapgolly.angularCompilerCli.ngccSrcWritingPackageJsonUpdaterMod.PackageJsonUpdater
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionClusterExecutorMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/cluster/executor", "ClusterExecutor")
  @js.native
  open class ClusterExecutor protected ()
    extends StObject
       with Executor {
    def this(
      workerCount: Double,
      fileSystem: PathManipulation,
      logger: Logger,
      fileWriter: FileWriter,
      pkgJsonUpdater: PackageJsonUpdater,
      lockFile: AsyncLocker,
      createTaskCompletedCallback: CreateTaskCompletedCallback
    ) = this()
    
    /* private */ var createTaskCompletedCallback: Any = js.native
    
    /* CompleteClass */
    override def execute(analyzeEntryPoints: AnalyzeEntryPointsFn, createCompileFn: CreateCompileFn): Unit | js.Promise[Unit] = js.native
    
    /* private */ var fileSystem: Any = js.native
    
    /* private */ var fileWriter: Any = js.native
    
    /* private */ var lockFile: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var pkgJsonUpdater: Any = js.native
    
    /* private */ var workerCount: Any = js.native
  }
}
