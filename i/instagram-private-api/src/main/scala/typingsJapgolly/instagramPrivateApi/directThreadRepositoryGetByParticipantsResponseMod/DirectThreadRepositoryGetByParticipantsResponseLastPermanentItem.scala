package typingsJapgolly.instagramPrivateApi.directThreadRepositoryGetByParticipantsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem extends js.Object {
  var item_id: String
  var item_type: String
  var text: String
  var timestamp: String
  var user_id: Double
}

object DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem {
  @scala.inline
  def apply(item_id: String, item_type: String, text: String, timestamp: String, user_id: Double): DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem = {
    val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem]
  }
}

