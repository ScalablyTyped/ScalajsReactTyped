package typingsJapgolly.watchpack

import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watcherMod {
  
  @JSImport("watchpack/Watcher", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Watcher {
    def this(
      directoryWatcher: typingsJapgolly.watchpack.directoryWatcherMod.^,
      filePath: String,
      startTime: Double
    ) = this()
  }
  
  @js.native
  trait Watcher extends EventEmitter {
    
    def checkStartTime(mtime: Double, initial: Boolean): Boolean = js.native
    
    def close(): Unit = js.native
    
    var data: Double = js.native
    
    var directoryWatcher: typingsJapgolly.watchpack.directoryWatcherMod.^ = js.native
    
    var path: String = js.native
    
    var startTime: Double = js.native
  }
}
