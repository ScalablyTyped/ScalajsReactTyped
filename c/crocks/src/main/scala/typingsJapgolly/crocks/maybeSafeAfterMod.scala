package typingsJapgolly.crocks

import typingsJapgolly.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeSafeAfterMod {
  
  @JSImport("crocks/Maybe/safeAfter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pred: UnaryFunction): js.Function1[
    /* fn */ UnaryFunction, 
    js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fn */ UnaryFunction, 
    js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default]
  ]]
  inline def default(pred: UnaryFunction, fn: UnaryFunction): js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default]]
  /**
    * safeAfter :: ((b -> Boolean) | Pred) -> (a -> b) -> a -> Maybe b
    */
  inline def default(pred: UnaryFunction, fn: UnaryFunction, `val`: Any): typingsJapgolly.crocks.maybeMaybeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.crocks.maybeMaybeMod.default]
  inline def default(pred: typingsJapgolly.crocks.predMod.default): js.Function1[
    /* fn */ UnaryFunction, 
    js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fn */ UnaryFunction, 
    js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default]
  ]]
  inline def default(pred: typingsJapgolly.crocks.predMod.default, fn: UnaryFunction): js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.default]]
  inline def default(pred: typingsJapgolly.crocks.predMod.default, fn: UnaryFunction, `val`: Any): typingsJapgolly.crocks.maybeMaybeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.crocks.maybeMaybeMod.default]
}
