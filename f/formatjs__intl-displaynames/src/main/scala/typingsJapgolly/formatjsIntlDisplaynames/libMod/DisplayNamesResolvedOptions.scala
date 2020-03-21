package typingsJapgolly.formatjsIntlDisplaynames.libMod

import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.code
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.currency
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.language
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.long
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.narrow
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.none
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.region
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.script
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.short
import typingsJapgolly.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayNamesResolvedOptions extends js.Object {
  var fallback: NonNullable[js.UndefOr[code | none]]
  var locale: String
  var style: NonNullable[js.UndefOr[narrow | short | long]]
  var `type`: NonNullable[js.UndefOr[language | region | script | currency]]
}

object DisplayNamesResolvedOptions {
  @scala.inline
  def apply(
    locale: String,
    fallback: NonNullable[js.UndefOr[code | none]] = null,
    style: NonNullable[js.UndefOr[narrow | short | long]] = null,
    `type`: NonNullable[js.UndefOr[language | region | script | currency]] = null
  ): DisplayNamesResolvedOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesResolvedOptions]
  }
}

