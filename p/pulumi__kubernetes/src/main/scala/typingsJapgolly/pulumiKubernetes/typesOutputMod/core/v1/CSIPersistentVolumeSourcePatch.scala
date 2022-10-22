package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents storage that is managed by an external CSI volume driver (Beta feature)
  */
trait CSIPersistentVolumeSourcePatch extends StObject {
  
  /**
    * controllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an beta field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var controllerExpandSecretRef: SecretReferencePatch
  
  /**
    * controllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var controllerPublishSecretRef: SecretReferencePatch
  
  /**
    * driver is the name of the driver to use for this volume. Required.
    */
  var driver: String
  
  /**
    * fsType to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
    */
  var fsType: String
  
  /**
    * nodeExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeExpandVolume call. This is an alpha field and requires enabling CSINodeExpandSecret feature gate. This field is optional, may be omitted if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var nodeExpandSecretRef: SecretReferencePatch
  
  /**
    * nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var nodePublishSecretRef: SecretReferencePatch
  
  /**
    * nodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var nodeStageSecretRef: SecretReferencePatch
  
  /**
    * readOnly value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
    */
  var readOnly: Boolean
  
  /**
    * volumeAttributes of the volume to publish.
    */
  var volumeAttributes: StringDictionary[String]
  
  /**
    * volumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
    */
  var volumeHandle: String
}
object CSIPersistentVolumeSourcePatch {
  
  inline def apply(
    controllerExpandSecretRef: SecretReferencePatch,
    controllerPublishSecretRef: SecretReferencePatch,
    driver: String,
    fsType: String,
    nodeExpandSecretRef: SecretReferencePatch,
    nodePublishSecretRef: SecretReferencePatch,
    nodeStageSecretRef: SecretReferencePatch,
    readOnly: Boolean,
    volumeAttributes: StringDictionary[String],
    volumeHandle: String
  ): CSIPersistentVolumeSourcePatch = {
    val __obj = js.Dynamic.literal(controllerExpandSecretRef = controllerExpandSecretRef.asInstanceOf[js.Any], controllerPublishSecretRef = controllerPublishSecretRef.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], nodeExpandSecretRef = nodeExpandSecretRef.asInstanceOf[js.Any], nodePublishSecretRef = nodePublishSecretRef.asInstanceOf[js.Any], nodeStageSecretRef = nodeStageSecretRef.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], volumeAttributes = volumeAttributes.asInstanceOf[js.Any], volumeHandle = volumeHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIPersistentVolumeSourcePatch]
  }
  
  extension [Self <: CSIPersistentVolumeSourcePatch](x: Self) {
    
    inline def setControllerExpandSecretRef(value: SecretReferencePatch): Self = StObject.set(x, "controllerExpandSecretRef", value.asInstanceOf[js.Any])
    
    inline def setControllerPublishSecretRef(value: SecretReferencePatch): Self = StObject.set(x, "controllerPublishSecretRef", value.asInstanceOf[js.Any])
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setNodeExpandSecretRef(value: SecretReferencePatch): Self = StObject.set(x, "nodeExpandSecretRef", value.asInstanceOf[js.Any])
    
    inline def setNodePublishSecretRef(value: SecretReferencePatch): Self = StObject.set(x, "nodePublishSecretRef", value.asInstanceOf[js.Any])
    
    inline def setNodeStageSecretRef(value: SecretReferencePatch): Self = StObject.set(x, "nodeStageSecretRef", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setVolumeAttributes(value: StringDictionary[String]): Self = StObject.set(x, "volumeAttributes", value.asInstanceOf[js.Any])
    
    inline def setVolumeHandle(value: String): Self = StObject.set(x, "volumeHandle", value.asInstanceOf[js.Any])
  }
}
