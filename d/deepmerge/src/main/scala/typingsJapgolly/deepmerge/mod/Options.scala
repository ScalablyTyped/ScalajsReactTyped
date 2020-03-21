package typingsJapgolly.deepmerge.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arrayMerge: js.UndefOr[
    js.Function3[
      /* target */ js.Array[_], 
      /* source */ js.Array[_], 
      /* options */ js.UndefOr[this.type], 
      js.Array[_]
    ]
  ] = js.undefined
  @JSName("clone")
  var clone_FOptions: js.UndefOr[Boolean] = js.undefined
  var customMerge: js.UndefOr[
    js.Function2[
      /* key */ String, 
      /* options */ js.UndefOr[Options], 
      js.UndefOr[js.Function2[/* x */ _, /* y */ _, _]]
    ]
  ] = js.undefined
  var isMergeableObject: js.UndefOr[js.Function1[/* value */ js.Object, Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrayMerge: (/* target */ js.Array[js.Any], /* source */ js.Array[js.Any], /* options */ js.UndefOr[Options]) => CallbackTo[js.Array[js.Any]] = null,
    clone: js.UndefOr[Boolean] = js.undefined,
    customMerge: (/* key */ String, /* options */ js.UndefOr[Options]) => CallbackTo[js.UndefOr[js.Function2[js.Any, js.Any, js.Any]]] = null,
    isMergeableObject: /* value */ js.Object => CallbackTo[Boolean] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrayMerge != null) __obj.updateDynamic("arrayMerge")(js.Any.fromFunction3((t0: /* target */ js.Array[js.Any], t1: /* source */ js.Array[js.Any], t2: /* options */ js.UndefOr[typingsJapgolly.deepmerge.mod.Options]) => arrayMerge(t0, t1, t2).runNow()))
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
    if (customMerge != null) __obj.updateDynamic("customMerge")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* options */ js.UndefOr[typingsJapgolly.deepmerge.mod.Options]) => customMerge(t0, t1).runNow()))
    if (isMergeableObject != null) __obj.updateDynamic("isMergeableObject")(js.Any.fromFunction1((t0: /* value */ js.Object) => isMergeableObject(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

