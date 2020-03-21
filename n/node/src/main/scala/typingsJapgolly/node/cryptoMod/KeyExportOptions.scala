package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.nodeStrings.pkcs1
import typingsJapgolly.node.nodeStrings.pkcs8
import typingsJapgolly.node.nodeStrings.sec1
import typingsJapgolly.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyExportOptions[T /* <: KeyFormat */] extends js.Object {
  var cipher: js.UndefOr[String] = js.undefined
  var format: T
  var passphrase: js.UndefOr[String | Buffer] = js.undefined
  var `type`: pkcs1 | spki | pkcs8 | sec1
}

object KeyExportOptions {
  @scala.inline
  def apply[T /* <: KeyFormat */](
    format: T,
    `type`: pkcs1 | spki | pkcs8 | sec1,
    cipher: String = null,
    passphrase: String | Buffer = null
  ): KeyExportOptions[T] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyExportOptions[T]]
  }
}

