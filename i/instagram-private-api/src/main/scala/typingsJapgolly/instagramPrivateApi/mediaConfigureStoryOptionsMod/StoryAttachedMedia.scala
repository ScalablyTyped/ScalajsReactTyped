package typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryAttachedMedia extends StorySticker {
  var is_sticker: Boolean
  var media_id: String
}

object StoryAttachedMedia {
  @scala.inline
  def apply(
    height: Double,
    is_sticker: Boolean,
    media_id: String,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): StoryAttachedMedia = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryAttachedMedia]
  }
}

