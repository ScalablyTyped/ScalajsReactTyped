package typingsJapgolly.gapiClientIam.gapi.client.iam

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientIam.AnonAccesstoken
import typingsJapgolly.gapiClientIam.AnonAlt
import typingsJapgolly.gapiClientIam.AnonBearertoken
import typingsJapgolly.gapiClientIam.AnonCallback
import typingsJapgolly.gapiClientIam.AnonFields
import typingsJapgolly.gapiClientIam.AnonKey
import typingsJapgolly.gapiClientIam.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolesResource extends js.Object {
  /** Creates a new Role. */
  def create(request: AnonAccesstoken): Request_[Role] = js.native
  /**
    * Soft deletes a role. The role is suspended and cannot be used to create new
    * IAM Policy Bindings.
    * The Role will not be included in `ListRoles()` unless `show_deleted` is set
    * in the `ListRolesRequest`. The Role contains the deleted boolean set.
    * Existing Bindings remains, but are inactive. The Role can be undeleted
    * within 7 days. After 7 days the Role is deleted and all Bindings associated
    * with the role are removed.
    */
  def delete(request: AnonAlt): Request_[Role] = js.native
  /** Gets a Role definition. */
  def get(request: AnonBearertoken): Request_[Role] = js.native
  /** Lists the Roles defined on a resource. */
  def list(request: AnonCallback): Request_[ListRolesResponse] = js.native
  /** Lists the Roles defined on a resource. */
  def list(request: AnonKey): Request_[ListRolesResponse] = js.native
  /** Updates a Role definition. */
  def patch(request: AnonFields): Request_[Role] = js.native
  /**
    * Queries roles that can be granted on a particular resource.
    * A role is grantable if it can be used as the role in a binding for a policy
    * for that resource.
    */
  def queryGrantableRoles(request: AnonOauthtoken): Request_[QueryGrantableRolesResponse] = js.native
  /** Undelete a Role, bringing it back in its previous state. */
  def undelete(request: AnonBearertoken): Request_[Role] = js.native
}

