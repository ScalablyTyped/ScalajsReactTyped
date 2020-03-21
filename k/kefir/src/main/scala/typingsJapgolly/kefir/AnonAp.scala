package typingsJapgolly.kefir

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kefir.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAp extends js.Object {
  def ap[A, B, E1, E2](obsF: Observable[js.Function1[/* x */ A, B], E1], obsV: Observable[A, E2]): Observable[B, E1 | E2]
  def bimap[V1, E1, V2, E2](fnE: js.Function1[/* x */ E1, E2], fnV: js.Function1[/* x */ V1, V2], obs: Observable[V1, E1]): Observable[V2, E2]
  def chain[V, V2, E, E2](cb: js.Function1[/* value */ V, Observable[V2, E2]], s: Observable[V, E]): Observable[V2, E | E2]
  def concat[V1, E1, V2, E2](obs1: Observable[V1, E1], obs2: Observable[V2, E2]): Observable[V1 | V2, E1 | E2]
  def empty(): Observable[scala.Nothing, scala.Nothing]
  def map[V, V2, E](cb: js.Function1[/* value */ V, V2], s: Observable[V, E]): Observable[V2, E]
  def of[V](value: V): Observable[V, scala.Nothing]
}

object AnonAp {
  @scala.inline
  def apply(
    ap: (Observable[js.Function1[js.Any, js.Any], js.Any], Observable[js.Any, js.Any]) => CallbackTo[Observable[js.Any, js.Any | js.Any]],
    bimap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any], Observable[js.Any, js.Any]) => CallbackTo[Observable[js.Any, js.Any]],
    chain: (js.Function1[js.Any, Observable[js.Any, js.Any]], Observable[js.Any, js.Any]) => CallbackTo[Observable[js.Any, js.Any | js.Any]],
    concat: (Observable[js.Any, js.Any], Observable[js.Any, js.Any]) => CallbackTo[Observable[js.Any | js.Any, js.Any | js.Any]],
    empty: CallbackTo[Observable[scala.Nothing, scala.Nothing]],
    map: (js.Function1[js.Any, js.Any], Observable[js.Any, js.Any]) => CallbackTo[Observable[js.Any, js.Any]],
    of: js.Any => CallbackTo[Observable[js.Any, scala.Nothing]]
  ): AnonAp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ap")(js.Any.fromFunction2((t0: typingsJapgolly.kefir.mod.Observable[js.Function1[js.Any, js.Any], js.Any], t1: typingsJapgolly.kefir.mod.Observable[js.Any, js.Any]) => ap(t0, t1).runNow()))
    __obj.updateDynamic("bimap")(js.Any.fromFunction3((t0: js.Function1[js.Any, js.Any], t1: js.Function1[js.Any, js.Any], t2: typingsJapgolly.kefir.mod.Observable[js.Any, js.Any]) => bimap(t0, t1, t2).runNow()))
    __obj.updateDynamic("chain")(js.Any.fromFunction2((t0: js.Function1[js.Any, typingsJapgolly.kefir.mod.Observable[js.Any, js.Any]], t1: typingsJapgolly.kefir.mod.Observable[js.Any, js.Any]) => chain(t0, t1).runNow()))
    __obj.updateDynamic("concat")(js.Any.fromFunction2((t0: typingsJapgolly.kefir.mod.Observable[js.Any, js.Any], t1: typingsJapgolly.kefir.mod.Observable[js.Any, js.Any]) => concat(t0, t1).runNow()))
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.updateDynamic("map")(js.Any.fromFunction2((t0: js.Function1[js.Any, js.Any], t1: typingsJapgolly.kefir.mod.Observable[js.Any, js.Any]) => map(t0, t1).runNow()))
    __obj.updateDynamic("of")(js.Any.fromFunction1((t0: js.Any) => of(t0).runNow()))
    __obj.asInstanceOf[AnonAp]
  }
}

