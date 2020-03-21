package typingsJapgolly.instagramPrivateApi.discoverFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverFeedResponseRootObject extends js.Object {
  var max_id: String
  var more_available: Boolean
  var new_suggested_users: DiscoverFeedResponseNewSuggestedUsers
  var next_max_id: String
  var status: String
  var suggested_users: DiscoverFeedResponseSuggestedUsers
}

object DiscoverFeedResponseRootObject {
  @scala.inline
  def apply(
    max_id: String,
    more_available: Boolean,
    new_suggested_users: DiscoverFeedResponseNewSuggestedUsers,
    next_max_id: String,
    status: String,
    suggested_users: DiscoverFeedResponseSuggestedUsers
  ): DiscoverFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], new_suggested_users = new_suggested_users.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], suggested_users = suggested_users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DiscoverFeedResponseRootObject]
  }
}

