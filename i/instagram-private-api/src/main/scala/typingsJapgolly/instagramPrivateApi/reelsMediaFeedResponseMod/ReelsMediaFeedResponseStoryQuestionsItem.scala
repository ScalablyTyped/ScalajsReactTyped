package typingsJapgolly.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponseStoryQuestionsItem extends js.Object {
  var height: Double
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var question_sticker: ReelsMediaFeedResponseQuestionSticker
  var rotation: Double
  var width: Double
  var x: Double
  var y: Double
  var z: Double
}

object ReelsMediaFeedResponseStoryQuestionsItem {
  @scala.inline
  def apply(
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    question_sticker: ReelsMediaFeedResponseQuestionSticker,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double,
    z: Double
  ): ReelsMediaFeedResponseStoryQuestionsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], question_sticker = question_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReelsMediaFeedResponseStoryQuestionsItem]
  }
}

