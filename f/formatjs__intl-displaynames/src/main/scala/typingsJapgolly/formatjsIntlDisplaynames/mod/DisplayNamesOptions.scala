package typingsJapgolly.formatjsIntlDisplaynames.mod

import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.`best fit`
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.code
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.currency
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.language
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.long
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.lookup
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.narrow
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.none
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.region
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.script
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayNamesOptions extends js.Object {
  var fallback: js.UndefOr[code | none] = js.undefined
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  var style: js.UndefOr[narrow | short | long] = js.undefined
  var `type`: js.UndefOr[language | region | script | currency] = js.undefined
}

object DisplayNamesOptions {
  @scala.inline
  def apply(
    fallback: code | none = null,
    localeMatcher: lookup | (`best fit`) = null,
    style: narrow | short | long = null,
    `type`: language | region | script | currency = null
  ): DisplayNamesOptions = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesOptions]
  }
}

