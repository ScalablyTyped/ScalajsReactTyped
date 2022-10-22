package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a source location of a volume to mount, managed by an external CSI driver
  */
trait CSIVolumeSourcePatch extends StObject {
  
  /**
    * driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
    */
  var driver: String
  
  /**
    * fsType to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
    */
  var fsType: String
  
  /**
    * nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
    */
  var nodePublishSecretRef: LocalObjectReferencePatch
  
  /**
    * readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
    */
  var readOnly: Boolean
  
  /**
    * volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.
    */
  var volumeAttributes: StringDictionary[String]
}
object CSIVolumeSourcePatch {
  
  inline def apply(
    driver: String,
    fsType: String,
    nodePublishSecretRef: LocalObjectReferencePatch,
    readOnly: Boolean,
    volumeAttributes: StringDictionary[String]
  ): CSIVolumeSourcePatch = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], nodePublishSecretRef = nodePublishSecretRef.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], volumeAttributes = volumeAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIVolumeSourcePatch]
  }
  
  extension [Self <: CSIVolumeSourcePatch](x: Self) {
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setNodePublishSecretRef(value: LocalObjectReferencePatch): Self = StObject.set(x, "nodePublishSecretRef", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setVolumeAttributes(value: StringDictionary[String]): Self = StObject.set(x, "volumeAttributes", value.asInstanceOf[js.Any])
  }
}
