package typingsJapgolly.instagramPrivateApi.mediaRepositoryConfigureSidecarResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryConfigureSidecarResponseInItem extends js.Object {
  var duration_in_video_in_sec: Null
  var position: js.Array[Double]
  var start_time_in_video_in_sec: Null
  var user: MediaRepositoryConfigureSidecarResponseUser
}

object MediaRepositoryConfigureSidecarResponseInItem {
  @scala.inline
  def apply(
    duration_in_video_in_sec: Null,
    position: js.Array[Double],
    start_time_in_video_in_sec: Null,
    user: MediaRepositoryConfigureSidecarResponseUser
  ): MediaRepositoryConfigureSidecarResponseInItem = {
    val __obj = js.Dynamic.literal(duration_in_video_in_sec = duration_in_video_in_sec.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start_time_in_video_in_sec = start_time_in_video_in_sec.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseInItem]
  }
}

