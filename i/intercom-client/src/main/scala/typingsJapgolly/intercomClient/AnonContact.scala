package typingsJapgolly.intercomClient

import typingsJapgolly.intercomClient.leadMod.LeadIdentifier
import typingsJapgolly.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContact extends js.Object {
  var contact: LeadIdentifier
  var user: UserIdentifier
}

object AnonContact {
  @scala.inline
  def apply(contact: LeadIdentifier, user: UserIdentifier): AnonContact = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContact]
  }
}

