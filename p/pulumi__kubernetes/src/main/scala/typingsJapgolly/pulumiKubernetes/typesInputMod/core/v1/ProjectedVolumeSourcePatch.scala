package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a projected volume source
  */
trait ProjectedVolumeSourcePatch extends StObject {
  
  /**
    * defaultMode are the mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var defaultMode: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * sources is the list of volume projections
    */
  var sources: js.UndefOr[Input[js.Array[Input[VolumeProjectionPatch]]]] = js.undefined
}
object ProjectedVolumeSourcePatch {
  
  inline def apply(): ProjectedVolumeSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectedVolumeSourcePatch]
  }
  
  extension [Self <: ProjectedVolumeSourcePatch](x: Self) {
    
    inline def setDefaultMode(value: Input[Double]): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultModeUndefined: Self = StObject.set(x, "defaultMode", js.undefined)
    
    inline def setSources(value: Input[js.Array[Input[VolumeProjectionPatch]]]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Input[VolumeProjectionPatch]*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
