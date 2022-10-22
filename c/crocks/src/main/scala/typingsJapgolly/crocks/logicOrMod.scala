package typingsJapgolly.crocks

import typingsJapgolly.crocks.internalTypesMod.PredicateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logicOrMod {
  
  @JSImport("crocks/logic/or", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A](p: PredicateFunction[A]): js.Function1[
    /* q */ PredicateFunction[A] | typingsJapgolly.crocks.predMod.default, 
    js.Function1[/* x */ A, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* q */ PredicateFunction[A] | typingsJapgolly.crocks.predMod.default, 
    js.Function1[/* x */ A, Boolean]
  ]]
  /**
    * or :: ((a -> Boolean) | Pred) -> ((a -> Boolean) | Pred) -> a -> Boolean
    */
  inline def default[A](p: PredicateFunction[A], q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def default[A](p: PredicateFunction[A], q: typingsJapgolly.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def default[A](p: typingsJapgolly.crocks.predMod.default): js.Function1[
    /* q */ PredicateFunction[A] | typingsJapgolly.crocks.predMod.default, 
    js.Function1[/* x */ A, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* q */ PredicateFunction[A] | typingsJapgolly.crocks.predMod.default, 
    js.Function1[/* x */ A, Boolean]
  ]]
  inline def default[A](p: typingsJapgolly.crocks.predMod.default, q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def default[A](p: typingsJapgolly.crocks.predMod.default, q: typingsJapgolly.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
}
