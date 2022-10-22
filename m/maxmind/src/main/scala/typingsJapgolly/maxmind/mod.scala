package typingsJapgolly.maxmind

import typingsJapgolly.maxmind.anon.Max
import typingsJapgolly.mmdbLib.libReaderResponseMod.Response
import typingsJapgolly.mmdbLib.libTypesMod.ReaderOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("maxmind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("maxmind", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[scala.Nothing]
    
    inline def open[T /* <: Response */](filepath: String): js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]]]
    inline def open[T /* <: Response */](filepath: String, opts: Unit, cb: Callback): js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(filepath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]]]
    inline def open[T /* <: Response */](filepath: String, opts: OpenOpts): js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(filepath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]]]
    inline def open[T /* <: Response */](filepath: String, opts: OpenOpts, cb: Callback): js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(filepath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]]]
    
    inline def openSync(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")().asInstanceOf[scala.Nothing]
    
    inline def validate(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("maxmind", "Reader")
  @js.native
  open class Reader[T /* <: Response */] protected ()
    extends typingsJapgolly.mmdbLib.mod.Reader[T] {
    def this(db: Buffer) = this()
    def this(db: Buffer, opts: ReaderOptions) = this()
  }
  
  inline def init(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[scala.Nothing]
  
  inline def open[T /* <: Response */](filepath: String): js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]]]
  inline def open[T /* <: Response */](filepath: String, opts: Unit, cb: Callback): js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(filepath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]]]
  inline def open[T /* <: Response */](filepath: String, opts: OpenOpts): js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(filepath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]]]
  inline def open[T /* <: Response */](filepath: String, opts: OpenOpts, cb: Callback): js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(filepath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.mmdbLib.mod.Reader[T]]]
  
  inline def openSync(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")().asInstanceOf[scala.Nothing]
  
  inline def validate(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Callback = js.Function0[Unit]
  
  trait OpenOpts extends StObject {
    
    var cache: js.UndefOr[Max] = js.undefined
    
    var watchForUpdates: js.UndefOr[Boolean] = js.undefined
    
    var watchForUpdatesHook: js.UndefOr[Callback] = js.undefined
    
    var watchForUpdatesNonPersistent: js.UndefOr[Boolean] = js.undefined
  }
  object OpenOpts {
    
    inline def apply(): OpenOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOpts]
    }
    
    extension [Self <: OpenOpts](x: Self) {
      
      inline def setCache(value: Max): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setWatchForUpdates(value: Boolean): Self = StObject.set(x, "watchForUpdates", value.asInstanceOf[js.Any])
      
      inline def setWatchForUpdatesHook(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "watchForUpdatesHook", value.toJsFn)
      
      inline def setWatchForUpdatesHookUndefined: Self = StObject.set(x, "watchForUpdatesHook", js.undefined)
      
      inline def setWatchForUpdatesNonPersistent(value: Boolean): Self = StObject.set(x, "watchForUpdatesNonPersistent", value.asInstanceOf[js.Any])
      
      inline def setWatchForUpdatesNonPersistentUndefined: Self = StObject.set(x, "watchForUpdatesNonPersistent", js.undefined)
      
      inline def setWatchForUpdatesUndefined: Self = StObject.set(x, "watchForUpdates", js.undefined)
    }
  }
}
