package typingsJapgolly.maxmind

import typingsJapgolly.maxmind.anon.FnCall
import typingsJapgolly.node.anon.WatchFileOptionsbigintfal
import typingsJapgolly.node.anon.WatchFileOptionsbiginttru
import typingsJapgolly.node.fsMod.BigIntStats
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.StatWatcher
import typingsJapgolly.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFsMod {
  
  object default {
    
    @JSImport("maxmind/lib/fs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("maxmind/lib/fs", "default.existsSync")
    @js.native
    def existsSync: js.Function1[/* path */ PathLike, Boolean] = js.native
    inline def existsSync(path: PathLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def existsSync_=(x: js.Function1[/* path */ PathLike, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("existsSync")(x.asInstanceOf[js.Any])
    
    @JSImport("maxmind/lib/fs", "default.readFile")
    @js.native
    def readFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ Any = js.native
    inline def readFile_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFile")(x.asInstanceOf[js.Any])
    
    @JSImport("maxmind/lib/fs", "default.watchFile")
    @js.native
    def watchFile: FnCall = js.native
    inline def watchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
    inline def watchFile(
      filename: PathLike,
      options: Unit,
      listener: js.Function2[
          (/* curr */ BigIntStats) | (/* curr */ Stats), 
          (/* prev */ BigIntStats) | (/* prev */ Stats), 
          Unit
        ]
    ): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
    inline def watchFile(
      filename: PathLike,
      options: WatchFileOptionsbigintfal,
      listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
    ): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
    inline def watchFile(
      filename: PathLike,
      options: WatchFileOptionsbiginttru,
      listener: js.Function2[/* curr */ BigIntStats, /* prev */ BigIntStats, Unit]
    ): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
    inline def watchFile_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("watchFile")(x.asInstanceOf[js.Any])
  }
}
