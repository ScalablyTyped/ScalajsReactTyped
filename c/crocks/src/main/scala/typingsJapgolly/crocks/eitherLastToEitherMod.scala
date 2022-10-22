package typingsJapgolly.crocks

import typingsJapgolly.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherLastToEitherMod {
  
  @JSImport("crocks/Either/lastToEither", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * lastToEither :: c -> Last a -> Either c a
    * lastToEither :: c -> (a -> Last b) -> a -> Either c a
    */
  inline def default(`val`: typingsJapgolly.crocks.lastMod.default): typingsJapgolly.crocks.eitherEitherMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.eitherEitherMod.default]
}
