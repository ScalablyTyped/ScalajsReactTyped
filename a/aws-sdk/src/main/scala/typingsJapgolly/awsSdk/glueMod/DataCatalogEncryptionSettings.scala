package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCatalogEncryptionSettings extends js.Object {
  /**
    * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption.
    */
  var ConnectionPasswordEncryption: js.UndefOr[typingsJapgolly.awsSdk.glueMod.ConnectionPasswordEncryption] = js.native
  /**
    * Specifies the encryption-at-rest configuration for the Data Catalog.
    */
  var EncryptionAtRest: js.UndefOr[typingsJapgolly.awsSdk.glueMod.EncryptionAtRest] = js.native
}

object DataCatalogEncryptionSettings {
  @scala.inline
  def apply(
    ConnectionPasswordEncryption: ConnectionPasswordEncryption = null,
    EncryptionAtRest: EncryptionAtRest = null
  ): DataCatalogEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    if (ConnectionPasswordEncryption != null) __obj.updateDynamic("ConnectionPasswordEncryption")(ConnectionPasswordEncryption.asInstanceOf[js.Any])
    if (EncryptionAtRest != null) __obj.updateDynamic("EncryptionAtRest")(EncryptionAtRest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogEncryptionSettings]
  }
}

