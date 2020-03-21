package typingsJapgolly.openpgp.mod

import typingsJapgolly.openpgp.mod.cleartext.CleartextMessage
import typingsJapgolly.openpgp.mod.key.Key
import typingsJapgolly.openpgp.mod.message.Message
import typingsJapgolly.openpgp.mod.signature.Signature
import typingsJapgolly.openpgp.openpgpBooleans.`false`
import typingsJapgolly.openpgp.openpgpStrings.node
import typingsJapgolly.openpgp.openpgpStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[js.Date] = js.undefined
  /**
    * (cleartext) message object with signatures
    */
  var message: CleartextMessage | Message
  /**
    * array of publicKeys or single key, to verify signatures
    */
  var publicKeys: Key | js.Array[_]
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[Signature] = js.undefined
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply(
    message: CleartextMessage | Message,
    publicKeys: Key | js.Array[_],
    date: js.Date = null,
    signature: Signature = null,
    streaming: web | node | `false` = null
  ): VerifyOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], publicKeys = publicKeys.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
}

