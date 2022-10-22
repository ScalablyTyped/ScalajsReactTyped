package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  /** Specifies cloud audit logging configuration for this policy. */
  var auditConfigs: js.UndefOr[js.Array[AuditConfig]] = js.undefined
  
  /**
    * Associates a list of `members` to a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at
    * least one member.
    */
  var bindings: js.UndefOr[js.Array[Binding]] = js.undefined
  
  /**
    * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make
    * use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems
    * are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM
    * Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1`
    * policy, and all of the conditions in the version `3` policy are lost.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var iamOwned: js.UndefOr[Boolean] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  
  /**
    * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings
    * must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a
    * policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use
    * IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1`
    * policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave
    * the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    */
  var version: js.UndefOr[Double] = js.undefined
}
object Policy {
  
  inline def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setAuditConfigs(value: js.Array[AuditConfig]): Self = StObject.set(x, "auditConfigs", value.asInstanceOf[js.Any])
    
    inline def setAuditConfigsUndefined: Self = StObject.set(x, "auditConfigs", js.undefined)
    
    inline def setAuditConfigsVarargs(value: AuditConfig*): Self = StObject.set(x, "auditConfigs", js.Array(value*))
    
    inline def setBindings(value: js.Array[Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: Binding*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setIamOwned(value: Boolean): Self = StObject.set(x, "iamOwned", value.asInstanceOf[js.Any])
    
    inline def setIamOwnedUndefined: Self = StObject.set(x, "iamOwned", js.undefined)
    
    inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
