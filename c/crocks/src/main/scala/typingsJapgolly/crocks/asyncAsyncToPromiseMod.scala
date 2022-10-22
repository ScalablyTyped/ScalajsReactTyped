package typingsJapgolly.crocks

import typingsJapgolly.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncAsyncToPromiseMod {
  
  @JSImport("crocks/Async/asyncToPromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * asyncToPromise :: Async e a -> Promise a e
    * asyncToPromise :: (a -> Async e b) -> a -> Promise b e
    */
  inline def default(`val`: typingsJapgolly.crocks.asyncAsyncMod.default): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
