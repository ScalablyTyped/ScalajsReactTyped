package typingsJapgolly.gapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationsListResponse extends js.Object {
  /** Translations contains list of translation results of given text */
  var translations: js.UndefOr[js.Array[TranslationsResource]] = js.undefined
}

object TranslationsListResponse {
  @scala.inline
  def apply(translations: js.Array[TranslationsResource] = null): TranslationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationsListResponse]
  }
}

