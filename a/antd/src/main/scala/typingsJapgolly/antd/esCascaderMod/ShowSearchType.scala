package typingsJapgolly.antd.esCascaderMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antd.antdNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowSearchType extends js.Object {
  var filter: js.UndefOr[
    js.Function3[
      /* inputValue */ String, 
      /* path */ js.Array[CascaderOptionType], 
      /* names */ FilledFieldNamesType, 
      Boolean
    ]
  ] = js.undefined
  var limit: js.UndefOr[Double | `false`] = js.undefined
  var matchInputWidth: js.UndefOr[Boolean] = js.undefined
  var render: js.UndefOr[
    js.Function4[
      /* inputValue */ String, 
      /* path */ js.Array[CascaderOptionType], 
      /* prefixCls */ js.UndefOr[String], 
      /* names */ FilledFieldNamesType, 
      Node
    ]
  ] = js.undefined
  var sort: js.UndefOr[
    js.Function4[
      /* a */ js.Array[CascaderOptionType], 
      /* b */ js.Array[CascaderOptionType], 
      /* inputValue */ String, 
      /* names */ FilledFieldNamesType, 
      Double
    ]
  ] = js.undefined
}

object ShowSearchType {
  @scala.inline
  def apply(
    filter: (/* inputValue */ String, /* path */ js.Array[CascaderOptionType], /* names */ FilledFieldNamesType) => CallbackTo[Boolean] = null,
    limit: Double | `false` = null,
    matchInputWidth: js.UndefOr[Boolean] = js.undefined,
    render: (/* inputValue */ String, /* path */ js.Array[CascaderOptionType], /* prefixCls */ js.UndefOr[String], /* names */ FilledFieldNamesType) => CallbackTo[Node] = null,
    sort: (/* a */ js.Array[CascaderOptionType], /* b */ js.Array[CascaderOptionType], /* inputValue */ String, /* names */ FilledFieldNamesType) => CallbackTo[Double] = null
  ): ShowSearchType = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3((t0: /* inputValue */ java.lang.String, t1: /* path */ js.Array[typingsJapgolly.antd.esCascaderMod.CascaderOptionType], t2: /* names */ typingsJapgolly.antd.esCascaderMod.FilledFieldNamesType) => filter(t0, t1, t2).runNow()))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(matchInputWidth)) __obj.updateDynamic("matchInputWidth")(matchInputWidth.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction4((t0: /* inputValue */ java.lang.String, t1: /* path */ js.Array[typingsJapgolly.antd.esCascaderMod.CascaderOptionType], t2: /* prefixCls */ js.UndefOr[java.lang.String], t3: /* names */ typingsJapgolly.antd.esCascaderMod.FilledFieldNamesType) => render(t0, t1, t2, t3).runNow()))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction4((t0: /* a */ js.Array[typingsJapgolly.antd.esCascaderMod.CascaderOptionType], t1: /* b */ js.Array[typingsJapgolly.antd.esCascaderMod.CascaderOptionType], t2: /* inputValue */ java.lang.String, t3: /* names */ typingsJapgolly.antd.esCascaderMod.FilledFieldNamesType) => sort(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ShowSearchType]
  }
}

