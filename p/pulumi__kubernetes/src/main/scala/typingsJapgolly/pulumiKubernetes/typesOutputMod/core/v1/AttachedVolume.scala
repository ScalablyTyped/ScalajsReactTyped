package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AttachedVolume describes a volume attached to a node
  */
trait AttachedVolume extends StObject {
  
  /**
    * DevicePath represents the device path where the volume should be available
    */
  var devicePath: String
  
  /**
    * Name of the attached volume
    */
  var name: String
}
object AttachedVolume {
  
  inline def apply(devicePath: String, name: String): AttachedVolume = {
    val __obj = js.Dynamic.literal(devicePath = devicePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedVolume]
  }
  
  extension [Self <: AttachedVolume](x: Self) {
    
    inline def setDevicePath(value: String): Self = StObject.set(x, "devicePath", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
