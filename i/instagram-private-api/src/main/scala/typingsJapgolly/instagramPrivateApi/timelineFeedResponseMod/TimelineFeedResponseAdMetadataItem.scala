package typingsJapgolly.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseAdMetadataItem extends js.Object {
  var `type`: Double
  var value: String
}

object TimelineFeedResponseAdMetadataItem {
  @scala.inline
  def apply(`type`: Double, value: String): TimelineFeedResponseAdMetadataItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseAdMetadataItem]
  }
}

