package typingsJapgolly.hellosignEmbedded.mod.HelloSign

import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_canceled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanceledMessageEvent extends MessageEvent {
  var event: signature_request_canceled
}

object CanceledMessageEvent {
  @scala.inline
  def apply(event: signature_request_canceled): CanceledMessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CanceledMessageEvent]
  }
}

