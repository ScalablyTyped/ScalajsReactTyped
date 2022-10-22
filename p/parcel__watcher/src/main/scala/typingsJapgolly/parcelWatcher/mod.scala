package typingsJapgolly.parcelWatcher

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@parcel/watcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEventsSince(dir: FilePath, snapshot: FilePath): js.Promise[js.Array[Event]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventsSince")(dir.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Event]]]
  inline def getEventsSince(dir: FilePath, snapshot: FilePath, opts: Options): js.Promise[js.Array[Event]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventsSince")(dir.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Event]]]
  
  inline def subscribe(dir: FilePath, fn: SubscribeCallback): js.Promise[AsyncSubscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(dir.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AsyncSubscription]]
  inline def subscribe(dir: FilePath, fn: SubscribeCallback, opts: Options): js.Promise[AsyncSubscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(dir.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AsyncSubscription]]
  
  inline def unsubscribe(dir: FilePath, fn: SubscribeCallback): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(dir.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def unsubscribe(dir: FilePath, fn: SubscribeCallback, opts: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(dir.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeSnapshot(dir: FilePath, snapshot: FilePath): js.Promise[FilePath] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSnapshot")(dir.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FilePath]]
  inline def writeSnapshot(dir: FilePath, snapshot: FilePath, opts: Options): js.Promise[FilePath] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSnapshot")(dir.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FilePath]]
  
  trait AsyncSubscription extends StObject {
    
    def unsubscribe(): js.Promise[Unit]
  }
  object AsyncSubscription {
    
    inline def apply(unsubscribe: CallbackTo[js.Promise[Unit]]): AsyncSubscription = {
      val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.toJsFn)
      __obj.asInstanceOf[AsyncSubscription]
    }
    
    extension [Self <: AsyncSubscription](x: Self) {
      
      inline def setUnsubscribe(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "unsubscribe", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.parcelWatcher.parcelWatcherStrings.`fs-events`
    - typingsJapgolly.parcelWatcher.parcelWatcherStrings.watchman
    - typingsJapgolly.parcelWatcher.parcelWatcherStrings.inotify
    - typingsJapgolly.parcelWatcher.parcelWatcherStrings.windows
    - typingsJapgolly.parcelWatcher.parcelWatcherStrings.`brute-force`
  */
  trait BackendType extends StObject
  object BackendType {
    
    inline def `brute-force`: typingsJapgolly.parcelWatcher.parcelWatcherStrings.`brute-force` = "brute-force".asInstanceOf[typingsJapgolly.parcelWatcher.parcelWatcherStrings.`brute-force`]
    
    inline def `fs-events`: typingsJapgolly.parcelWatcher.parcelWatcherStrings.`fs-events` = "fs-events".asInstanceOf[typingsJapgolly.parcelWatcher.parcelWatcherStrings.`fs-events`]
    
    inline def inotify: typingsJapgolly.parcelWatcher.parcelWatcherStrings.inotify = "inotify".asInstanceOf[typingsJapgolly.parcelWatcher.parcelWatcherStrings.inotify]
    
    inline def watchman: typingsJapgolly.parcelWatcher.parcelWatcherStrings.watchman = "watchman".asInstanceOf[typingsJapgolly.parcelWatcher.parcelWatcherStrings.watchman]
    
    inline def windows: typingsJapgolly.parcelWatcher.parcelWatcherStrings.windows = "windows".asInstanceOf[typingsJapgolly.parcelWatcher.parcelWatcherStrings.windows]
  }
  
  trait Event extends StObject {
    
    var path: FilePath
    
    var `type`: EventType
  }
  object Event {
    
    inline def apply(path: FilePath, `type`: EventType): Event = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setPath(value: FilePath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.parcelWatcher.parcelWatcherStrings.create
    - typingsJapgolly.parcelWatcher.parcelWatcherStrings.update
    - typingsJapgolly.parcelWatcher.parcelWatcherStrings.delete
  */
  trait EventType extends StObject
  object EventType {
    
    inline def create: typingsJapgolly.parcelWatcher.parcelWatcherStrings.create = "create".asInstanceOf[typingsJapgolly.parcelWatcher.parcelWatcherStrings.create]
    
    inline def delete: typingsJapgolly.parcelWatcher.parcelWatcherStrings.delete = "delete".asInstanceOf[typingsJapgolly.parcelWatcher.parcelWatcherStrings.delete]
    
    inline def update: typingsJapgolly.parcelWatcher.parcelWatcherStrings.update = "update".asInstanceOf[typingsJapgolly.parcelWatcher.parcelWatcherStrings.update]
  }
  
  type FilePath = String
  
  trait Options extends StObject {
    
    var backend: js.UndefOr[BackendType] = js.undefined
    
    var ignore: js.UndefOr[js.Array[FilePath]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBackend(value: BackendType): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      inline def setIgnore(value: js.Array[FilePath]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: FilePath*): Self = StObject.set(x, "ignore", js.Array(value*))
    }
  }
  
  type SubscribeCallback = js.Function2[/* err */ js.Error | Null, /* events */ js.Array[Event], Any]
}
