package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponsePullRequestsItemBaseRepo extends js.Object {
  var id: Double
  var name: String
  var url: String
}

object ChecksCreateResponsePullRequestsItemBaseRepo {
  @scala.inline
  def apply(id: Double, name: String, url: String): ChecksCreateResponsePullRequestsItemBaseRepo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksCreateResponsePullRequestsItemBaseRepo]
  }
}

