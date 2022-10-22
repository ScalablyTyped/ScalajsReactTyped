package typingsJapgolly.walk

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.walk.walkStrings.FIFO
import typingsJapgolly.walk.walkStrings.blockDevice
import typingsJapgolly.walk.walkStrings.characterDevice
import typingsJapgolly.walk.walkStrings.directory
import typingsJapgolly.walk.walkStrings.end
import typingsJapgolly.walk.walkStrings.file
import typingsJapgolly.walk.walkStrings.names
import typingsJapgolly.walk.walkStrings.socket
import typingsJapgolly.walk.walkStrings.symbolicLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("walk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def walk(path: String): Walker = ^.asInstanceOf[js.Dynamic].applyDynamic("walk")(path.asInstanceOf[js.Any]).asInstanceOf[Walker]
  inline def walk(path: String, options: WalkOptions): Walker = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Walker]
  
  inline def walkSync(path: String): Walker = ^.asInstanceOf[js.Dynamic].applyDynamic("walkSync")(path.asInstanceOf[js.Any]).asInstanceOf[Walker]
  inline def walkSync(path: String, options: WalkOptions): Walker = (^.asInstanceOf[js.Dynamic].applyDynamic("walkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Walker]
  
  type WalkNamesEventCallback = js.Function3[/* base */ String, /* names */ js.Array[String], /* next */ WalkNext, Unit]
  
  type WalkNext = js.Function0[Unit]
  
  trait WalkOptions extends StObject {
    
    var filters: js.UndefOr[js.Array[String]] = js.undefined
    
    var followLinks: js.UndefOr[Boolean] = js.undefined
    
    var listeners: js.UndefOr[WalkOptionsListeners] = js.undefined
  }
  object WalkOptions {
    
    inline def apply(): WalkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptions]
    }
    
    extension [Self <: WalkOptions](x: Self) {
      
      inline def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setFollowLinks(value: Boolean): Self = StObject.set(x, "followLinks", value.asInstanceOf[js.Any])
      
      inline def setFollowLinksUndefined: Self = StObject.set(x, "followLinks", js.undefined)
      
      inline def setListeners(value: WalkOptionsListeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    }
  }
  
  trait WalkOptionsListeners extends StObject {
    
    var directories: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
    
    var directory: js.UndefOr[WalkStatEventCallback] = js.undefined
    
    var directoryError: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
    
    var end: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
    
    var errors: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
    
    var file: js.UndefOr[WalkStatEventCallback] = js.undefined
    
    var files: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
    
    var names: js.UndefOr[WalkNamesEventCallback] = js.undefined
    
    var nodeError: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  }
  object WalkOptionsListeners {
    
    inline def apply(): WalkOptionsListeners = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptionsListeners]
    }
    
    extension [Self <: WalkOptionsListeners](x: Self) {
      
      inline def setDirectories(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback): Self = StObject.set(x, "directories", js.Any.fromFunction3((t0: /* base */ String, t1: /* names */ js.Array[WalkStats], t2: /* next */ WalkNext) => (value(t0, t1, t2)).runNow()))
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setDirectory(value: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Callback): Self = StObject.set(x, "directory", js.Any.fromFunction3((t0: /* base */ String, t1: /* names */ WalkStats, t2: /* next */ WalkNext) => (value(t0, t1, t2)).runNow()))
      
      inline def setDirectoryError(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback): Self = StObject.set(x, "directoryError", js.Any.fromFunction3((t0: /* base */ String, t1: /* names */ js.Array[WalkStats], t2: /* next */ WalkNext) => (value(t0, t1, t2)).runNow()))
      
      inline def setDirectoryErrorUndefined: Self = StObject.set(x, "directoryError", js.undefined)
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setEnd(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback): Self = StObject.set(x, "end", js.Any.fromFunction3((t0: /* base */ String, t1: /* names */ js.Array[WalkStats], t2: /* next */ WalkNext) => (value(t0, t1, t2)).runNow()))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setErrors(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback): Self = StObject.set(x, "errors", js.Any.fromFunction3((t0: /* base */ String, t1: /* names */ js.Array[WalkStats], t2: /* next */ WalkNext) => (value(t0, t1, t2)).runNow()))
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setFile(value: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Callback): Self = StObject.set(x, "file", js.Any.fromFunction3((t0: /* base */ String, t1: /* names */ WalkStats, t2: /* next */ WalkNext) => (value(t0, t1, t2)).runNow()))
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFiles(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback): Self = StObject.set(x, "files", js.Any.fromFunction3((t0: /* base */ String, t1: /* names */ js.Array[WalkStats], t2: /* next */ WalkNext) => (value(t0, t1, t2)).runNow()))
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setNames(value: (/* base */ String, /* names */ js.Array[String], /* next */ WalkNext) => Callback): Self = StObject.set(x, "names", js.Any.fromFunction3((t0: /* base */ String, t1: /* names */ js.Array[String], t2: /* next */ WalkNext) => (value(t0, t1, t2)).runNow()))
      
      inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
      
      inline def setNodeError(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Callback): Self = StObject.set(x, "nodeError", js.Any.fromFunction3((t0: /* base */ String, t1: /* names */ js.Array[WalkStats], t2: /* next */ WalkNext) => (value(t0, t1, t2)).runNow()))
      
      inline def setNodeErrorUndefined: Self = StObject.set(x, "nodeError", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.walk.walkStrings.files
    - typingsJapgolly.walk.walkStrings.directories
    - typingsJapgolly.walk.walkStrings.errors
    - typingsJapgolly.walk.walkStrings.nodeError
    - typingsJapgolly.walk.walkStrings.directoryError
  */
  trait WalkStatArrayEvent extends StObject
  object WalkStatArrayEvent {
    
    inline def directories: typingsJapgolly.walk.walkStrings.directories = "directories".asInstanceOf[typingsJapgolly.walk.walkStrings.directories]
    
    inline def directoryError: typingsJapgolly.walk.walkStrings.directoryError = "directoryError".asInstanceOf[typingsJapgolly.walk.walkStrings.directoryError]
    
    inline def errors: typingsJapgolly.walk.walkStrings.errors = "errors".asInstanceOf[typingsJapgolly.walk.walkStrings.errors]
    
    inline def files: typingsJapgolly.walk.walkStrings.files = "files".asInstanceOf[typingsJapgolly.walk.walkStrings.files]
    
    inline def nodeError: typingsJapgolly.walk.walkStrings.nodeError = "nodeError".asInstanceOf[typingsJapgolly.walk.walkStrings.nodeError]
  }
  
  type WalkStatArrayEventCallback = js.Function3[/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.walk.walkStrings.file
    - typingsJapgolly.walk.walkStrings.directory
  */
  trait WalkStatEvent extends StObject
  object WalkStatEvent {
    
    inline def directory: typingsJapgolly.walk.walkStrings.directory = "directory".asInstanceOf[typingsJapgolly.walk.walkStrings.directory]
    
    inline def file: typingsJapgolly.walk.walkStrings.file = "file".asInstanceOf[typingsJapgolly.walk.walkStrings.file]
  }
  
  type WalkStatEventCallback = js.Function3[/* base */ String, /* names */ WalkStats, /* next */ WalkNext, Unit]
  
  @js.native
  trait WalkStats extends Stats {
    
    var error: js.UndefOr[ErrnoException] = js.native
    
    var name: String = js.native
    
    var `type`: file | directory | symbolicLink | blockDevice | characterDevice | FIFO | socket = js.native
  }
  
  @js.native
  trait Walker extends StObject {
    
    def on(event: WalkStatArrayEvent, cb: WalkStatArrayEventCallback): Unit = js.native
    def on(event: WalkStatEvent, cb: WalkStatEventCallback): Unit = js.native
    @JSName("on")
    def on_end(event: end, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_names(event: names, cb: WalkNamesEventCallback): Unit = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
  }
}
