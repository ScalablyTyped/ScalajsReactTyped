package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.networkingDotk8sDotioSlashv1
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NetworkPolicy describes what network traffic is allowed for a set of Pods
  */
trait NetworkPolicy extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[networkingDotk8sDotioSlashv1]] = js.undefined
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.NetworkPolicy]] = js.undefined
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  
  /**
    * Specification of the desired behavior for this NetworkPolicy.
    */
  var spec: js.UndefOr[Input[NetworkPolicySpec]] = js.undefined
  
  /**
    * Status is the current state of the NetworkPolicy. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var status: js.UndefOr[Input[NetworkPolicyStatus]] = js.undefined
}
object NetworkPolicy {
  
  inline def apply(): NetworkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicy]
  }
  
  extension [Self <: NetworkPolicy](x: Self) {
    
    inline def setApiVersion(value: Input[networkingDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.NetworkPolicy]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: Input[NetworkPolicySpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setStatus(value: Input[NetworkPolicyStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
