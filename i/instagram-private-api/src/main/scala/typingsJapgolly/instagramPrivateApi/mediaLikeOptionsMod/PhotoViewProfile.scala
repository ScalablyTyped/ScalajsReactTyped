package typingsJapgolly.instagramPrivateApi.mediaLikeOptionsMod

import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.photo_view_profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoViewProfile extends BaseProfile {
  var module_name: photo_view_profile
}

object PhotoViewProfile {
  @scala.inline
  def apply(module_name: photo_view_profile, user_id: String | Double, username: String): PhotoViewProfile = {
    val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhotoViewProfile]
  }
}

