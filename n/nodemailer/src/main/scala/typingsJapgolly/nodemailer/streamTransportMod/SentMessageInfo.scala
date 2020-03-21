package typingsJapgolly.nodemailer.streamTransportMod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.nodemailer.mimeNodeMod.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  /** an envelope object {from:‘address’, to:[‘address’]} */
  var envelope: Envelope
  /** either stream (default) of buffer depending on the options */
  var message: Buffer | Readable
  /** the Message-ID header value */
  var messageId: String
}

object SentMessageInfo {
  @scala.inline
  def apply(envelope: Envelope, message: Buffer | Readable, messageId: String): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SentMessageInfo]
  }
}

