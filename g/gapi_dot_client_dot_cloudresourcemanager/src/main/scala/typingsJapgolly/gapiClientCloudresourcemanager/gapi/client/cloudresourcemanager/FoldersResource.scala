package typingsJapgolly.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldersResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: AnonAccesstoken): Request_[js.Object]
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy]
  /**
    * Gets a `Policy` on a resource.
    *
    * If no `Policy` is set on the resource, a `Policy` is returned with default
    * values including `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The
    * `etag` value can be used with `SetOrgPolicy()` to create or update a
    * `Policy` during read-modify-write.
    */
  def getOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy]
  /** Lists `Constraints` that could be applied on the specified resource. */
  def listAvailableOrgPolicyConstraints(request: AnonAccesstoken): Request_[ListAvailableOrgPolicyConstraintsResponse]
  /** Lists all the `Policies` set for a particular resource. */
  def listOrgPolicies(request: AnonAccesstoken): Request_[ListOrgPoliciesResponse]
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy]
}

object FoldersResource {
  @scala.inline
  def apply(
    clearOrgPolicy: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    getEffectiveOrgPolicy: AnonAccesstoken => CallbackTo[Request_[OrgPolicy]],
    getOrgPolicy: AnonAccesstoken => CallbackTo[Request_[OrgPolicy]],
    listAvailableOrgPolicyConstraints: AnonAccesstoken => CallbackTo[Request_[ListAvailableOrgPolicyConstraintsResponse]],
    listOrgPolicies: AnonAccesstoken => CallbackTo[Request_[ListOrgPoliciesResponse]],
    setOrgPolicy: AnonAccesstoken => CallbackTo[Request_[OrgPolicy]]
  ): FoldersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearOrgPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => clearOrgPolicy(t0).runNow()))
    __obj.updateDynamic("getEffectiveOrgPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => getEffectiveOrgPolicy(t0).runNow()))
    __obj.updateDynamic("getOrgPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => getOrgPolicy(t0).runNow()))
    __obj.updateDynamic("listAvailableOrgPolicyConstraints")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => listAvailableOrgPolicyConstraints(t0).runNow()))
    __obj.updateDynamic("listOrgPolicies")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => listOrgPolicies(t0).runNow()))
    __obj.updateDynamic("setOrgPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => setOrgPolicy(t0).runNow()))
    __obj.asInstanceOf[FoldersResource]
  }
}

