package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.nodeStrings.pkcs1
import typingsJapgolly.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyInput extends js.Object {
  var format: js.UndefOr[KeyFormat] = js.undefined
  var key: String | Buffer
  var `type`: js.UndefOr[pkcs1 | spki] = js.undefined
}

object PublicKeyInput {
  @scala.inline
  def apply(key: String | Buffer, format: KeyFormat = null, `type`: pkcs1 | spki = null): PublicKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInput]
  }
}

