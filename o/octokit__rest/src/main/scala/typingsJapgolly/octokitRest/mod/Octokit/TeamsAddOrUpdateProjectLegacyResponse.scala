package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateProjectLegacyResponse extends js.Object {
  var documentation_url: String
  var message: String
}

object TeamsAddOrUpdateProjectLegacyResponse {
  @scala.inline
  def apply(documentation_url: String, message: String): TeamsAddOrUpdateProjectLegacyResponse = {
    val __obj = js.Dynamic.literal(documentation_url = documentation_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsAddOrUpdateProjectLegacyResponse]
  }
}

