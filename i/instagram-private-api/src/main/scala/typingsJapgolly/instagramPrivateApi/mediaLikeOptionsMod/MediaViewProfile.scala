package typingsJapgolly.instagramPrivateApi.mediaLikeOptionsMod

import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.media_view_profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaViewProfile extends BaseProfile {
  var module_name: media_view_profile
}

object MediaViewProfile {
  @scala.inline
  def apply(module_name: media_view_profile, user_id: String | Double, username: String): MediaViewProfile = {
    val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaViewProfile]
  }
}

