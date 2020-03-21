package typingsJapgolly.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEncryptionConfigResult extends js.Object {
  /**
    * The new encryption configuration.
    */
  var EncryptionConfig: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.EncryptionConfig] = js.native
}

object PutEncryptionConfigResult {
  @scala.inline
  def apply(EncryptionConfig: EncryptionConfig = null): PutEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEncryptionConfigResult]
  }
}

