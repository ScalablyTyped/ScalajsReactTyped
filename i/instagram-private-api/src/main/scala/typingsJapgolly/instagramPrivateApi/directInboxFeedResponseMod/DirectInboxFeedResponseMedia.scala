package typingsJapgolly.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectInboxFeedResponseMedia extends js.Object {
  var expiring_at: Double
  var user: DirectInboxFeedResponseUser
}

object DirectInboxFeedResponseMedia {
  @scala.inline
  def apply(expiring_at: Double, user: DirectInboxFeedResponseUser): DirectInboxFeedResponseMedia = {
    val __obj = js.Dynamic.literal(expiring_at = expiring_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectInboxFeedResponseMedia]
  }
}

