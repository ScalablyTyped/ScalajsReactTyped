package typingsJapgolly.nodelibFsWalk

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodelibFsWalk.outTypesMod.Entry
import typingsJapgolly.nodelibFsWalk.outTypesMod.Errno
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersAsyncMod {
  
  @JSImport("@nodelib/fs.walk/out/providers/async", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AsyncProvider {
    def this(_root: String, _settings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default) = this()
    
    /* protected */ /* CompleteClass */
    override val _reader: typingsJapgolly.nodelibFsWalk.outReadersAsyncMod.default = js.native
    
    /* private */ /* CompleteClass */
    override val _root: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _settings: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _storage: Any = js.native
    
    /* CompleteClass */
    override def read(callback: AsyncCallback): Unit = js.native
  }
  
  type AsyncCallback = js.Function2[/* error */ Errno, /* entries */ js.Array[Entry], Unit]
  
  trait AsyncProvider extends StObject {
    
    /* protected */ val _reader: typingsJapgolly.nodelibFsWalk.outReadersAsyncMod.default
    
    /* private */ val _root: Any
    
    /* private */ val _settings: Any
    
    /* private */ val _storage: Any
    
    def read(callback: AsyncCallback): Unit
  }
  object AsyncProvider {
    
    inline def apply(
      _reader: typingsJapgolly.nodelibFsWalk.outReadersAsyncMod.default,
      _root: Any,
      _settings: Any,
      _storage: Any,
      read: AsyncCallback => Callback
    ): AsyncProvider = {
      val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _storage = _storage.asInstanceOf[js.Any], read = js.Any.fromFunction1((t0: AsyncCallback) => read(t0).runNow()))
      __obj.asInstanceOf[AsyncProvider]
    }
    
    extension [Self <: AsyncProvider](x: Self) {
      
      inline def setRead(value: AsyncCallback => Callback): Self = StObject.set(x, "read", js.Any.fromFunction1((t0: AsyncCallback) => value(t0).runNow()))
      
      inline def set_reader(value: typingsJapgolly.nodelibFsWalk.outReadersAsyncMod.default): Self = StObject.set(x, "_reader", value.asInstanceOf[js.Any])
      
      inline def set_root(value: Any): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      inline def set_storage(value: Any): Self = StObject.set(x, "_storage", value.asInstanceOf[js.Any])
    }
  }
}
