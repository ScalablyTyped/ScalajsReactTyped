package typingsJapgolly.backbonePaginator.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.backbone.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableSetSortingOptions[TModel /* <: Model */] extends js.Object {
  var full: js.UndefOr[Boolean] = js.undefined
  var side: js.UndefOr[String] = js.undefined
  var sortValue: js.UndefOr[js.Function2[/* model */ TModel, /* sortKey */ String, _ | String]] = js.undefined
}

object PageableSetSortingOptions {
  @scala.inline
  def apply[TModel /* <: Model */](
    full: js.UndefOr[Boolean] = js.undefined,
    side: String = null,
    sortValue: (/* model */ TModel, /* sortKey */ String) => CallbackTo[js.Any | String] = null
  ): PageableSetSortingOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (sortValue != null) __obj.updateDynamic("sortValue")(js.Any.fromFunction2((t0: /* model */ TModel, t1: /* sortKey */ java.lang.String) => sortValue(t0, t1).runNow()))
    __obj.asInstanceOf[PageableSetSortingOptions[TModel]]
  }
}

