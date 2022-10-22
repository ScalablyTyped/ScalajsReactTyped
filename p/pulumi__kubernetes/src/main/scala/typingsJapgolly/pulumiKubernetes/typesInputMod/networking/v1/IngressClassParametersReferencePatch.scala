package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressClassParametersReference identifies an API object. This can be used to specify a cluster or namespace-scoped resource.
  */
trait IngressClassParametersReferencePatch extends StObject {
  
  /**
    * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
    */
  var apiGroup: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Kind is the type of resource being referenced.
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Name is the name of resource being referenced.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Namespace is the namespace of the resource being referenced. This field is required when scope is set to "Namespace" and must be unset when scope is set to "Cluster".
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Scope represents if this refers to a cluster or namespace scoped resource. This may be set to "Cluster" (default) or "Namespace".
    */
  var scope: js.UndefOr[Input[String]] = js.undefined
}
object IngressClassParametersReferencePatch {
  
  inline def apply(): IngressClassParametersReferencePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressClassParametersReferencePatch]
  }
  
  extension [Self <: IngressClassParametersReferencePatch](x: Self) {
    
    inline def setApiGroup(value: Input[String]): Self = StObject.set(x, "apiGroup", value.asInstanceOf[js.Any])
    
    inline def setApiGroupUndefined: Self = StObject.set(x, "apiGroup", js.undefined)
    
    inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
