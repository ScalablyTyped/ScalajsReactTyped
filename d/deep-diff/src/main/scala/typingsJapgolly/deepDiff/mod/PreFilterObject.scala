package typingsJapgolly.deepDiff.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreFilterObject[LHS, RHS] extends js.Object {
  var normalize: js.UndefOr[
    js.Function4[
      /* currentPath */ js.Any, 
      /* key */ js.Any, 
      /* lhs */ LHS, 
      /* rhs */ RHS, 
      js.UndefOr[js.Tuple2[LHS, RHS]]
    ]
  ] = js.undefined
  var prefilter: js.UndefOr[js.Function2[/* path */ js.Array[_], /* key */ js.Any, Boolean]] = js.undefined
}

object PreFilterObject {
  @scala.inline
  def apply[LHS, RHS](
    normalize: (/* currentPath */ js.Any, /* key */ js.Any, /* lhs */ LHS, /* rhs */ RHS) => CallbackTo[js.UndefOr[js.Tuple2[LHS, RHS]]] = null,
    prefilter: (/* path */ js.Array[js.Any], /* key */ js.Any) => CallbackTo[Boolean] = null
  ): PreFilterObject[LHS, RHS] = {
    val __obj = js.Dynamic.literal()
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction4((t0: /* currentPath */ js.Any, t1: /* key */ js.Any, t2: /* lhs */ LHS, t3: /* rhs */ RHS) => normalize(t0, t1, t2, t3).runNow()))
    if (prefilter != null) __obj.updateDynamic("prefilter")(js.Any.fromFunction2((t0: /* path */ js.Array[js.Any], t1: /* key */ js.Any) => prefilter(t0, t1).runNow()))
    __obj.asInstanceOf[PreFilterObject[LHS, RHS]]
  }
}

