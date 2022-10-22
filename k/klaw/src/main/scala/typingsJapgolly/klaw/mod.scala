package typingsJapgolly.klaw

import typingsJapgolly.klaw.klawStrings.close
import typingsJapgolly.klaw.klawStrings.data
import typingsJapgolly.klaw.klawStrings.end
import typingsJapgolly.klaw.klawStrings.error
import typingsJapgolly.klaw.klawStrings.readable
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(root: String): Walker = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[Walker]
  inline def apply(root: String, options: Options): Walker = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Walker]
  
  @JSImport("klaw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.klaw.klawStrings.close
    - typingsJapgolly.klaw.klawStrings.data
    - typingsJapgolly.klaw.klawStrings.end
    - typingsJapgolly.klaw.klawStrings.error
    - typingsJapgolly.klaw.klawStrings.pause
    - typingsJapgolly.klaw.klawStrings.readable
    - typingsJapgolly.klaw.klawStrings.resume
  */
  trait Event extends StObject
  object Event {
    
    inline def close: typingsJapgolly.klaw.klawStrings.close = "close".asInstanceOf[typingsJapgolly.klaw.klawStrings.close]
    
    inline def data: typingsJapgolly.klaw.klawStrings.data = "data".asInstanceOf[typingsJapgolly.klaw.klawStrings.data]
    
    inline def end: typingsJapgolly.klaw.klawStrings.end = "end".asInstanceOf[typingsJapgolly.klaw.klawStrings.end]
    
    inline def error: typingsJapgolly.klaw.klawStrings.error = "error".asInstanceOf[typingsJapgolly.klaw.klawStrings.error]
    
    inline def pause: typingsJapgolly.klaw.klawStrings.pause = "pause".asInstanceOf[typingsJapgolly.klaw.klawStrings.pause]
    
    inline def readable: typingsJapgolly.klaw.klawStrings.readable = "readable".asInstanceOf[typingsJapgolly.klaw.klawStrings.readable]
    
    inline def resume: typingsJapgolly.klaw.klawStrings.resume = "resume".asInstanceOf[typingsJapgolly.klaw.klawStrings.resume]
  }
  
  trait Item extends StObject {
    
    var path: String
    
    var stats: Stats
  }
  object Item {
    
    inline def apply(path: String, stats: Stats): Item = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with ReadableOptions {
    
    var depthLimit: js.UndefOr[Double] = js.undefined
    
    // fs or mock-fs
    var filter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
    
    var fs: js.UndefOr[Any] = js.undefined
    
    var pathSorter: js.UndefOr[js.Function2[/* pathA */ String, /* pathB */ String, Double]] = js.undefined
    
    var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
    
    var queueMethod: js.UndefOr[QueueMethod] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDepthLimit(value: Double): Self = StObject.set(x, "depthLimit", value.asInstanceOf[js.Any])
      
      inline def setDepthLimitUndefined: Self = StObject.set(x, "depthLimit", js.undefined)
      
      inline def setFilter(value: /* path */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setPathSorter(value: (/* pathA */ String, /* pathB */ String) => Double): Self = StObject.set(x, "pathSorter", js.Any.fromFunction2(value))
      
      inline def setPathSorterUndefined: Self = StObject.set(x, "pathSorter", js.undefined)
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setQueueMethod(value: QueueMethod): Self = StObject.set(x, "queueMethod", value.asInstanceOf[js.Any])
      
      inline def setQueueMethodUndefined: Self = StObject.set(x, "queueMethod", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.klaw.klawStrings.shift
    - typingsJapgolly.klaw.klawStrings.pop
  */
  trait QueueMethod extends StObject
  object QueueMethod {
    
    inline def pop: typingsJapgolly.klaw.klawStrings.pop = "pop".asInstanceOf[typingsJapgolly.klaw.klawStrings.pop]
    
    inline def shift: typingsJapgolly.klaw.klawStrings.shift = "shift".asInstanceOf[typingsJapgolly.klaw.klawStrings.shift]
  }
  
  @js.native
  trait Walker
    extends Readable
       with AsyncIterable[Item] {
    
    def on(event: Event, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* item */ Item, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  }
}
