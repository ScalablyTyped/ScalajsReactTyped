package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateContactWithAddressBookRequest extends js.Object {
  /**
    * The ARN of the address book with which to associate the contact.
    */
  var AddressBookArn: Arn = js.native
  /**
    * The ARN of the contact to associate with an address book.
    */
  var ContactArn: Arn = js.native
}

object AssociateContactWithAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn, ContactArn: Arn): AssociateContactWithAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any], ContactArn = ContactArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateContactWithAddressBookRequest]
  }
}

