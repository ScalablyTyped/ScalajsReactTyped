package typingsJapgolly.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds encrypted information that is only decrypted and stored in RAM by the
  * worker VM when running the pipeline.
  */
@js.native
trait SchemaSecret extends js.Object {
  /**
    * The value of the cipherText response from the `encrypt` method. This
    * field is intentionally unaudited.
    */
  var cipherText: js.UndefOr[String] = js.native
  /**
    * The name of the Cloud KMS key that will be used to decrypt the secret
    * value. The VM service account must have the required permissions and
    * authentication scopes to invoke the `decrypt` method on the specified
    * key.
    */
  var keyName: js.UndefOr[String] = js.native
}

object SchemaSecret {
  @scala.inline
  def apply(cipherText: String = null, keyName: String = null): SchemaSecret = {
    val __obj = js.Dynamic.literal()
    if (cipherText != null) __obj.updateDynamic("cipherText")(cipherText.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecret]
  }
}

