package typingsJapgolly.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSignBlobResponse extends js.Object {
  /**
    * The ID of the key used to sign the blob.
    */
  var keyId: js.UndefOr[String] = js.native
  /**
    * The signed blob.
    */
  var signedBlob: js.UndefOr[String] = js.native
}

object SchemaSignBlobResponse {
  @scala.inline
  def apply(keyId: String = null, signedBlob: String = null): SchemaSignBlobResponse = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (signedBlob != null) __obj.updateDynamic("signedBlob")(signedBlob.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSignBlobResponse]
  }
}

