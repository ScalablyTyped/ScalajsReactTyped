package typingsJapgolly.twilioChat.membersMod

import typingsJapgolly.twilioChat.sessionMod.Session
import typingsJapgolly.twilioChat.usersMod.Users
import typingsJapgolly.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersServices extends js.Object {
  var session: Session
  var syncClient: SyncClient
  var users: Users
}

object MembersServices {
  @scala.inline
  def apply(session: Session, syncClient: SyncClient, users: Users): MembersServices = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MembersServices]
  }
}

