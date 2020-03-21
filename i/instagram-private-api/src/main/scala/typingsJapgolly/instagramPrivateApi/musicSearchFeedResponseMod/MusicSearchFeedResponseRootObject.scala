package typingsJapgolly.instagramPrivateApi.musicSearchFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicSearchFeedResponseRootObject extends js.Object {
  var alacorn_session_id: String
  var items: js.Array[MusicSearchFeedResponseItemsItem]
  var page_info: MusicSearchFeedResponsePageInfo
  var status: String
}

object MusicSearchFeedResponseRootObject {
  @scala.inline
  def apply(
    alacorn_session_id: String,
    items: js.Array[MusicSearchFeedResponseItemsItem],
    page_info: MusicSearchFeedResponsePageInfo,
    status: String
  ): MusicSearchFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicSearchFeedResponseRootObject]
  }
}

