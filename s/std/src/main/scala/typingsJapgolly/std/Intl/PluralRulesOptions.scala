package typingsJapgolly.std.Intl

import typingsJapgolly.std.stdStrings.`best fit`
import typingsJapgolly.std.stdStrings.cardinal
import typingsJapgolly.std.stdStrings.lookup
import typingsJapgolly.std.stdStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralRulesOptions extends js.Object {
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  var `type`: js.UndefOr[cardinal | ordinal] = js.undefined
}

object PluralRulesOptions {
  @scala.inline
  def apply(localeMatcher: lookup | (`best fit`) = null, `type`: cardinal | ordinal = null): PluralRulesOptions = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralRulesOptions]
  }
}

