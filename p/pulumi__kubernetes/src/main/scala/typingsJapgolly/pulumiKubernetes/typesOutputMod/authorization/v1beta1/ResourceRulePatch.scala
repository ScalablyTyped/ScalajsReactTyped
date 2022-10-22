package typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
  */
trait ResourceRulePatch extends StObject {
  
  /**
    * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  "*" means all.
    */
  var apiGroups: js.Array[String]
  
  /**
    * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
    */
  var resourceNames: js.Array[String]
  
  /**
    * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
    *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
    */
  var resources: js.Array[String]
  
  /**
    * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
    */
  var verbs: js.Array[String]
}
object ResourceRulePatch {
  
  inline def apply(
    apiGroups: js.Array[String],
    resourceNames: js.Array[String],
    resources: js.Array[String],
    verbs: js.Array[String]
  ): ResourceRulePatch = {
    val __obj = js.Dynamic.literal(apiGroups = apiGroups.asInstanceOf[js.Any], resourceNames = resourceNames.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRulePatch]
  }
  
  extension [Self <: ResourceRulePatch](x: Self) {
    
    inline def setApiGroups(value: js.Array[String]): Self = StObject.set(x, "apiGroups", value.asInstanceOf[js.Any])
    
    inline def setApiGroupsVarargs(value: String*): Self = StObject.set(x, "apiGroups", js.Array(value*))
    
    inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setVerbs(value: js.Array[String]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
    
    inline def setVerbsVarargs(value: String*): Self = StObject.set(x, "verbs", js.Array(value*))
  }
}
