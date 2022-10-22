package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.ignore
import typingsJapgolly.forkTsCheckerWebpackPlugin.libPluginStateMod.ForkTsCheckerWebpackPluginState
import typingsJapgolly.forkTsCheckerWebpackPlugin.libWatchWatchFileSystemMod.Watch
import typingsJapgolly.forkTsCheckerWebpackPlugin.libWatchWatchFileSystemMod.WatchFileSystem
import typingsJapgolly.forkTsCheckerWebpackPlugin.libWatchWatchFileSystemMod.Watchpack
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.FileSystemInfoEntry
import typingsJapgolly.webpack.mod.WatchOptions
import typingsJapgolly.webpack.mod.Watcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWatchInclusiveNodeWatchFileSystemMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/watch/inclusive-node-watch-file-system", "InclusiveNodeWatchFileSystem")
  @js.native
  open class InclusiveNodeWatchFileSystem protected ()
    extends StObject
       with WatchFileSystem {
    def this(watchFileSystem: WatchFileSystem, compiler: Compiler, pluginState: ForkTsCheckerWebpackPluginState) = this()
    
    /* private */ var compiler: Any = js.native
    
    /* private */ var deletedFiles: Any = js.native
    
    /* private */ val dirsWatchers: Any = js.native
    
    /* private */ var paused: Any = js.native
    
    /* private */ var pluginState: Any = js.native
    
    /* private */ var watchFileSystem: Any = js.native
    
    /* CompleteClass */
    @JSName("watch")
    var watch_Original: Watch = js.native
    /* CompleteClass */
    @JSName("watch")
    override def watch_ignore(
      files: js.Iterable[String],
      directories: js.Iterable[String],
      missing: js.Iterable[String],
      startTime: Double,
      options: WatchOptions,
      callback: js.Function5[
          /* arg0 */ js.UndefOr[js.Error], 
          /* arg1 */ Map[String, FileSystemInfoEntry | ignore], 
          /* arg2 */ Map[String, FileSystemInfoEntry | ignore], 
          /* arg3 */ Set[String], 
          /* arg4 */ Set[String], 
          Unit
        ],
      callbackUndelayed: js.Function2[/* arg0 */ String, /* arg1 */ Double, Unit]
    ): Watcher = js.native
    
    @JSName("watcher")
    def watcher_MInclusiveNodeWatchFileSystem: js.UndefOr[Watchpack] = js.native
  }
}
