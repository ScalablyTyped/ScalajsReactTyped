package typingsJapgolly.smartFoxServer.SFS2X

import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_BLOCK extends js.Object {
  var buddy: SFSBuddy
}

object IBUDDY_BLOCK {
  @scala.inline
  def apply(buddy: SFSBuddy): IBUDDY_BLOCK = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBUDDY_BLOCK]
  }
}

