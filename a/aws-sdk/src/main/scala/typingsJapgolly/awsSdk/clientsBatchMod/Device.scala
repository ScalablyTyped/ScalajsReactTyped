package typingsJapgolly.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  /**
    * The path inside the container that's used to expose the host device. By default, the hostPath value is used.
    */
  var containerPath: js.UndefOr[String] = js.undefined
  
  /**
    * The path for the device on the host container instance.
    */
  var hostPath: String
  
  /**
    * The explicit permissions to provide to the container for the device. By default, the container has permissions for read, write, and mknod for the device.
    */
  var permissions: js.UndefOr[DeviceCgroupPermissions] = js.undefined
}
object Device {
  
  inline def apply(hostPath: String): Device = {
    val __obj = js.Dynamic.literal(hostPath = hostPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setContainerPath(value: String): Self = StObject.set(x, "containerPath", value.asInstanceOf[js.Any])
    
    inline def setContainerPathUndefined: Self = StObject.set(x, "containerPath", js.undefined)
    
    inline def setHostPath(value: String): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: DeviceCgroupPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: DeviceCgroupPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
