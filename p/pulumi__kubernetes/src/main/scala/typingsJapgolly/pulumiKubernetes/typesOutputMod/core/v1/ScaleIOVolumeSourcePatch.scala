package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ScaleIOVolumeSource represents a persistent ScaleIO volume
  */
trait ScaleIOVolumeSourcePatch extends StObject {
  
  /**
    * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
    */
  var fsType: String
  
  /**
    * gateway is the host address of the ScaleIO API Gateway.
    */
  var gateway: String
  
  /**
    * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
    */
  var protectionDomain: String
  
  /**
    * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean
  
  /**
    * secretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
    */
  var secretRef: LocalObjectReferencePatch
  
  /**
    * sslEnabled Flag enable/disable SSL communication with Gateway, default false
    */
  var sslEnabled: Boolean
  
  /**
    * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
    */
  var storageMode: String
  
  /**
    * storagePool is the ScaleIO Storage Pool associated with the protection domain.
    */
  var storagePool: String
  
  /**
    * system is the name of the storage system as configured in ScaleIO.
    */
  var system: String
  
  /**
    * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
    */
  var volumeName: String
}
object ScaleIOVolumeSourcePatch {
  
  inline def apply(
    fsType: String,
    gateway: String,
    protectionDomain: String,
    readOnly: Boolean,
    secretRef: LocalObjectReferencePatch,
    sslEnabled: Boolean,
    storageMode: String,
    storagePool: String,
    system: String,
    volumeName: String
  ): ScaleIOVolumeSourcePatch = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], protectionDomain = protectionDomain.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], sslEnabled = sslEnabled.asInstanceOf[js.Any], storageMode = storageMode.asInstanceOf[js.Any], storagePool = storagePool.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], volumeName = volumeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleIOVolumeSourcePatch]
  }
  
  extension [Self <: ScaleIOVolumeSourcePatch](x: Self) {
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setProtectionDomain(value: String): Self = StObject.set(x, "protectionDomain", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setSecretRef(value: LocalObjectReferencePatch): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    inline def setStorageMode(value: String): Self = StObject.set(x, "storageMode", value.asInstanceOf[js.Any])
    
    inline def setStoragePool(value: String): Self = StObject.set(x, "storagePool", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setVolumeName(value: String): Self = StObject.set(x, "volumeName", value.asInstanceOf[js.Any])
  }
}
