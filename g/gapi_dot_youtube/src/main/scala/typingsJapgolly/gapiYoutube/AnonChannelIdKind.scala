package typingsJapgolly.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannelIdKind extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel, if the recommended resource is a channel. This property is only present if the resourceId.kind is youtube#channel.
    */
  var channelId: String
  /**
    * The type of the API resource.
    */
  var kind: String
  /**
    * The ID that YouTube uses to uniquely identify the video, if the recommended resource is a video. This property is only present if the resourceId.kind is youtube#video.
    */
  var videoId: String
}

object AnonChannelIdKind {
  @scala.inline
  def apply(channelId: String, kind: String, videoId: String): AnonChannelIdKind = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChannelIdKind]
  }
}

