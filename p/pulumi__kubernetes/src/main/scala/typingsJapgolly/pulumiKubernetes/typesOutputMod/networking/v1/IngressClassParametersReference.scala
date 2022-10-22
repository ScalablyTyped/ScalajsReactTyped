package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressClassParametersReference identifies an API object. This can be used to specify a cluster or namespace-scoped resource.
  */
trait IngressClassParametersReference extends StObject {
  
  /**
    * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
    */
  var apiGroup: String
  
  /**
    * Kind is the type of resource being referenced.
    */
  var kind: String
  
  /**
    * Name is the name of resource being referenced.
    */
  var name: String
  
  /**
    * Namespace is the namespace of the resource being referenced. This field is required when scope is set to "Namespace" and must be unset when scope is set to "Cluster".
    */
  var namespace: String
  
  /**
    * Scope represents if this refers to a cluster or namespace scoped resource. This may be set to "Cluster" (default) or "Namespace".
    */
  var scope: String
}
object IngressClassParametersReference {
  
  inline def apply(apiGroup: String, kind: String, name: String, namespace: String, scope: String): IngressClassParametersReference = {
    val __obj = js.Dynamic.literal(apiGroup = apiGroup.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressClassParametersReference]
  }
  
  extension [Self <: IngressClassParametersReference](x: Self) {
    
    inline def setApiGroup(value: String): Self = StObject.set(x, "apiGroup", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
