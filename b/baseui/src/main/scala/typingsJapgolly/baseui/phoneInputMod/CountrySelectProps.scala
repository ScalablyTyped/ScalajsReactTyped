package typingsJapgolly.baseui.phoneInputMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonCountrySelect
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.selectMod.OnChangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountrySelectProps extends js.Object {
  var countries: StringDictionary[Country]
  var country: js.UndefOr[Country] = js.undefined
  var inputRef: js.UndefOr[Ref] = js.undefined
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.undefined
  var maxDropdownHeight: js.UndefOr[String] = js.undefined
  var maxDropdownWidth: js.UndefOr[String] = js.undefined
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.undefined
  var overrides: js.UndefOr[AnonCountrySelect] = js.undefined
  var size: js.UndefOr[default_ | compact | large_] = js.undefined
}

object CountrySelectProps {
  @scala.inline
  def apply(
    countries: StringDictionary[Country],
    country: Country = null,
    inputRef: Ref = null,
    mapIsoToLabel: /* iso */ String => CallbackTo[String] = null,
    maxDropdownHeight: String = null,
    maxDropdownWidth: String = null,
    onCountryChange: /* event */ OnChangeParams => CallbackTo[js.Any] = null,
    overrides: AnonCountrySelect = null,
    size: default_ | compact | large_ = null
  ): CountrySelectProps = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1((t0: /* iso */ java.lang.String) => mapIsoToLabel(t0).runNow()))
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (maxDropdownWidth != null) __obj.updateDynamic("maxDropdownWidth")(maxDropdownWidth.asInstanceOf[js.Any])
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.baseui.selectMod.OnChangeParams) => onCountryChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountrySelectProps]
  }
}

