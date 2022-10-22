package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DownwardAPIVolumeFile represents information to create the file containing the pod field
  */
trait DownwardAPIVolumeFilePatch extends StObject {
  
  /**
    * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
    */
  var fieldRef: js.UndefOr[Input[ObjectFieldSelectorPatch]] = js.undefined
  
  /**
    * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var mode: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
    */
  var resourceFieldRef: js.UndefOr[Input[ResourceFieldSelectorPatch]] = js.undefined
}
object DownwardAPIVolumeFilePatch {
  
  inline def apply(): DownwardAPIVolumeFilePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownwardAPIVolumeFilePatch]
  }
  
  extension [Self <: DownwardAPIVolumeFilePatch](x: Self) {
    
    inline def setFieldRef(value: Input[ObjectFieldSelectorPatch]): Self = StObject.set(x, "fieldRef", value.asInstanceOf[js.Any])
    
    inline def setFieldRefUndefined: Self = StObject.set(x, "fieldRef", js.undefined)
    
    inline def setMode(value: Input[Double]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setResourceFieldRef(value: Input[ResourceFieldSelectorPatch]): Self = StObject.set(x, "resourceFieldRef", value.asInstanceOf[js.Any])
    
    inline def setResourceFieldRefUndefined: Self = StObject.set(x, "resourceFieldRef", js.undefined)
  }
}
