package typingsJapgolly.smartFoxServer.SFS2X

import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSRoom
import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPLAYER_TO_SPECTATOR extends js.Object {
  var room: SFSRoom
  var user: SFSUser
}

object IPLAYER_TO_SPECTATOR {
  @scala.inline
  def apply(room: SFSRoom, user: SFSUser): IPLAYER_TO_SPECTATOR = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPLAYER_TO_SPECTATOR]
  }
}

