package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1KAnonymityConfig extends js.Object {
  /**
    * Optional message indicating that each distinct `EntityId` should not
    * contribute to the k-anonymity count more than once per equivalence class.
    */
  var entityId: js.UndefOr[GooglePrivacyDlpV2beta1EntityId] = js.undefined
  /**
    * Set of fields to compute k-anonymity over. When multiple fields are
    * specified, they are considered a single composite key. Structs and
    * repeated data types are not supported; however, nested fields are
    * supported so long as they are not structs themselves or nested within
    * a repeated field.
    */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldId]] = js.undefined
}

object GooglePrivacyDlpV2beta1KAnonymityConfig {
  @scala.inline
  def apply(
    entityId: GooglePrivacyDlpV2beta1EntityId = null,
    quasiIds: js.Array[GooglePrivacyDlpV2beta1FieldId] = null
  ): GooglePrivacyDlpV2beta1KAnonymityConfig = {
    val __obj = js.Dynamic.literal()
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (quasiIds != null) __obj.updateDynamic("quasiIds")(quasiIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KAnonymityConfig]
  }
}

