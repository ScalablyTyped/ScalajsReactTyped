package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCreateHookResponseConfig extends js.Object {
  var content_type: String
  var url: String
}

object OrgsCreateHookResponseConfig {
  @scala.inline
  def apply(content_type: String, url: String): OrgsCreateHookResponseConfig = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsCreateHookResponseConfig]
  }
}

