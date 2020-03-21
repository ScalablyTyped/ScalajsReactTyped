package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.mention_reshare
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.mention_username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.MentionSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
trait DiffMentionStickerInstaSt extends js.Object {
  var displayType: js.UndefOr[mention_username | mention_reshare] = js.undefined
  var mediaId: js.UndefOr[String] = js.undefined
  var userId: String
}

object DiffMentionStickerInstaSt {
  @scala.inline
  def apply(userId: String, displayType: mention_username | mention_reshare = null, mediaId: String = null): DiffMentionStickerInstaSt = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    if (displayType != null) __obj.updateDynamic("displayType")(displayType.asInstanceOf[js.Any])
    if (mediaId != null) __obj.updateDynamic("mediaId")(mediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffMentionStickerInstaSt]
  }
}

