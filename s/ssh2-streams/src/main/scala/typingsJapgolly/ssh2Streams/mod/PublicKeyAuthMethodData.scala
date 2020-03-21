package typingsJapgolly.ssh2Streams.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyAuthMethodData extends _AuthMethodData {
  var blob: js.UndefOr[Buffer] = js.undefined
  var key: Buffer
  var keyAlgo: String
  var signature: js.UndefOr[Buffer] = js.undefined
}

object PublicKeyAuthMethodData {
  @scala.inline
  def apply(key: Buffer, keyAlgo: String, blob: Buffer = null, signature: Buffer = null): PublicKeyAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any])
    if (blob != null) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyAuthMethodData]
  }
}

