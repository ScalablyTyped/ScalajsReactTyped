package typingsJapgolly.sane

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.sane.saneStrings.add
import typingsJapgolly.sane.saneStrings.all
import typingsJapgolly.sane.saneStrings.change
import typingsJapgolly.sane.saneStrings.delete
import typingsJapgolly.sane.saneStrings.error
import typingsJapgolly.sane.saneStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(dir: String): Watcher = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[Watcher]
  inline def apply(dir: String, options: Options): Watcher = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Watcher]
  
  @JSImport("sane", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sane", "FSEventsWatcher")
  @js.native
  open class FSEventsWatcher protected () extends SaneWatcher {
    def this(dir: String) = this()
    def this(dir: String, options: Options) = this()
  }
  @JSImport("sane", "FSEventsWatcher")
  @js.native
  val FSEventsWatcher: Instantiable2[/* dir */ String, /* options */ js.UndefOr[Options], SaneWatcher] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sane", "NodeWatcher")
  @js.native
  open class NodeWatcher protected () extends SaneWatcher {
    def this(dir: String) = this()
    def this(dir: String, options: Options) = this()
  }
  @JSImport("sane", "NodeWatcher")
  @js.native
  val NodeWatcher: Instantiable2[/* dir */ String, /* options */ js.UndefOr[Options], SaneWatcher] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sane", "PollWatcher")
  @js.native
  open class PollWatcher protected () extends SaneWatcher {
    def this(dir: String) = this()
    def this(dir: String, options: Options) = this()
  }
  @JSImport("sane", "PollWatcher")
  @js.native
  val PollWatcher: Instantiable2[/* dir */ String, /* options */ js.UndefOr[Options], SaneWatcher] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sane", "WatchmanWatcher")
  @js.native
  open class WatchmanWatcher protected () extends SaneWatcher {
    def this(dir: String) = this()
    def this(dir: String, options: Options) = this()
  }
  @JSImport("sane", "WatchmanWatcher")
  @js.native
  val WatchmanWatcher: Instantiable2[/* dir */ String, /* options */ js.UndefOr[Options], SaneWatcher] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sane.saneStrings.add
    - typingsJapgolly.sane.saneStrings.change
    - typingsJapgolly.sane.saneStrings.delete
  */
  trait AllEventType extends StObject
  object AllEventType {
    
    inline def add: typingsJapgolly.sane.saneStrings.add = "add".asInstanceOf[typingsJapgolly.sane.saneStrings.add]
    
    inline def change: typingsJapgolly.sane.saneStrings.change = "change".asInstanceOf[typingsJapgolly.sane.saneStrings.change]
    
    inline def delete: typingsJapgolly.sane.saneStrings.delete = "delete".asInstanceOf[typingsJapgolly.sane.saneStrings.delete]
  }
  
  type AnymatchMatcher = String | js.RegExp | (js.Function1[/* repeated */ String, Boolean])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sane.saneStrings.ready
    - typingsJapgolly.sane.saneStrings.error
    - typingsJapgolly.sane.saneStrings.all
    - typingsJapgolly.sane.saneStrings.add
    - typingsJapgolly.sane.saneStrings.change
    - typingsJapgolly.sane.saneStrings.delete
  */
  trait EventType extends StObject
  object EventType {
    
    inline def add: typingsJapgolly.sane.saneStrings.add = "add".asInstanceOf[typingsJapgolly.sane.saneStrings.add]
    
    inline def all: typingsJapgolly.sane.saneStrings.all = "all".asInstanceOf[typingsJapgolly.sane.saneStrings.all]
    
    inline def change: typingsJapgolly.sane.saneStrings.change = "change".asInstanceOf[typingsJapgolly.sane.saneStrings.change]
    
    inline def delete: typingsJapgolly.sane.saneStrings.delete = "delete".asInstanceOf[typingsJapgolly.sane.saneStrings.delete]
    
    inline def error: typingsJapgolly.sane.saneStrings.error = "error".asInstanceOf[typingsJapgolly.sane.saneStrings.error]
    
    inline def ready: typingsJapgolly.sane.saneStrings.ready = "ready".asInstanceOf[typingsJapgolly.sane.saneStrings.ready]
  }
  
  trait Options extends StObject {
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var fsevents: js.UndefOr[Boolean] = js.undefined
    
    var glob: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ignored: js.UndefOr[AnymatchMatcher | js.Array[AnymatchMatcher]] = js.undefined
    
    var poll: js.UndefOr[Boolean] = js.undefined
    
    var watcher: js.UndefOr[String] = js.undefined
    
    var watchman: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setFsevents(value: Boolean): Self = StObject.set(x, "fsevents", value.asInstanceOf[js.Any])
      
      inline def setFseventsUndefined: Self = StObject.set(x, "fsevents", js.undefined)
      
      inline def setGlob(value: String | js.Array[String]): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setGlobVarargs(value: String*): Self = StObject.set(x, "glob", js.Array(value*))
      
      inline def setIgnored(value: AnymatchMatcher | js.Array[AnymatchMatcher]): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      inline def setIgnoredFunction1(value: /* repeated */ String => Boolean): Self = StObject.set(x, "ignored", js.Any.fromFunction1(value))
      
      inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      inline def setIgnoredVarargs(value: AnymatchMatcher*): Self = StObject.set(x, "ignored", js.Array(value*))
      
      inline def setPoll(value: Boolean): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
      
      inline def setWatcher(value: String): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
      
      inline def setWatcherUndefined: Self = StObject.set(x, "watcher", js.undefined)
      
      inline def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
      
      inline def setWatchmanUndefined: Self = StObject.set(x, "watchman", js.undefined)
    }
  }
  
  @js.native
  trait SaneWatcher extends EventEmitter {
    
    def addListener(
      event: add | change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    val dot: Boolean = js.native
    
    def emit(event: add | change, path: String, root: String, stat: Stats): Boolean = js.native
    @JSName("emit")
    def emit_all(event: all, eventType: AllEventType, path: String, root: String): Boolean = js.native
    @JSName("emit")
    def emit_all(event: all, eventType: AllEventType, path: String, root: String, stat: Stats): Boolean = js.native
    @JSName("emit")
    def emit_delete(event: delete, path: String, root: String): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, error: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_ready(event: ready): Boolean = js.native
    
    val globs: js.Array[String] = js.native
    
    val hasIgnore: Boolean = js.native
    
    val ignored: AnymatchMatcher | js.Array[AnymatchMatcher] = js.native
    
    def listenerCount(`type`: EventType): Double = js.native
    
    // tslint:disable-next-line ban-types
    def listeners(event: EventType): js.Array[js.Function] = js.native
    
    def on(
      event: add | change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def once(
      event: add | change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def prependListener(
      event: add | change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def prependOnceListener(
      event: add | change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def removeAllListeners(event: EventType): this.type = js.native
    
    def removeListener(
      event: add | change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    val root: String = js.native
  }
  
  type Watcher = SaneWatcher
}
