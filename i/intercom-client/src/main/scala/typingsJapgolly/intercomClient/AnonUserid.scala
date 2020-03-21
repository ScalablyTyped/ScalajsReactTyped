package typingsJapgolly.intercomClient

import typingsJapgolly.intercomClient.leadMod.LeadIdentifier
import typingsJapgolly.intercomClient.userMod.UserIdentifier
import typingsJapgolly.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUserid
  extends LeadIdentifier
     with UserIdentifier
     with VisitorIdentifier {
  var user_id: String
}

object AnonUserid {
  @scala.inline
  def apply(user_id: String): AnonUserid = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUserid]
  }
}

