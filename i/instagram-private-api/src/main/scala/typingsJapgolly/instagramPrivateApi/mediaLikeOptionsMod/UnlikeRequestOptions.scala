package typingsJapgolly.instagramPrivateApi.mediaLikeOptionsMod

import typingsJapgolly.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  d ? :0} */
trait UnlikeRequestOptions extends js.Object {
  var d: js.UndefOr[`0`] = js.undefined
  var mediaId: String
  var moduleInfo: LikeModuleInfoOption
}

object UnlikeRequestOptions {
  @scala.inline
  def apply(mediaId: String, moduleInfo: LikeModuleInfoOption, d: `0` = null): UnlikeRequestOptions = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlikeRequestOptions]
  }
}

