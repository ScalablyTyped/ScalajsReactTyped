package typingsJapgolly.crocks

import typingsJapgolly.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeLastToMaybeMod {
  
  @JSImport("crocks/Maybe/lastToMaybe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * lastToMaybe :: Last a -> Maybe a
    * lastToMaybe :: (a -> Last b) -> a -> Maybe b
    */
  inline def default(`val`: typingsJapgolly.crocks.lastMod.default): typingsJapgolly.crocks.maybeMaybeMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.maybeMaybeMod.default]
}
