package typingsJapgolly.pulumiKubernetes.typesInputMod.storage

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.PersistentVolumeSpec
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.PersistentVolumeSpecPatch
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1alpha1 {
  
  /**
    * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
    *
    * VolumeAttachment objects are non-namespaced.
    */
  trait VolumeAttachment extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1alpha1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment]] = js.undefined
    
    /**
      * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
      */
    var spec: Input[VolumeAttachmentSpec]
    
    /**
      * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
      */
    var status: js.UndefOr[Input[VolumeAttachmentStatus]] = js.undefined
  }
  object VolumeAttachment {
    
    inline def apply(spec: Input[VolumeAttachmentSpec]): VolumeAttachment = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachment]
    }
    
    extension [Self <: VolumeAttachment](x: Self) {
      
      inline def setApiVersion(value: Input[storageDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(value: Input[VolumeAttachmentSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Input[VolumeAttachmentStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
    */
  trait VolumeAttachmentSource extends StObject {
    
    /**
      * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
      */
    var inlineVolumeSpec: js.UndefOr[Input[PersistentVolumeSpec]] = js.undefined
    
    /**
      * Name of the persistent volume to attach.
      */
    var persistentVolumeName: js.UndefOr[Input[String]] = js.undefined
  }
  object VolumeAttachmentSource {
    
    inline def apply(): VolumeAttachmentSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeAttachmentSource]
    }
    
    extension [Self <: VolumeAttachmentSource](x: Self) {
      
      inline def setInlineVolumeSpec(value: Input[PersistentVolumeSpec]): Self = StObject.set(x, "inlineVolumeSpec", value.asInstanceOf[js.Any])
      
      inline def setInlineVolumeSpecUndefined: Self = StObject.set(x, "inlineVolumeSpec", js.undefined)
      
      inline def setPersistentVolumeName(value: Input[String]): Self = StObject.set(x, "persistentVolumeName", value.asInstanceOf[js.Any])
      
      inline def setPersistentVolumeNameUndefined: Self = StObject.set(x, "persistentVolumeName", js.undefined)
    }
  }
  
  /**
    * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
    */
  trait VolumeAttachmentSourcePatch extends StObject {
    
    /**
      * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
      */
    var inlineVolumeSpec: js.UndefOr[Input[PersistentVolumeSpecPatch]] = js.undefined
    
    /**
      * Name of the persistent volume to attach.
      */
    var persistentVolumeName: js.UndefOr[Input[String]] = js.undefined
  }
  object VolumeAttachmentSourcePatch {
    
    inline def apply(): VolumeAttachmentSourcePatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeAttachmentSourcePatch]
    }
    
    extension [Self <: VolumeAttachmentSourcePatch](x: Self) {
      
      inline def setInlineVolumeSpec(value: Input[PersistentVolumeSpecPatch]): Self = StObject.set(x, "inlineVolumeSpec", value.asInstanceOf[js.Any])
      
      inline def setInlineVolumeSpecUndefined: Self = StObject.set(x, "inlineVolumeSpec", js.undefined)
      
      inline def setPersistentVolumeName(value: Input[String]): Self = StObject.set(x, "persistentVolumeName", value.asInstanceOf[js.Any])
      
      inline def setPersistentVolumeNameUndefined: Self = StObject.set(x, "persistentVolumeName", js.undefined)
    }
  }
  
  /**
    * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
    */
  trait VolumeAttachmentSpec extends StObject {
    
    /**
      * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
      */
    var attacher: Input[String]
    
    /**
      * The node that the volume should be attached to.
      */
    var nodeName: Input[String]
    
    /**
      * Source represents the volume that should be attached.
      */
    var source: Input[VolumeAttachmentSource]
  }
  object VolumeAttachmentSpec {
    
    inline def apply(attacher: Input[String], nodeName: Input[String], source: Input[VolumeAttachmentSource]): VolumeAttachmentSpec = {
      val __obj = js.Dynamic.literal(attacher = attacher.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachmentSpec]
    }
    
    extension [Self <: VolumeAttachmentSpec](x: Self) {
      
      inline def setAttacher(value: Input[String]): Self = StObject.set(x, "attacher", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: Input[String]): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Input[VolumeAttachmentSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
    */
  trait VolumeAttachmentSpecPatch extends StObject {
    
    /**
      * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
      */
    var attacher: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The node that the volume should be attached to.
      */
    var nodeName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Source represents the volume that should be attached.
      */
    var source: js.UndefOr[Input[VolumeAttachmentSourcePatch]] = js.undefined
  }
  object VolumeAttachmentSpecPatch {
    
    inline def apply(): VolumeAttachmentSpecPatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeAttachmentSpecPatch]
    }
    
    extension [Self <: VolumeAttachmentSpecPatch](x: Self) {
      
      inline def setAttacher(value: Input[String]): Self = StObject.set(x, "attacher", value.asInstanceOf[js.Any])
      
      inline def setAttacherUndefined: Self = StObject.set(x, "attacher", js.undefined)
      
      inline def setNodeName(value: Input[String]): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
      
      inline def setSource(value: Input[VolumeAttachmentSourcePatch]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  /**
    * VolumeAttachmentStatus is the status of a VolumeAttachment request.
    */
  trait VolumeAttachmentStatus extends StObject {
    
    /**
      * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attachError: js.UndefOr[Input[VolumeError]] = js.undefined
    
    /**
      * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attached: Input[Boolean]
    
    /**
      * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attachmentMetadata: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
      */
    var detachError: js.UndefOr[Input[VolumeError]] = js.undefined
  }
  object VolumeAttachmentStatus {
    
    inline def apply(attached: Input[Boolean]): VolumeAttachmentStatus = {
      val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachmentStatus]
    }
    
    extension [Self <: VolumeAttachmentStatus](x: Self) {
      
      inline def setAttachError(value: Input[VolumeError]): Self = StObject.set(x, "attachError", value.asInstanceOf[js.Any])
      
      inline def setAttachErrorUndefined: Self = StObject.set(x, "attachError", js.undefined)
      
      inline def setAttached(value: Input[Boolean]): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachmentMetadata(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "attachmentMetadata", value.asInstanceOf[js.Any])
      
      inline def setAttachmentMetadataUndefined: Self = StObject.set(x, "attachmentMetadata", js.undefined)
      
      inline def setDetachError(value: Input[VolumeError]): Self = StObject.set(x, "detachError", value.asInstanceOf[js.Any])
      
      inline def setDetachErrorUndefined: Self = StObject.set(x, "detachError", js.undefined)
    }
  }
  
  /**
    * VolumeError captures an error encountered during a volume operation.
    */
  trait VolumeError extends StObject {
    
    /**
      * String detailing the error encountered during Attach or Detach operation. This string maybe logged, so it should not contain sensitive information.
      */
    var message: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Time the error was encountered.
      */
    var time: js.UndefOr[Input[String]] = js.undefined
  }
  object VolumeError {
    
    inline def apply(): VolumeError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeError]
    }
    
    extension [Self <: VolumeError](x: Self) {
      
      inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setTime(value: Input[String]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
