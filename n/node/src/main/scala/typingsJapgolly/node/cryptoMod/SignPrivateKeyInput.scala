package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.nodeStrings.pkcs1
import typingsJapgolly.node.nodeStrings.pkcs8
import typingsJapgolly.node.nodeStrings.sec1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignPrivateKeyInput
  extends PrivateKeyInput
     with SigningOptions

object SignPrivateKeyInput {
  @scala.inline
  def apply(
    key: String | Buffer,
    format: KeyFormat = null,
    padding: Int | Double = null,
    passphrase: String | Buffer = null,
    saltLength: Int | Double = null,
    `type`: pkcs1 | pkcs8 | sec1 = null
  ): SignPrivateKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (saltLength != null) __obj.updateDynamic("saltLength")(saltLength.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignPrivateKeyInput]
  }
}

