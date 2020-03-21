package typingsJapgolly.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreateStoredInfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest extends js.Object {
  /**
    * Configuration of the storedInfoType to create.
    */
  var config: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig] = js.native
  /**
    * The storedInfoType ID can contain uppercase and lowercase letters,
    * numbers, and hyphens; that is, it must match the regular expression:
    * `[a-zA-Z\\d-_]+`. The maximum length is 100 characters. Can be empty to
    * allow the system to generate one.
    */
  var storedInfoTypeId: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest {
  @scala.inline
  def apply(config: SchemaGooglePrivacyDlpV2StoredInfoTypeConfig = null, storedInfoTypeId: String = null): SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (storedInfoTypeId != null) __obj.updateDynamic("storedInfoTypeId")(storedInfoTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest]
  }
}

