package typingsJapgolly.intercomClient.tagMod

import typingsJapgolly.intercomClient.AnonId
import typingsJapgolly.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.intercomClient.tagMod.TagCompanies
  - typingsJapgolly.intercomClient.tagMod.TagUsers
*/
trait TagOper extends js.Object

object TagOper {
  @scala.inline
  def TagCompanies(name: String, users: js.Array[AnonId]): TagOper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagOper]
  }
  @scala.inline
  def TagUsers(name: String, users: js.Array[UserIdentifier]): TagOper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagOper]
  }
}

