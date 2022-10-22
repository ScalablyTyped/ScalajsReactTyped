package typingsJapgolly.crocks

import typingsJapgolly.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeSafeMod {
  
  @JSImport("crocks/Maybe/safe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pred: UnaryFunction): js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default]]
  /**
    * safe :: ((b -> Boolean) | Pred) -> b -> Maybe a
    */
  inline def default(pred: UnaryFunction, `val`: Any): typingsJapgolly.crocks.maybeMaybeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.crocks.maybeMaybeMod.default]
  inline def default(pred: typingsJapgolly.crocks.predMod.default): js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default]]
  inline def default(pred: typingsJapgolly.crocks.predMod.default, `val`: Any): typingsJapgolly.crocks.maybeMaybeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.crocks.maybeMaybeMod.default]
}
