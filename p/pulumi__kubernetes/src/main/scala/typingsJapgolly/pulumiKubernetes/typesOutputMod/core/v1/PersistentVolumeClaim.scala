package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaim is a user's request for and claim to a persistent volume
  */
trait PersistentVolumeClaim extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PersistentVolumeClaim
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * spec defines the desired characteristics of a volume requested by a pod author. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var spec: PersistentVolumeClaimSpec
  
  /**
    * status represents the current information/status of a persistent volume claim. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var status: PersistentVolumeClaimStatus
}
object PersistentVolumeClaim {
  
  inline def apply(metadata: ObjectMeta, spec: PersistentVolumeClaimSpec, status: PersistentVolumeClaimStatus): PersistentVolumeClaim = {
    val __obj = js.Dynamic.literal(apiVersion = "v1", kind = "PersistentVolumeClaim", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaim]
  }
  
  extension [Self <: PersistentVolumeClaim](x: Self) {
    
    inline def setApiVersion(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PersistentVolumeClaim): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: PersistentVolumeClaimSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PersistentVolumeClaimStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
