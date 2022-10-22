package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Photon Controller persistent disk resource.
  */
trait PhotonPersistentDiskVolumeSourcePatch extends StObject {
  
  /**
    * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String
  
  /**
    * pdID is the ID that identifies Photon Controller persistent disk
    */
  var pdID: String
}
object PhotonPersistentDiskVolumeSourcePatch {
  
  inline def apply(fsType: String, pdID: String): PhotonPersistentDiskVolumeSourcePatch = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], pdID = pdID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotonPersistentDiskVolumeSourcePatch]
  }
  
  extension [Self <: PhotonPersistentDiskVolumeSourcePatch](x: Self) {
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setPdID(value: String): Self = StObject.set(x, "pdID", value.asInstanceOf[js.Any])
  }
}
