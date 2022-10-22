package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
  */
trait ScaleIOPersistentVolumeSource extends StObject {
  
  /**
    * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs"
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * gateway is the host address of the ScaleIO API Gateway.
    */
  var gateway: Input[String]
  
  /**
    * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
    */
  var protectionDomain: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * secretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
    */
  var secretRef: Input[SecretReference]
  
  /**
    * sslEnabled is the flag to enable/disable SSL communication with Gateway, default false
    */
  var sslEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
    */
  var storageMode: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * storagePool is the ScaleIO Storage Pool associated with the protection domain.
    */
  var storagePool: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * system is the name of the storage system as configured in ScaleIO.
    */
  var system: Input[String]
  
  /**
    * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
    */
  var volumeName: js.UndefOr[Input[String]] = js.undefined
}
object ScaleIOPersistentVolumeSource {
  
  inline def apply(gateway: Input[String], secretRef: Input[SecretReference], system: Input[String]): ScaleIOPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleIOPersistentVolumeSource]
  }
  
  extension [Self <: ScaleIOPersistentVolumeSource](x: Self) {
    
    inline def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    inline def setGateway(value: Input[String]): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setProtectionDomain(value: Input[String]): Self = StObject.set(x, "protectionDomain", value.asInstanceOf[js.Any])
    
    inline def setProtectionDomainUndefined: Self = StObject.set(x, "protectionDomain", js.undefined)
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSecretRef(value: Input[SecretReference]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSslEnabled(value: Input[Boolean]): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    inline def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
    
    inline def setStorageMode(value: Input[String]): Self = StObject.set(x, "storageMode", value.asInstanceOf[js.Any])
    
    inline def setStorageModeUndefined: Self = StObject.set(x, "storageMode", js.undefined)
    
    inline def setStoragePool(value: Input[String]): Self = StObject.set(x, "storagePool", value.asInstanceOf[js.Any])
    
    inline def setStoragePoolUndefined: Self = StObject.set(x, "storagePool", js.undefined)
    
    inline def setSystem(value: Input[String]): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setVolumeName(value: Input[String]): Self = StObject.set(x, "volumeName", value.asInstanceOf[js.Any])
    
    inline def setVolumeNameUndefined: Self = StObject.set(x, "volumeName", js.undefined)
  }
}
