package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * volumeDevice describes a mapping of a raw block device within a container.
  */
trait VolumeDevicePatch extends StObject {
  
  /**
    * devicePath is the path inside of the container that the device will be mapped to.
    */
  var devicePath: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * name must match the name of a persistentVolumeClaim in the pod
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}
object VolumeDevicePatch {
  
  inline def apply(): VolumeDevicePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeDevicePatch]
  }
  
  extension [Self <: VolumeDevicePatch](x: Self) {
    
    inline def setDevicePath(value: Input[String]): Self = StObject.set(x, "devicePath", value.asInstanceOf[js.Any])
    
    inline def setDevicePathUndefined: Self = StObject.set(x, "devicePath", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
