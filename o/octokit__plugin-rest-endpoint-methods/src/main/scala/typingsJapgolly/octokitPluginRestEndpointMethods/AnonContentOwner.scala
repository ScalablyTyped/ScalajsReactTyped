package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentOwner extends js.Object {
  var comment_id: AnonRequired
  var content: AnonEnum
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
}

object AnonContentOwner {
  @scala.inline
  def apply(
    comment_id: AnonRequired,
    content: AnonEnum,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    repo: AnonRequired
  ): AnonContentOwner = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentOwner]
  }
}

