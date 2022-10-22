package typingsJapgolly.pulumiKubernetes.typesOutputMod.policy.v1beta1

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodSecurityPolicy governs the ability to make requests that affect the Security Context that will be applied to a pod and container.
  */
trait PodSecurityPolicy extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: policySlashv1beta1
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodSecurityPolicy
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * spec defines the policy enforced.
    */
  var spec: PodSecurityPolicySpec
}
object PodSecurityPolicy {
  
  inline def apply(metadata: ObjectMeta, spec: PodSecurityPolicySpec): PodSecurityPolicy = {
    val __obj = js.Dynamic.literal(apiVersion = "policy/v1beta1", kind = "PodSecurityPolicy", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSecurityPolicy]
  }
  
  extension [Self <: PodSecurityPolicy](x: Self) {
    
    inline def setApiVersion(value: policySlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodSecurityPolicy): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: PodSecurityPolicySpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
