package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CharsToIgnore extends js.Object {
  var charactersToSkip: js.UndefOr[String] = js.undefined
  var commonCharactersToIgnore: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1CharsToIgnore {
  @scala.inline
  def apply(charactersToSkip: String = null, commonCharactersToIgnore: String = null): GooglePrivacyDlpV2beta1CharsToIgnore = {
    val __obj = js.Dynamic.literal()
    if (charactersToSkip != null) __obj.updateDynamic("charactersToSkip")(charactersToSkip.asInstanceOf[js.Any])
    if (commonCharactersToIgnore != null) __obj.updateDynamic("commonCharactersToIgnore")(commonCharactersToIgnore.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CharsToIgnore]
  }
}

