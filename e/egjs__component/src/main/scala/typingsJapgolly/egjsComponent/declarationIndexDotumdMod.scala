package typingsJapgolly.egjsComponent

import typingsJapgolly.egjsComponent.declarationTypesMod.EventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationIndexDotumdMod {
  
  @JSImport("@egjs/component/declaration/index.umd", JSImport.Default)
  @js.native
  open class default[T /* <: EventMap */] ()
    extends typingsJapgolly.egjsComponent.declarationComponentMod.default[T]
  object default {
    
    @JSImport("@egjs/component/declaration/index.umd", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@egjs/component/declaration/index.umd", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
}
