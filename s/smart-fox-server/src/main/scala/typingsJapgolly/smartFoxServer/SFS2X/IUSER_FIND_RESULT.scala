package typingsJapgolly.smartFoxServer.SFS2X

import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUSER_FIND_RESULT extends js.Object {
  var users: js.Array[SFSUser]
}

object IUSER_FIND_RESULT {
  @scala.inline
  def apply(users: js.Array[SFSUser]): IUSER_FIND_RESULT = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUSER_FIND_RESULT]
  }
}

