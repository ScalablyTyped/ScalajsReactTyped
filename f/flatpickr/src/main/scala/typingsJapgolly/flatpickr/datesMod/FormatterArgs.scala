package typingsJapgolly.flatpickr.datesMod

import typingsJapgolly.flatpickr.localeMod.Locale
import typingsJapgolly.flatpickr.optionsMod.ParsedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterArgs extends js.Object {
  var config: js.UndefOr[ParsedOptions] = js.undefined
  var l10n: js.UndefOr[Locale] = js.undefined
}

object FormatterArgs {
  @scala.inline
  def apply(config: ParsedOptions = null, l10n: Locale = null): FormatterArgs = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (l10n != null) __obj.updateDynamic("l10n")(l10n.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatterArgs]
  }
}

