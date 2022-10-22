package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformDevice extends StObject {
  
  /**
    * The ID for the GPUs on the container instance. The available GPU IDs can also be obtained on the container instance in the /var/lib/ecs/gpu/nvidia_gpu_info.json file.
    */
  var id: String
  
  /**
    * The type of device that's available on the container instance. The only supported value is GPU.
    */
  var `type`: PlatformDeviceType
}
object PlatformDevice {
  
  inline def apply(id: String, `type`: PlatformDeviceType): PlatformDevice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformDevice]
  }
  
  extension [Self <: PlatformDevice](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: PlatformDeviceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
