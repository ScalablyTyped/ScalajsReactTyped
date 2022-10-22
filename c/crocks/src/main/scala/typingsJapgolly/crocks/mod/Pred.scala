package typingsJapgolly.crocks.mod

import typingsJapgolly.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pred {
  
  @JSImport("crocks", "Pred.default")
  @js.native
  open class default ()
    extends typingsJapgolly.crocks.predMod.default
  object default {
    
    inline def apply(fn: UnaryFunction): typingsJapgolly.crocks.predPredMod.Pred = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.predPredMod.Pred]
    
    @JSImport("crocks", "Pred.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): typingsJapgolly.crocks.predPredMod.Pred = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typingsJapgolly.crocks.predPredMod.Pred]
  }
}
