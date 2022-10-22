package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
  */
trait FCVolumeSource extends StObject {
  
  /**
    * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * lun is Optional: FC target lun number
    */
  var lun: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * targetWWNs is Optional: FC target worldwide names (WWNs)
    */
  var targetWWNs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
    */
  var wwids: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object FCVolumeSource {
  
  inline def apply(): FCVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FCVolumeSource]
  }
  
  extension [Self <: FCVolumeSource](x: Self) {
    
    inline def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    inline def setLun(value: Input[Double]): Self = StObject.set(x, "lun", value.asInstanceOf[js.Any])
    
    inline def setLunUndefined: Self = StObject.set(x, "lun", js.undefined)
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setTargetWWNs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "targetWWNs", value.asInstanceOf[js.Any])
    
    inline def setTargetWWNsUndefined: Self = StObject.set(x, "targetWWNs", js.undefined)
    
    inline def setTargetWWNsVarargs(value: Input[String]*): Self = StObject.set(x, "targetWWNs", js.Array(value*))
    
    inline def setWwids(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "wwids", value.asInstanceOf[js.Any])
    
    inline def setWwidsUndefined: Self = StObject.set(x, "wwids", js.undefined)
    
    inline def setWwidsVarargs(value: Input[String]*): Self = StObject.set(x, "wwids", js.Array(value*))
  }
}
