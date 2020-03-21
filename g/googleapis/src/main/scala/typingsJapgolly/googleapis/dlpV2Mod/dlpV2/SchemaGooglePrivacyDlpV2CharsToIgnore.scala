package typingsJapgolly.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Characters to skip when doing deidentification of a value. These will be
  * left alone and skipped.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CharsToIgnore extends js.Object {
  var charactersToSkip: js.UndefOr[String] = js.native
  var commonCharactersToIgnore: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CharsToIgnore {
  @scala.inline
  def apply(charactersToSkip: String = null, commonCharactersToIgnore: String = null): SchemaGooglePrivacyDlpV2CharsToIgnore = {
    val __obj = js.Dynamic.literal()
    if (charactersToSkip != null) __obj.updateDynamic("charactersToSkip")(charactersToSkip.asInstanceOf[js.Any])
    if (commonCharactersToIgnore != null) __obj.updateDynamic("commonCharactersToIgnore")(commonCharactersToIgnore.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CharsToIgnore]
  }
}

