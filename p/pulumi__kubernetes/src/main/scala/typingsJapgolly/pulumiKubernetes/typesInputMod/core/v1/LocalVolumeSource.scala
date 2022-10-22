package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * path of the full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).
    */
  var path: Input[String]
}
object LocalVolumeSource {
  
  inline def apply(path: Input[String]): LocalVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVolumeSource]
  }
  
  extension [Self <: LocalVolumeSource](x: Self) {
    
    inline def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
