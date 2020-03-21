package typingsJapgolly.openpgp

import typingsJapgolly.openpgp.mod.ReadableStream
import typingsJapgolly.openpgp.mod.message.Message
import typingsJapgolly.openpgp.mod.signature.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  data  :string | openpgp.openpgp.ReadableStream<std.String>,   message  :openpgp.openpgp.message.Message,   signature  :string | openpgp.openpgp.ReadableStream<std.String> | openpgp.openpgp.signature.Signature} */
trait EncryptResultdatastringRe extends js.Object {
  var data: String | ReadableStream[String]
  var message: Message
  var sessionKey: AnonAeadAlgorithm
  var signature: String | ReadableStream[String] | Signature
}

object EncryptResultdatastringRe {
  @scala.inline
  def apply(
    data: String | ReadableStream[String],
    message: Message,
    sessionKey: AnonAeadAlgorithm,
    signature: String | ReadableStream[String] | Signature
  ): EncryptResultdatastringRe = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptResultdatastringRe]
  }
}

