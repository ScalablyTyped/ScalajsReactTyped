package typingsJapgolly.instagramPrivateApi.mediaLikeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProfile extends js.Object {
  var user_id: String | Double
  var username: String
}

object BaseProfile {
  @scala.inline
  def apply(user_id: String | Double, username: String): BaseProfile = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseProfile]
  }
}

