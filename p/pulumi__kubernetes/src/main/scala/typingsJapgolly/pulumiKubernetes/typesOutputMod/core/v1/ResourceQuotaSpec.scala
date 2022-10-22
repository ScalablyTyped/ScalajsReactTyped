package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
  */
trait ResourceQuotaSpec extends StObject {
  
  /**
    * hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  var hard: StringDictionary[String]
  
  /**
    * scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
    */
  var scopeSelector: ScopeSelector
  
  /**
    * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
    */
  var scopes: js.Array[String]
}
object ResourceQuotaSpec {
  
  inline def apply(hard: StringDictionary[String], scopeSelector: ScopeSelector, scopes: js.Array[String]): ResourceQuotaSpec = {
    val __obj = js.Dynamic.literal(hard = hard.asInstanceOf[js.Any], scopeSelector = scopeSelector.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuotaSpec]
  }
  
  extension [Self <: ResourceQuotaSpec](x: Self) {
    
    inline def setHard(value: StringDictionary[String]): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
    
    inline def setScopeSelector(value: ScopeSelector): Self = StObject.set(x, "scopeSelector", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
