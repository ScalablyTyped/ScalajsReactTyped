package typingsJapgolly.twilioChat.userdescriptorsMod

import typingsJapgolly.twilioChat.networkMod.Network
import typingsJapgolly.twilioChat.usersMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDescriptorsServices extends js.Object {
  var network: Network
  var users: Users
}

object UserDescriptorsServices {
  @scala.inline
  def apply(network: Network, users: Users): UserDescriptorsServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserDescriptorsServices]
  }
}

