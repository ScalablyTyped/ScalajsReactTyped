package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
  */
trait FCVolumeSourcePatch extends StObject {
  
  /**
    * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String
  
  /**
    * lun is Optional: FC target lun number
    */
  var lun: Double
  
  /**
    * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean
  
  /**
    * targetWWNs is Optional: FC target worldwide names (WWNs)
    */
  var targetWWNs: js.Array[String]
  
  /**
    * wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
    */
  var wwids: js.Array[String]
}
object FCVolumeSourcePatch {
  
  inline def apply(
    fsType: String,
    lun: Double,
    readOnly: Boolean,
    targetWWNs: js.Array[String],
    wwids: js.Array[String]
  ): FCVolumeSourcePatch = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], targetWWNs = targetWWNs.asInstanceOf[js.Any], wwids = wwids.asInstanceOf[js.Any])
    __obj.asInstanceOf[FCVolumeSourcePatch]
  }
  
  extension [Self <: FCVolumeSourcePatch](x: Self) {
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setLun(value: Double): Self = StObject.set(x, "lun", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setTargetWWNs(value: js.Array[String]): Self = StObject.set(x, "targetWWNs", value.asInstanceOf[js.Any])
    
    inline def setTargetWWNsVarargs(value: String*): Self = StObject.set(x, "targetWWNs", js.Array(value*))
    
    inline def setWwids(value: js.Array[String]): Self = StObject.set(x, "wwids", value.asInstanceOf[js.Any])
    
    inline def setWwidsVarargs(value: String*): Self = StObject.set(x, "wwids", js.Array(value*))
  }
}
