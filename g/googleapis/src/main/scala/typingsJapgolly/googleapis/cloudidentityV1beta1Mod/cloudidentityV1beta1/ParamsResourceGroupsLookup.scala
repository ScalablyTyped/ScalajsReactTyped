package typingsJapgolly.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceGroupsLookup extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The id of the entity within the given namespace. The id must be unique
    * within its namespace.
    */
  @JSName("groupKey.id")
  var groupKeyDotid: js.UndefOr[String] = js.native
  /**
    * Namespaces provide isolation for ids, i.e an id only needs to be unique
    * within its namespace.  Namespaces are currently only created as part of
    * IdentitySource creation from Admin Console. A namespace
    * `"identitysources/{identity_source_id}"` is created corresponding to
    * every Identity Source `identity_source_id`.
    */
  @JSName("groupKey.namespace")
  var groupKeyDotnamespace: js.UndefOr[String] = js.native
}

