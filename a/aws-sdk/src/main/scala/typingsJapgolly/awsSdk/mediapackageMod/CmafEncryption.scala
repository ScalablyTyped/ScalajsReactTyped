package typingsJapgolly.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmafEncryption extends js.Object {
  /**
    * Time (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[integer] = js.native
  var SpekeKeyProvider: typingsJapgolly.awsSdk.mediapackageMod.SpekeKeyProvider = js.native
}

object CmafEncryption {
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider, KeyRotationIntervalSeconds: Int | Double = null): CmafEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    if (KeyRotationIntervalSeconds != null) __obj.updateDynamic("KeyRotationIntervalSeconds")(KeyRotationIntervalSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafEncryption]
  }
}

