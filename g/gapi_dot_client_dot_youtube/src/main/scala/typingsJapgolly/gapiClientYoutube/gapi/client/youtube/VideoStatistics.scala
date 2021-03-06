package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoStatistics extends js.Object {
  /** The number of comments for the video. */
  var commentCount: js.UndefOr[String] = js.undefined
  /** The number of users who have indicated that they disliked the video by giving it a negative rating. */
  var dislikeCount: js.UndefOr[String] = js.undefined
  /** The number of users who currently have the video marked as a favorite video. */
  var favoriteCount: js.UndefOr[String] = js.undefined
  /** The number of users who have indicated that they liked the video by giving it a positive rating. */
  var likeCount: js.UndefOr[String] = js.undefined
  /** The number of times the video has been viewed. */
  var viewCount: js.UndefOr[String] = js.undefined
}

object VideoStatistics {
  @scala.inline
  def apply(
    commentCount: String = null,
    dislikeCount: String = null,
    favoriteCount: String = null,
    likeCount: String = null,
    viewCount: String = null
  ): VideoStatistics = {
    val __obj = js.Dynamic.literal()
    if (commentCount != null) __obj.updateDynamic("commentCount")(commentCount.asInstanceOf[js.Any])
    if (dislikeCount != null) __obj.updateDynamic("dislikeCount")(dislikeCount.asInstanceOf[js.Any])
    if (favoriteCount != null) __obj.updateDynamic("favoriteCount")(favoriteCount.asInstanceOf[js.Any])
    if (likeCount != null) __obj.updateDynamic("likeCount")(likeCount.asInstanceOf[js.Any])
    if (viewCount != null) __obj.updateDynamic("viewCount")(viewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStatistics]
  }
}

