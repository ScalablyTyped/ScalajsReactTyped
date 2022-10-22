package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Local represents directly-attached storage with node affinity (Beta feature)
  */
trait LocalVolumeSource extends StObject {
  
  /**
    * fsType is the filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default value is to auto-select a filesystem if unspecified.
    */
  var fsType: String
  
  /**
    * path of the full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).
    */
  var path: String
}
object LocalVolumeSource {
  
  inline def apply(fsType: String, path: String): LocalVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVolumeSource]
  }
  
  extension [Self <: LocalVolumeSource](x: Self) {
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
