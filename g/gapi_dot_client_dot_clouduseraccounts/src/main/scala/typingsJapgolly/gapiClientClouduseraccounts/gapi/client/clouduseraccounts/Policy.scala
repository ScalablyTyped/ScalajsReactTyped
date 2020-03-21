package typingsJapgolly.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  /**
    * Specifies audit logging configs for "data access". "data access": generally refers to data reads/writes and admin reads. "admin activity": generally
    * refers to admin writes.
    *
    * Note: `AuditConfig` doesn't apply to "admin activity", which always enables audit logging.
    */
  var auditConfigs: js.UndefOr[js.Array[AuditConfig]] = js.undefined
  /**
    * Associates a list of `members` to a `role`. Multiple `bindings` must not be specified for the same `role`. `bindings` with no members will result in an
    * error.
    */
  var bindings: js.UndefOr[js.Array[Binding]] = js.undefined
  /**
    * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly
    * suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is
    * returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will
    * be applied to the same version of the policy.
    *
    * If no `etag` is provided in the call to `setIamPolicy`, then the existing policy is overwritten blindly.
    */
  var etag: js.UndefOr[String] = js.undefined
  var iamOwned: js.UndefOr[Boolean] = js.undefined
  /**
    * If more than one rule is specified, the rules are applied in the following manner: - All matching LOG rules are always applied. - If any
    * DENY/DENY_WITH_LOG rule matches, permission is denied. Logging will be applied if one or more matching rule requires logging. - Otherwise, if any
    * ALLOW/ALLOW_WITH_LOG rule matches, permission is granted. Logging will be applied if one or more matching rule requires logging. - Otherwise, if no
    * rule applies, permission is denied.
    */
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  /** Version of the `Policy`. The default version is 0. */
  var version: js.UndefOr[Double] = js.undefined
}

object Policy {
  @scala.inline
  def apply(
    auditConfigs: js.Array[AuditConfig] = null,
    bindings: js.Array[Binding] = null,
    etag: String = null,
    iamOwned: js.UndefOr[Boolean] = js.undefined,
    rules: js.Array[Rule] = null,
    version: Int | Double = null
  ): Policy = {
    val __obj = js.Dynamic.literal()
    if (auditConfigs != null) __obj.updateDynamic("auditConfigs")(auditConfigs.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(iamOwned)) __obj.updateDynamic("iamOwned")(iamOwned.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}

