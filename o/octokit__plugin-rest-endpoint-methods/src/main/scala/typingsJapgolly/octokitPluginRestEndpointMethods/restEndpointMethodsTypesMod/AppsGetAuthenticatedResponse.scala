package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsGetAuthenticatedResponse extends js.Object {
  var created_at: String
  var description: String
  var events: js.Array[String]
  var external_url: String
  var html_url: String
  var id: Double
  var installations_count: Double
  var name: String
  var node_id: String
  var owner: AppsGetAuthenticatedResponseOwner
  var permissions: AppsGetAuthenticatedResponsePermissions
  var slug: String
  var updated_at: String
}

object AppsGetAuthenticatedResponse {
  @scala.inline
  def apply(
    created_at: String,
    description: String,
    events: js.Array[String],
    external_url: String,
    html_url: String,
    id: Double,
    installations_count: Double,
    name: String,
    node_id: String,
    owner: AppsGetAuthenticatedResponseOwner,
    permissions: AppsGetAuthenticatedResponsePermissions,
    slug: String,
    updated_at: String
  ): AppsGetAuthenticatedResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installations_count = installations_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsGetAuthenticatedResponse]
  }
}

