package typingsJapgolly.crocks

import typingsJapgolly.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncLastToAsyncMod {
  
  @JSImport("crocks/Async/lastToAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * lastToAsync :: e -> Last a -> Async e a
    * lastToAsync :: e -> (a -> Last b) -> a -> Async e b
    */
  inline def default(`val`: typingsJapgolly.crocks.lastMod.default): typingsJapgolly.crocks.asyncAsyncMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.asyncAsyncMod.default]
}
