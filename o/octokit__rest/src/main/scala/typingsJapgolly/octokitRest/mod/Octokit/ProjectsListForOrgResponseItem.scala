package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListForOrgResponseItem extends js.Object {
  var body: String
  var columns_url: String
  var created_at: String
  var creator: ProjectsListForOrgResponseItemCreator
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var number: Double
  var owner_url: String
  var state: String
  var updated_at: String
  var url: String
}

object ProjectsListForOrgResponseItem {
  @scala.inline
  def apply(
    body: String,
    columns_url: String,
    created_at: String,
    creator: ProjectsListForOrgResponseItemCreator,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    number: Double,
    owner_url: String,
    state: String,
    updated_at: String,
    url: String
  ): ProjectsListForOrgResponseItem = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], columns_url = columns_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner_url = owner_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsListForOrgResponseItem]
  }
}

