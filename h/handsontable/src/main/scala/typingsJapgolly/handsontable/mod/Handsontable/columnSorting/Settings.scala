package typingsJapgolly.handsontable.mod.Handsontable.columnSorting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.handsontableNumbers.`-1`
import typingsJapgolly.handsontable.handsontableNumbers.`0`
import typingsJapgolly.handsontable.handsontableNumbers.`1`
import typingsJapgolly.handsontable.mod.Handsontable.GridSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var compareFunctionFactory: js.UndefOr[
    js.Function2[
      /* sortOrder */ SortOrderType, 
      /* columnMeta */ GridSettings, 
      js.Function2[/* value */ _, /* nextValue */ _, `-1` | `0` | `1`]
    ]
  ] = js.undefined
  var headerAction: js.UndefOr[Boolean] = js.undefined
  var indicator: js.UndefOr[Boolean] = js.undefined
  var initialConfig: js.UndefOr[Config] = js.undefined
  var sortEmptyCells: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    compareFunctionFactory: (/* sortOrder */ SortOrderType, /* columnMeta */ GridSettings) => CallbackTo[js.Function2[js.Any, js.Any, `-1` | `0` | `1`]] = null,
    headerAction: js.UndefOr[Boolean] = js.undefined,
    indicator: js.UndefOr[Boolean] = js.undefined,
    initialConfig: Config = null,
    sortEmptyCells: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (compareFunctionFactory != null) __obj.updateDynamic("compareFunctionFactory")(js.Any.fromFunction2((t0: /* sortOrder */ typingsJapgolly.handsontable.mod.Handsontable.columnSorting.SortOrderType, t1: /* columnMeta */ typingsJapgolly.handsontable.mod.Handsontable.GridSettings) => compareFunctionFactory(t0, t1).runNow()))
    if (!js.isUndefined(headerAction)) __obj.updateDynamic("headerAction")(headerAction.asInstanceOf[js.Any])
    if (!js.isUndefined(indicator)) __obj.updateDynamic("indicator")(indicator.asInstanceOf[js.Any])
    if (initialConfig != null) __obj.updateDynamic("initialConfig")(initialConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(sortEmptyCells)) __obj.updateDynamic("sortEmptyCells")(sortEmptyCells.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

