package typingsJapgolly.twilioChat.userdescriptorMod

import typingsJapgolly.twilioChat.usersMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDescriptorServices extends js.Object {
  var users: Users
}

object UserDescriptorServices {
  @scala.inline
  def apply(users: Users): UserDescriptorServices = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserDescriptorServices]
  }
}

