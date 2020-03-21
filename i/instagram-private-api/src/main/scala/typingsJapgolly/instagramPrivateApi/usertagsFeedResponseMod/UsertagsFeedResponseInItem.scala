package typingsJapgolly.instagramPrivateApi.usertagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsertagsFeedResponseInItem extends js.Object {
  var duration_in_video_in_sec: Null
  var position: js.Array[Double | String]
  var start_time_in_video_in_sec: Null
  var user: UsertagsFeedResponseUser
}

object UsertagsFeedResponseInItem {
  @scala.inline
  def apply(
    duration_in_video_in_sec: Null,
    position: js.Array[Double | String],
    start_time_in_video_in_sec: Null,
    user: UsertagsFeedResponseUser
  ): UsertagsFeedResponseInItem = {
    val __obj = js.Dynamic.literal(duration_in_video_in_sec = duration_in_video_in_sec.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start_time_in_video_in_sec = start_time_in_video_in_sec.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsertagsFeedResponseInItem]
  }
}

