package typingsJapgolly.vuexI18n.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18nState extends js.Object {
  var fallback: String | Null
  var locale: String | Null
  var translations: StringDictionary[Translations]
}

object i18nState {
  @scala.inline
  def apply(translations: StringDictionary[Translations], fallback: String = null, locale: String = null): i18nState = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18nState]
  }
}

