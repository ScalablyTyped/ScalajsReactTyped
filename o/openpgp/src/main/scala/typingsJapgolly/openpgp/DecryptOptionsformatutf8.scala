package typingsJapgolly.openpgp

import typingsJapgolly.openpgp.mod.key.Key
import typingsJapgolly.openpgp.mod.message.Message
import typingsJapgolly.openpgp.mod.signature.Signature
import typingsJapgolly.openpgp.openpgpBooleans.`false`
import typingsJapgolly.openpgp.openpgpStrings.binary
import typingsJapgolly.openpgp.openpgpStrings.node
import typingsJapgolly.openpgp.openpgpStrings.utf8
import typingsJapgolly.openpgp.openpgpStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.DecryptOptions & {  format  :'utf8'} */
trait DecryptOptionsformatutf8 extends js.Object {
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[js.Date] = js.undefined
  /**
    * (optional) whether to return data as a string(Stream) or Uint8Array(Stream). If 'utf8' (the default), also normalize newlines.
    */
  var format: js.UndefOr[(utf8 | binary) with utf8] = js.undefined
  /**
    * the message object with the encrypted data
    */
  var message: Message
  /**
    * (optional) passwords to decrypt the message
    */
  var passwords: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * (optional) private keys with decrypted secret key data or session key
    */
  var privateKeys: js.UndefOr[Key | js.Array[Key]] = js.undefined
  /**
    * (optional) array of public keys or single key, to verify signatures
    */
  var publicKeys: js.UndefOr[Key | js.Array[Key]] = js.undefined
  /**
    * (optional) session keys in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKeys: js.UndefOr[AnonAlgorithm | js.Array[AnonAlgorithm]] = js.undefined
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[Signature] = js.undefined
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
}

object DecryptOptionsformatutf8 {
  @scala.inline
  def apply(
    message: Message,
    date: js.Date = null,
    format: (utf8 | binary) with utf8 = null,
    passwords: String | js.Array[String] = null,
    privateKeys: Key | js.Array[Key] = null,
    publicKeys: Key | js.Array[Key] = null,
    sessionKeys: AnonAlgorithm | js.Array[AnonAlgorithm] = null,
    signature: Signature = null,
    streaming: web | node | `false` = null
  ): DecryptOptionsformatutf8 = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (passwords != null) __obj.updateDynamic("passwords")(passwords.asInstanceOf[js.Any])
    if (privateKeys != null) __obj.updateDynamic("privateKeys")(privateKeys.asInstanceOf[js.Any])
    if (publicKeys != null) __obj.updateDynamic("publicKeys")(publicKeys.asInstanceOf[js.Any])
    if (sessionKeys != null) __obj.updateDynamic("sessionKeys")(sessionKeys.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOptionsformatutf8]
  }
}

