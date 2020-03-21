package typingsJapgolly.smartFoxServer.SFS2X

import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSRoom
import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUSER_EXIT_ROOM extends js.Object {
  var room: SFSRoom
  var user: SFSUser
}

object IUSER_EXIT_ROOM {
  @scala.inline
  def apply(room: SFSRoom, user: SFSUser): IUSER_EXIT_ROOM = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUSER_EXIT_ROOM]
  }
}

