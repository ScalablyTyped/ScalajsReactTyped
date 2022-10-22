package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a StorageOS persistent volume resource.
  */
trait StorageOSPersistentVolumeSource extends StObject {
  
  /**
    * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * secretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
    */
  var secretRef: js.UndefOr[Input[ObjectReference]] = js.undefined
  
  /**
    * volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
    */
  var volumeName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
    */
  var volumeNamespace: js.UndefOr[Input[String]] = js.undefined
}
object StorageOSPersistentVolumeSource {
  
  inline def apply(): StorageOSPersistentVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageOSPersistentVolumeSource]
  }
  
  extension [Self <: StorageOSPersistentVolumeSource](x: Self) {
    
    inline def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSecretRef(value: Input[ObjectReference]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
    
    inline def setVolumeName(value: Input[String]): Self = StObject.set(x, "volumeName", value.asInstanceOf[js.Any])
    
    inline def setVolumeNameUndefined: Self = StObject.set(x, "volumeName", js.undefined)
    
    inline def setVolumeNamespace(value: Input[String]): Self = StObject.set(x, "volumeNamespace", value.asInstanceOf[js.Any])
    
    inline def setVolumeNamespaceUndefined: Self = StObject.set(x, "volumeNamespace", js.undefined)
  }
}
