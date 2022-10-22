package typingsJapgolly.nodelibFsWalk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodelibFsWalk.outTypesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersSyncMod {
  
  @JSImport("@nodelib/fs.walk/out/providers/sync", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SyncProvider {
    def this(_root: String, _settings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default) = this()
    
    /* protected */ /* CompleteClass */
    override val _reader: typingsJapgolly.nodelibFsWalk.outReadersSyncMod.default = js.native
    
    /* private */ /* CompleteClass */
    override val _root: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _settings: Any = js.native
    
    /* CompleteClass */
    override def read(): js.Array[Entry] = js.native
  }
  
  trait SyncProvider extends StObject {
    
    /* protected */ val _reader: typingsJapgolly.nodelibFsWalk.outReadersSyncMod.default
    
    /* private */ val _root: Any
    
    /* private */ val _settings: Any
    
    def read(): js.Array[Entry]
  }
  object SyncProvider {
    
    inline def apply(
      _reader: typingsJapgolly.nodelibFsWalk.outReadersSyncMod.default,
      _root: Any,
      _settings: Any,
      read: CallbackTo[js.Array[Entry]]
    ): SyncProvider = {
      val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], read = read.toJsFn)
      __obj.asInstanceOf[SyncProvider]
    }
    
    extension [Self <: SyncProvider](x: Self) {
      
      inline def setRead(value: CallbackTo[js.Array[Entry]]): Self = StObject.set(x, "read", value.toJsFn)
      
      inline def set_reader(value: typingsJapgolly.nodelibFsWalk.outReadersSyncMod.default): Self = StObject.set(x, "_reader", value.asInstanceOf[js.Any])
      
      inline def set_root(value: Any): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
