package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUsername extends js.Object {
  var page: AnonType
  var per_page: AnonType
  var username: AnonRequired
}

object AnonUsername {
  @scala.inline
  def apply(page: AnonType, per_page: AnonType, username: AnonRequired): AnonUsername = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUsername]
  }
}

