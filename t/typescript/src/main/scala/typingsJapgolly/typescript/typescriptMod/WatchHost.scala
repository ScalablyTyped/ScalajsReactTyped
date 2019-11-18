package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Host that has watch functionality used in --watch mode */
@js.native
trait WatchHost extends js.Object {
  /** If provided, will be used to reset existing delayed compilation */
  var clearTimeout: js.UndefOr[js.Function1[/* timeoutId */ js.Any, Unit]] = js.native
  /** If provided, called with Diagnostic message that informs about change in watch status */
  var onWatchStatusChange: js.UndefOr[
    js.Function4[
      /* diagnostic */ Diagnostic, 
      /* newLine */ String, 
      /* options */ CompilerOptions, 
      /* errorCount */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** If provided, will be used to set delayed compilation, so that multiple changes in short span are compiled together */
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
      /* ms */ Double, 
      /* repeated */ js.Any, 
      _
    ]
  ] = js.native
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  def watchDirectory(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
  def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  def watchFile(path: String, callback: FileWatcherCallback): FileWatcher = js.native
  def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
}

