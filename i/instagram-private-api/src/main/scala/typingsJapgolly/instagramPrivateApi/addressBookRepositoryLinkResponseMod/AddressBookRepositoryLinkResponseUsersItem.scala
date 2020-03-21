package typingsJapgolly.instagramPrivateApi.addressBookRepositoryLinkResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressBookRepositoryLinkResponseUsersItem extends js.Object {
  var addressbook_name: String
  var full_name: String
  var has_anonymous_profile_picture: Boolean
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var username: String
}

object AddressBookRepositoryLinkResponseUsersItem {
  @scala.inline
  def apply(
    addressbook_name: String,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): AddressBookRepositoryLinkResponseUsersItem = {
    val __obj = js.Dynamic.literal(addressbook_name = addressbook_name.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddressBookRepositoryLinkResponseUsersItem]
  }
}

