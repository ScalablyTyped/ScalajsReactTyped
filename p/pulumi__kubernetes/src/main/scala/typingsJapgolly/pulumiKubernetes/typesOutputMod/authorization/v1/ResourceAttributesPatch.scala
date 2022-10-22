package typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
  */
trait ResourceAttributesPatch extends StObject {
  
  /**
    * Group is the API Group of the Resource.  "*" means all.
    */
  var group: String
  
  /**
    * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
    */
  var name: String
  
  /**
    * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
    */
  var namespace: String
  
  /**
    * Resource is one of the existing resource types.  "*" means all.
    */
  var resource: String
  
  /**
    * Subresource is one of the existing resource types.  "" means none.
    */
  var subresource: String
  
  /**
    * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
    */
  var verb: String
  
  /**
    * Version is the API Version of the Resource.  "*" means all.
    */
  var version: String
}
object ResourceAttributesPatch {
  
  inline def apply(
    group: String,
    name: String,
    namespace: String,
    resource: String,
    subresource: String,
    verb: String,
    version: String
  ): ResourceAttributesPatch = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], subresource = subresource.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAttributesPatch]
  }
  
  extension [Self <: ResourceAttributesPatch](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setSubresource(value: String): Self = StObject.set(x, "subresource", value.asInstanceOf[js.Any])
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
