package typingsJapgolly.crocks.mod

import typingsJapgolly.crocks.internalTypesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arrow {
  
  @JSImport("crocks", "Arrow.default")
  @js.native
  open class default ()
    extends typingsJapgolly.crocks.arrowMod.default
  object default {
    
    inline def apply(fn: VariadicFunction): typingsJapgolly.crocks.arrowArrowMod.Arrow = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.arrowArrowMod.Arrow]
    
    @JSImport("crocks", "Arrow.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def id(): typingsJapgolly.crocks.arrowArrowMod.Arrow = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[typingsJapgolly.crocks.arrowArrowMod.Arrow]
  }
}
