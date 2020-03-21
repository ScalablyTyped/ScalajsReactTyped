package typingsJapgolly.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiClient extends js.Object {
  var apiKeys: ApiKeysApi
  var collections: CollectionsApi
  var documents: DocumentsApi
  var integrations: IntegrationsApi
  var organizations: OrganizationsApi
  var queries: QueriesApi
  var users: UsersApi
  var workspaces: WorkspacesApi
}

object ApiClient {
  @scala.inline
  def apply(
    apiKeys: ApiKeysApi,
    collections: CollectionsApi,
    documents: DocumentsApi,
    integrations: IntegrationsApi,
    organizations: OrganizationsApi,
    queries: QueriesApi,
    users: UsersApi,
    workspaces: WorkspacesApi
  ): ApiClient = {
    val __obj = js.Dynamic.literal(apiKeys = apiKeys.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], integrations = integrations.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApiClient]
  }
}

