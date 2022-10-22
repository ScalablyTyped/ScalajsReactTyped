package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a vSphere volume resource.
  */
trait VsphereVirtualDiskVolumeSourcePatch extends StObject {
  
  /**
    * fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String
  
  /**
    * storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
    */
  var storagePolicyID: String
  
  /**
    * storagePolicyName is the storage Policy Based Management (SPBM) profile name.
    */
  var storagePolicyName: String
  
  /**
    * volumePath is the path that identifies vSphere volume vmdk
    */
  var volumePath: String
}
object VsphereVirtualDiskVolumeSourcePatch {
  
  inline def apply(fsType: String, storagePolicyID: String, storagePolicyName: String, volumePath: String): VsphereVirtualDiskVolumeSourcePatch = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], storagePolicyID = storagePolicyID.asInstanceOf[js.Any], storagePolicyName = storagePolicyName.asInstanceOf[js.Any], volumePath = volumePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[VsphereVirtualDiskVolumeSourcePatch]
  }
  
  extension [Self <: VsphereVirtualDiskVolumeSourcePatch](x: Self) {
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setStoragePolicyID(value: String): Self = StObject.set(x, "storagePolicyID", value.asInstanceOf[js.Any])
    
    inline def setStoragePolicyName(value: String): Self = StObject.set(x, "storagePolicyName", value.asInstanceOf[js.Any])
    
    inline def setVolumePath(value: String): Self = StObject.set(x, "volumePath", value.asInstanceOf[js.Any])
  }
}
