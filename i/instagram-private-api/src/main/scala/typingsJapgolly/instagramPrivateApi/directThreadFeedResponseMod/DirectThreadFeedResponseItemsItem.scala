package typingsJapgolly.instagramPrivateApi.directThreadFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadFeedResponseItemsItem extends js.Object {
  var client_context: String
  var item_id: String
  var item_type: String
  var text: String
  var timestamp: String
  var user_id: Double
}

object DirectThreadFeedResponseItemsItem {
  @scala.inline
  def apply(
    client_context: String,
    item_id: String,
    item_type: String,
    text: String,
    timestamp: String,
    user_id: Double
  ): DirectThreadFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(client_context = client_context.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadFeedResponseItemsItem]
  }
}

