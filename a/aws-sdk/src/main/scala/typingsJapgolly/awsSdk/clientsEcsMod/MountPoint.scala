package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountPoint extends StObject {
  
  /**
    * The path on the container to mount the host volume at.
    */
  var containerPath: js.UndefOr[String] = js.undefined
  
  /**
    * If this value is true, the container has read-only access to the volume. If this value is false, then the container can write to the volume. The default value is false.
    */
  var readOnly: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The name of the volume to mount. Must be a volume name referenced in the name parameter of task definition volume.
    */
  var sourceVolume: js.UndefOr[String] = js.undefined
}
object MountPoint {
  
  inline def apply(): MountPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountPoint]
  }
  
  extension [Self <: MountPoint](x: Self) {
    
    inline def setContainerPath(value: String): Self = StObject.set(x, "containerPath", value.asInstanceOf[js.Any])
    
    inline def setContainerPathUndefined: Self = StObject.set(x, "containerPath", js.undefined)
    
    inline def setReadOnly(value: BoxedBoolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSourceVolume(value: String): Self = StObject.set(x, "sourceVolume", value.asInstanceOf[js.Any])
    
    inline def setSourceVolumeUndefined: Self = StObject.set(x, "sourceVolume", js.undefined)
  }
}
