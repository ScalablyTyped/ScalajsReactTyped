package typingsJapgolly.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken
import typingsJapgolly.gapiClientCloudresourcemanager.AnonAlt
import typingsJapgolly.gapiClientCloudresourcemanager.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationsResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: AnonAccesstoken): Request_[js.Object]
  /** Fetches an Organization resource identified by the specified resource name. */
  def get(request: AnonBearertoken): Request_[Organization]
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy]
  /**
    * Gets the access control policy for an Organization resource. May be empty
    * if no such policy or resource exists. The `resource` field should be the
    * organization's resource name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.getIamPolicy` on the specified organization
    */
  def getIamPolicy(request: AnonAccesstoken): Request_[Policy]
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
    * Searches Organization resources that are visible to the user and satisfy
    * the specified filter. This method returns Organizations in an unspecified
    * order. New Organizations do not necessarily appear at the end of the
    * results.
    *
    * Search will only return organizations on which the user has the permission
    * `resourcemanager.organizations.get`
    */
  def search(request: AnonAlt): Request_[SearchOrganizationsResponse]
  /**
    * Sets the access control policy on an Organization resource. Replaces any
    * existing policy. The `resource` field should be the organization's resource
    * name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.setIamPolicy` on the specified organization
    */
  def setIamPolicy(request: AnonAccesstoken): Request_[Policy]
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy]
  /**
    * Returns permissions that a caller has on the specified Organization.
    * The `resource` field should be the organization's resource name,
    * e.g. "organizations/123".
    *
    * There are no permissions required for making this API call.
    */
  def testIamPermissions(request: AnonAccesstoken): Request_[TestIamPermissionsResponse]
}

object OrganizationsResource {
  @scala.inline
  def apply(
    clearOrgPolicy: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    get: AnonBearertoken => CallbackTo[Request_[Organization]],
    getEffectiveOrgPolicy: AnonAccesstoken => CallbackTo[Request_[OrgPolicy]],
    getIamPolicy: AnonAccesstoken => CallbackTo[Request_[Policy]],
    getOrgPolicy: AnonAccesstoken => CallbackTo[Request_[OrgPolicy]],
    listAvailableOrgPolicyConstraints: AnonAccesstoken => CallbackTo[Request_[ListAvailableOrgPolicyConstraintsResponse]],
    listOrgPolicies: AnonAccesstoken => CallbackTo[Request_[ListOrgPoliciesResponse]],
    search: AnonAlt => CallbackTo[Request_[SearchOrganizationsResponse]],
    setIamPolicy: AnonAccesstoken => CallbackTo[Request_[Policy]],
    setOrgPolicy: AnonAccesstoken => CallbackTo[Request_[OrgPolicy]],
    testIamPermissions: AnonAccesstoken => CallbackTo[Request_[TestIamPermissionsResponse]]
  ): OrganizationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearOrgPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => clearOrgPolicy(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonBearertoken) => get(t0).runNow()))
    __obj.updateDynamic("getEffectiveOrgPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => getEffectiveOrgPolicy(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("getOrgPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => getOrgPolicy(t0).runNow()))
    __obj.updateDynamic("listAvailableOrgPolicyConstraints")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => listAvailableOrgPolicyConstraints(t0).runNow()))
    __obj.updateDynamic("listOrgPolicies")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => listOrgPolicies(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAlt) => search(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("setOrgPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => setOrgPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAccesstoken) => testIamPermissions(t0).runNow()))
    __obj.asInstanceOf[OrganizationsResource]
  }
}

