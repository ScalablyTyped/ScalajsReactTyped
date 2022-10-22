package typingsJapgolly.crocks

import typingsJapgolly.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncEitherToAsyncMod {
  
  @JSImport("crocks/Async/eitherToAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * eitherToAsync :: Either b a -> Async b a
    * eitherToAsync :: (a -> Either c b) -> a -> Async c b
    */
  inline def default(`val`: typingsJapgolly.crocks.eitherMod.default): typingsJapgolly.crocks.asyncAsyncMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.asyncAsyncMod.default]
}
