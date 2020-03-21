package typingsJapgolly.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of how user IDs are encrypted.
  */
@js.native
trait SchemaEncryptionInfo extends js.Object {
  /**
    * The encryption entity ID. This should match the encryption configuration
    * for ad serving or Data Transfer.
    */
  var encryptionEntityId: js.UndefOr[String] = js.native
  /**
    * The encryption entity type. This should match the encryption
    * configuration for ad serving or Data Transfer.
    */
  var encryptionEntityType: js.UndefOr[String] = js.native
  /**
    * Describes whether the encrypted cookie was received from ad serving (the
    * %m macro) or from Data Transfer.
    */
  var encryptionSource: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#encryptionInfo&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEncryptionInfo {
  @scala.inline
  def apply(
    encryptionEntityId: String = null,
    encryptionEntityType: String = null,
    encryptionSource: String = null,
    kind: String = null
  ): SchemaEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    if (encryptionEntityId != null) __obj.updateDynamic("encryptionEntityId")(encryptionEntityId.asInstanceOf[js.Any])
    if (encryptionEntityType != null) __obj.updateDynamic("encryptionEntityType")(encryptionEntityType.asInstanceOf[js.Any])
    if (encryptionSource != null) __obj.updateDynamic("encryptionSource")(encryptionSource.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEncryptionInfo]
  }
}

