package typingsJapgolly.kefir.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ap extends StObject {
  
  def ap[A, B, E1, E2](
    obsF: typingsJapgolly.kefir.mod.Observable[js.Function1[/* x */ A, B], E1],
    obsV: typingsJapgolly.kefir.mod.Observable[A, E2]
  ): typingsJapgolly.kefir.mod.Observable[B, E1 | E2]
  
  def bimap[V1, E1, V2, E2](
    fnE: js.Function1[/* x */ E1, E2],
    fnV: js.Function1[/* x */ V1, V2],
    obs: typingsJapgolly.kefir.mod.Observable[V1, E1]
  ): typingsJapgolly.kefir.mod.Observable[V2, E2]
  
  def chain[V, V2, E, E2](
    cb: js.Function1[/* value */ V, typingsJapgolly.kefir.mod.Observable[V2, E2]],
    s: typingsJapgolly.kefir.mod.Observable[V, E]
  ): typingsJapgolly.kefir.mod.Observable[V2, E | E2]
  
  def concat[V1, E1, V2, E2](
    obs1: typingsJapgolly.kefir.mod.Observable[V1, E1],
    obs2: typingsJapgolly.kefir.mod.Observable[V2, E2]
  ): typingsJapgolly.kefir.mod.Observable[V1 | V2, E1 | E2]
  
  def empty(): typingsJapgolly.kefir.mod.Observable[scala.Nothing, scala.Nothing]
  
  def map[V, V2, E](cb: js.Function1[/* value */ V, V2], s: typingsJapgolly.kefir.mod.Observable[V, E]): typingsJapgolly.kefir.mod.Observable[V2, E]
  
  def of[V](value: V): typingsJapgolly.kefir.mod.Observable[V, scala.Nothing]
}
object Ap {
  
  inline def apply(
    ap: (typingsJapgolly.kefir.mod.Observable[js.Function1[Any, Any], Any], typingsJapgolly.kefir.mod.Observable[Any, Any]) => typingsJapgolly.kefir.mod.Observable[Any, Any | Any],
    bimap: (js.Function1[Any, Any], js.Function1[Any, Any], typingsJapgolly.kefir.mod.Observable[Any, Any]) => typingsJapgolly.kefir.mod.Observable[Any, Any],
    chain: (js.Function1[Any, typingsJapgolly.kefir.mod.Observable[Any, Any]], typingsJapgolly.kefir.mod.Observable[Any, Any]) => typingsJapgolly.kefir.mod.Observable[Any, Any | Any],
    concat: (typingsJapgolly.kefir.mod.Observable[Any, Any], typingsJapgolly.kefir.mod.Observable[Any, Any]) => typingsJapgolly.kefir.mod.Observable[Any | Any, Any | Any],
    empty: CallbackTo[typingsJapgolly.kefir.mod.Observable[scala.Nothing, scala.Nothing]],
    map: (js.Function1[Any, Any], typingsJapgolly.kefir.mod.Observable[Any, Any]) => typingsJapgolly.kefir.mod.Observable[Any, Any],
    of: Any => typingsJapgolly.kefir.mod.Observable[Any, scala.Nothing]
  ): Ap = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), bimap = js.Any.fromFunction3(bimap), chain = js.Any.fromFunction2(chain), concat = js.Any.fromFunction2(concat), empty = empty.toJsFn, map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Ap]
  }
  
  extension [Self <: Ap](x: Self) {
    
    inline def setAp(
      value: (typingsJapgolly.kefir.mod.Observable[js.Function1[Any, Any], Any], typingsJapgolly.kefir.mod.Observable[Any, Any]) => typingsJapgolly.kefir.mod.Observable[Any, Any | Any]
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setBimap(
      value: (js.Function1[Any, Any], js.Function1[Any, Any], typingsJapgolly.kefir.mod.Observable[Any, Any]) => typingsJapgolly.kefir.mod.Observable[Any, Any]
    ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
    
    inline def setChain(
      value: (js.Function1[Any, typingsJapgolly.kefir.mod.Observable[Any, Any]], typingsJapgolly.kefir.mod.Observable[Any, Any]) => typingsJapgolly.kefir.mod.Observable[Any, Any | Any]
    ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    
    inline def setConcat(
      value: (typingsJapgolly.kefir.mod.Observable[Any, Any], typingsJapgolly.kefir.mod.Observable[Any, Any]) => typingsJapgolly.kefir.mod.Observable[Any | Any, Any | Any]
    ): Self = StObject.set(x, "concat", js.Any.fromFunction2(value))
    
    inline def setEmpty(value: CallbackTo[typingsJapgolly.kefir.mod.Observable[scala.Nothing, scala.Nothing]]): Self = StObject.set(x, "empty", value.toJsFn)
    
    inline def setMap(
      value: (js.Function1[Any, Any], typingsJapgolly.kefir.mod.Observable[Any, Any]) => typingsJapgolly.kefir.mod.Observable[Any, Any]
    ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setOf(value: Any => typingsJapgolly.kefir.mod.Observable[Any, scala.Nothing]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
  }
}
