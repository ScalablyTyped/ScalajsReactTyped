package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerPullnumber extends js.Object {
  var body: AnonRequired
  var comment_id: AnonRequired
  var owner: AnonRequired
  var pull_number: AnonRequired
  var repo: AnonRequired
}

object AnonOwnerPullnumber {
  @scala.inline
  def apply(
    body: AnonRequired,
    comment_id: AnonRequired,
    owner: AnonRequired,
    pull_number: AnonRequired,
    repo: AnonRequired
  ): AnonOwnerPullnumber = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerPullnumber]
  }
}

