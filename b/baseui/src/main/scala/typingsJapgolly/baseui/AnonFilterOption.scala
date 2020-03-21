package typingsJapgolly.baseui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baseui.baseuiStrings.any
import typingsJapgolly.baseui.baseuiStrings.label
import typingsJapgolly.baseui.baseuiStrings.start
import typingsJapgolly.baseui.baseuiStrings.value
import typingsJapgolly.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterOption extends js.Object {
  var filterOption: js.UndefOr[js.Function2[/* option */ Option, /* filterValue */ String, Boolean]] = js.undefined
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  var labelKey: js.UndefOr[String] = js.undefined
  var matchPos: js.UndefOr[any | start] = js.undefined
  var matchProp: js.UndefOr[any | label | value] = js.undefined
  var trimFilter: js.UndefOr[Boolean] = js.undefined
  var valueKey: js.UndefOr[String] = js.undefined
}

object AnonFilterOption {
  @scala.inline
  def apply(
    filterOption: (/* option */ Option, /* filterValue */ String) => CallbackTo[Boolean] = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    labelKey: String = null,
    matchPos: any | start = null,
    matchProp: any | label | value = null,
    trimFilter: js.UndefOr[Boolean] = js.undefined,
    valueKey: String = null
  ): AnonFilterOption = {
    val __obj = js.Dynamic.literal()
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2((t0: /* option */ typingsJapgolly.baseui.selectMod.Option, t1: /* filterValue */ java.lang.String) => filterOption(t0, t1).runNow()))
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (matchPos != null) __obj.updateDynamic("matchPos")(matchPos.asInstanceOf[js.Any])
    if (matchProp != null) __obj.updateDynamic("matchProp")(matchProp.asInstanceOf[js.Any])
    if (!js.isUndefined(trimFilter)) __obj.updateDynamic("trimFilter")(trimFilter.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterOption]
  }
}

