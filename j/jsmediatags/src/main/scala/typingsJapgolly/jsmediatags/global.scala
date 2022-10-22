package typingsJapgolly.jsmediatags

import typingsJapgolly.jsmediatags.typesMod.CallbackType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsmediatags {
    
    @JSGlobal("jsmediatags")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jsmediatags.Config")
    @js.native
    val Config: typingsJapgolly.jsmediatags.mod.Config = js.native
    
    @JSGlobal("jsmediatags.Reader")
    @js.native
    open class Reader protected ()
      extends typingsJapgolly.jsmediatags.mod.Reader {
      def this(file: Any) = this()
    }
    
    inline def read(location: Any, callbacks: CallbackType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(location.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
