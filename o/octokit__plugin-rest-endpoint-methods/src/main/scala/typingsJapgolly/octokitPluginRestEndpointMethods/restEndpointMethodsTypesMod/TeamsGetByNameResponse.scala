package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetByNameResponse extends js.Object {
  var created_at: String
  var description: String
  var html_url: String
  var id: Double
  var members_count: Double
  var members_url: String
  var name: String
  var node_id: String
  var organization: TeamsGetByNameResponseOrganization
  var parent: Null
  var permission: String
  var privacy: String
  var repos_count: Double
  var repositories_url: String
  var slug: String
  var updated_at: String
  var url: String
}

object TeamsGetByNameResponse {
  @scala.inline
  def apply(
    created_at: String,
    description: String,
    html_url: String,
    id: Double,
    members_count: Double,
    members_url: String,
    name: String,
    node_id: String,
    organization: TeamsGetByNameResponseOrganization,
    parent: Null,
    permission: String,
    privacy: String,
    repos_count: Double,
    repositories_url: String,
    slug: String,
    updated_at: String,
    url: String
  ): TeamsGetByNameResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_count = members_count.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repos_count = repos_count.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetByNameResponse]
  }
}

