package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.extensionsSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicy is deprecated by networking/v1/NetworkPolicy. NetworkPolicy describes what network traffic is allowed for a set of Pods
  */
trait NetworkPolicy extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: extensionsSlashv1beta1
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.NetworkPolicy
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * Specification of the desired behavior for this NetworkPolicy.
    */
  var spec: NetworkPolicySpec
}
object NetworkPolicy {
  
  inline def apply(metadata: ObjectMeta, spec: NetworkPolicySpec): NetworkPolicy = {
    val __obj = js.Dynamic.literal(apiVersion = "extensions/v1beta1", kind = "NetworkPolicy", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicy]
  }
  
  extension [Self <: NetworkPolicy](x: Self) {
    
    inline def setApiVersion(value: extensionsSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.NetworkPolicy): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: NetworkPolicySpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
