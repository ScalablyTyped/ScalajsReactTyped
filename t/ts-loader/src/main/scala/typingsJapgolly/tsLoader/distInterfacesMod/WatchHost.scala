package typingsJapgolly.tsLoader.distInterfacesMod

import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typingsJapgolly.typescript.mod.FileWatcherEventKind
import typingsJapgolly.typescript.mod.OutputFile
import typingsJapgolly.typescript.mod.WatchCompilerHostOfFilesAndCompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchHost
  extends StObject
     with WatchCompilerHostOfFilesAndCompilerOptions[EmitAndSemanticDiagnosticsBuilderProgram]
     with HostMayBeCacheable {
  
  def invokeFileWatcher(fileName: String, eventKind: FileWatcherEventKind): Boolean = js.native
  @JSName("invokeFileWatcher")
  var invokeFileWatcher_Original: js.Function2[/* fileName */ String, /* eventKind */ FileWatcherEventKind, Boolean] = js.native
  
  var outputFiles: Map[FilePathKey, js.Array[OutputFile]] = js.native
  
  var tsbuildinfo: js.UndefOr[OutputFile] = js.native
  
  def updateRootFileNames(): Unit = js.native
}
