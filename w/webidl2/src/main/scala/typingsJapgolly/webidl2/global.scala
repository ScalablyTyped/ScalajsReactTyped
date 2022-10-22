package typingsJapgolly.webidl2

import typingsJapgolly.webidl2.anon.BareMessage
import typingsJapgolly.webidl2.mod.IDLRootType
import typingsJapgolly.webidl2.mod.ParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WebIDL2 {
    
    @JSGlobal("WebIDL2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("WebIDL2.WebIDLParseError")
    @js.native
    open class WebIDLParseError protected ()
      extends typingsJapgolly.webidl2.mod.WebIDLParseError {
      def this(options: BareMessage) = this()
    }
    
    inline def parse(str: String): js.Array[IDLRootType] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[IDLRootType]]
    inline def parse(str: String, options: ParseOptions): js.Array[IDLRootType] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[IDLRootType]]
  }
}
