package typingsJapgolly.nodelibFsWalk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outReadersReaderMod {
  
  @JSImport("@nodelib/fs.walk/out/readers/reader", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Reader {
    def this(_root: String, _settings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default) = this()
    
    /* protected */ /* CompleteClass */
    override val _root: String = js.native
    
    /* protected */ /* CompleteClass */
    override val _settings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default = js.native
  }
  
  trait Reader extends StObject {
    
    /* protected */ val _root: String
    
    /* protected */ val _settings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default
  }
  object Reader {
    
    inline def apply(_root: String, _settings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default): Reader = {
      val __obj = js.Dynamic.literal(_root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reader]
    }
    
    extension [Self <: Reader](x: Self) {
      
      inline def set_root(value: String): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: typingsJapgolly.nodelibFsWalk.outSettingsMod.default): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
