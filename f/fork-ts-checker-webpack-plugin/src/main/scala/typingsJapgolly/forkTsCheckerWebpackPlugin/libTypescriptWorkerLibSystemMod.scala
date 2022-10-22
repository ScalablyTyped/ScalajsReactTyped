package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.forkTsCheckerWebpackPlugin.libFilesMatchMod.FilesMatch
import typingsJapgolly.typescript.mod.DirectoryWatcherCallback
import typingsJapgolly.typescript.mod.FileWatcher
import typingsJapgolly.typescript.mod.FileWatcherCallback
import typingsJapgolly.typescript.mod.System
import typingsJapgolly.typescript.mod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWorkerLibSystemMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/system", "system")
  @js.native
  val system: ControlledTypeScriptSystem = js.native
  
  @js.native
  trait ControlledTypeScriptSystem
    extends StObject
       with System {
    
    @JSName("clearTimeout")
    def clearTimeout_MControlledTypeScriptSystem(timeoutId: Any): Unit = js.native
    
    @JSName("deleteFile")
    def deleteFile_MControlledTypeScriptSystem(path: String): Unit = js.native
    
    @JSName("getFileSize")
    def getFileSize_MControlledTypeScriptSystem(path: String): Double = js.native
    
    @JSName("getModifiedTime")
    def getModifiedTime_MControlledTypeScriptSystem(path: String): js.UndefOr[js.Date] = js.native
    
    def invalidateCache(): Unit = js.native
    
    def invokeFileChanged(path: String): Unit = js.native
    
    def invokeFileCreated(path: String): Unit = js.native
    
    def invokeFileDeleted(path: String): Unit = js.native
    
    def setArtifacts(artifacts: FilesMatch): Unit = js.native
    
    @JSName("setModifiedTime")
    def setModifiedTime_MControlledTypeScriptSystem(path: String, time: js.Date): Unit = js.native
    
    @JSName("setTimeout")
    def setTimeout_MControlledTypeScriptSystem(callback: js.Function1[/* repeated */ Any, Unit], ms: Double, args: Any*): Any = js.native
    
    def waitForQueued(): js.Promise[Unit] = js.native
    
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: WatchOptions): FileWatcher = js.native
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback, recursive: Unit, options: WatchOptions): FileWatcher = js.native
    
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback): FileWatcher = js.native
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: WatchOptions): FileWatcher = js.native
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback, pollingInterval: Unit, options: WatchOptions): FileWatcher = js.native
  }
}
