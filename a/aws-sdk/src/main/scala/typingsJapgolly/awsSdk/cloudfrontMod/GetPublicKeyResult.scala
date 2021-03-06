package typingsJapgolly.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicKeyResult extends js.Object {
  /**
    * The current version of the public key. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the public key.
    */
  var PublicKey: js.UndefOr[typingsJapgolly.awsSdk.cloudfrontMod.PublicKey] = js.native
}

object GetPublicKeyResult {
  @scala.inline
  def apply(ETag: String = null, PublicKey: PublicKey = null): GetPublicKeyResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicKeyResult]
  }
}

