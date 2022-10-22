package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

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
  var defaultMode: Double
  
  /**
    * sources is the list of volume projections
    */
  var sources: js.Array[VolumeProjectionPatch]
}
object ProjectedVolumeSourcePatch {
  
  inline def apply(defaultMode: Double, sources: js.Array[VolumeProjectionPatch]): ProjectedVolumeSourcePatch = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectedVolumeSourcePatch]
  }
  
  extension [Self <: ProjectedVolumeSourcePatch](x: Self) {
    
    inline def setDefaultMode(value: Double): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    inline def setSources(value: js.Array[VolumeProjectionPatch]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: VolumeProjectionPatch*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
