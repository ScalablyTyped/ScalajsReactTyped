package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * pdID is the ID that identifies Photon Controller persistent disk
    */
  var pdID: js.UndefOr[Input[String]] = js.undefined
}
object PhotonPersistentDiskVolumeSourcePatch {
  
  inline def apply(): PhotonPersistentDiskVolumeSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotonPersistentDiskVolumeSourcePatch]
  }
  
  extension [Self <: PhotonPersistentDiskVolumeSourcePatch](x: Self) {
    
    inline def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    inline def setPdID(value: Input[String]): Self = StObject.set(x, "pdID", value.asInstanceOf[js.Any])
    
    inline def setPdIDUndefined: Self = StObject.set(x, "pdID", js.undefined)
  }
}
