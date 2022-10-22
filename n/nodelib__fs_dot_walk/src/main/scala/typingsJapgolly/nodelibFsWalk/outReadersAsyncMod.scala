package typingsJapgolly.nodelibFsWalk

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.nodelibFsWalk.outTypesMod.Entry
import typingsJapgolly.nodelibFsWalk.outTypesMod.Errno
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outReadersAsyncMod {
  
  @JSImport("@nodelib/fs.walk/out/readers/async", JSImport.Default)
  @js.native
  open class default protected () extends AsyncReader {
    def this(_root: String, _settings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default) = this()
  }
  
  @js.native
  trait AsyncReader
    extends typingsJapgolly.nodelibFsWalk.outReadersReaderMod.default {
    
    /* private */ var _emitEntry: Any = js.native
    
    /* protected */ val _emitter: EventEmitter = js.native
    
    /* private */ var _handleEntry: Any = js.native
    
    /* private */ var _handleError: Any = js.native
    
    /* private */ var _isDestroyed: Any = js.native
    
    /* private */ var _isFatalError: Any = js.native
    
    /* private */ var _pushToQueue: Any = js.native
    
    /* private */ val _queue: Any = js.native
    
    /* protected */ val _scandir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fsScandir.scandir */ Any = js.native
    
    /* private */ var _worker: Any = js.native
    
    def destroy(): Unit = js.native
    
    def isDestroyed: Boolean = js.native
    
    def onEnd(callback: EndEventCallback): Unit = js.native
    
    def onEntry(callback: EntryEventCallback): Unit = js.native
    
    def onError(callback: ErrorEventCallback): Unit = js.native
    
    def read(): EventEmitter = js.native
  }
  
  type EndEventCallback = js.Function0[Unit]
  
  type EntryEventCallback = js.Function1[/* entry */ Entry, Unit]
  
  type ErrorEventCallback = js.Function1[/* error */ Errno, Unit]
}
