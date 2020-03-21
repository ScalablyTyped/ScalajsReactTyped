package typingsJapgolly.inboxsdk.mod.Conversations

import typingsJapgolly.inboxsdk.inboxsdkStrings.recipient
import typingsJapgolly.inboxsdk.inboxsdkStrings.sender
import typingsJapgolly.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactHoverEvent extends js.Object {
  var contact: Contact
  var contactType: sender | recipient
  var messageView: MessageView
  var threadView: ThreadView
}

object ContactHoverEvent {
  @scala.inline
  def apply(
    contact: Contact,
    contactType: sender | recipient,
    messageView: MessageView,
    threadView: ThreadView
  ): ContactHoverEvent = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], contactType = contactType.asInstanceOf[js.Any], messageView = messageView.asInstanceOf[js.Any], threadView = threadView.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContactHoverEvent]
  }
}

