package typingsJapgolly.instagramPrivateApi.mediaLikeOptionsMod

import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_newsfeed_multi_media_liked
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_post
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.feed_timeline
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.newsfeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedTimeline extends js.Object {
  var module_name: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked
}

object FeedTimeline {
  @scala.inline
  def apply(
    module_name: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked
  ): FeedTimeline = {
    val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeedTimeline]
  }
}

