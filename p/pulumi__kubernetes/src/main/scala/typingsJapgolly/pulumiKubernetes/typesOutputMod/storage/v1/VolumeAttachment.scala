package typingsJapgolly.pulumiKubernetes.typesOutputMod.storage.v1

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
  *
  * VolumeAttachment objects are non-namespaced.
  */
trait VolumeAttachment extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: storageDotk8sDotioSlashv1
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment
  
  /**
    * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
    */
  var spec: VolumeAttachmentSpec
  
  /**
    * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
    */
  var status: VolumeAttachmentStatus
}
object VolumeAttachment {
  
  inline def apply(metadata: ObjectMeta, spec: VolumeAttachmentSpec, status: VolumeAttachmentStatus): VolumeAttachment = {
    val __obj = js.Dynamic.literal(apiVersion = "storage.k8s.io/v1", kind = "VolumeAttachment", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachment]
  }
  
  extension [Self <: VolumeAttachment](x: Self) {
    
    inline def setApiVersion(value: storageDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: VolumeAttachmentSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: VolumeAttachmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
