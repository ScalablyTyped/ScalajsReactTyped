package typingsJapgolly.useGlobalHook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InitializerFunction[S, A] = js.Function1[/* store */ typingsJapgolly.useGlobalHook.mod.Store[S, A], scala.Unit]
  type UseGlobal[S, A] = (js.Function0[js.Tuple2[S, A]]) with (js.Function1[/* stateFunc */ js.Function1[/* state */ S, _], js.Tuple2[_, A]]) with (js.Function2[
    /* stateFunc */ js.Function1[/* state */ S, _], 
    /* actionsFunc */ js.Function1[/* state */ A, _], 
    js.Tuple2[_, _]
  ]) with (js.Function2[
    /* stateFunc */ js.UndefOr[scala.Nothing], 
    /* actionsFunc */ js.Function1[/* state */ A, _], 
    js.Tuple2[S, _]
  ])
}
