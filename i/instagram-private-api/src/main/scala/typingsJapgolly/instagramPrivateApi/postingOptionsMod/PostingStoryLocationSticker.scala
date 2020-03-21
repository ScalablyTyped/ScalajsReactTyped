package typingsJapgolly.instagramPrivateApi.postingOptionsMod

import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingStoryLocationSticker extends js.Object {
  var latitude: String
  var longitude: String
  var sticker: StoryLocation
}

object PostingStoryLocationSticker {
  @scala.inline
  def apply(latitude: String, longitude: String, sticker: StoryLocation): PostingStoryLocationSticker = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], sticker = sticker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostingStoryLocationSticker]
  }
}

