package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
  */
trait DownwardAPIProjectionPatch extends StObject {
  
  /**
    * Items is a list of DownwardAPIVolume file
    */
  var items: js.Array[DownwardAPIVolumeFilePatch]
}
object DownwardAPIProjectionPatch {
  
  inline def apply(items: js.Array[DownwardAPIVolumeFilePatch]): DownwardAPIProjectionPatch = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownwardAPIProjectionPatch]
  }
  
  extension [Self <: DownwardAPIProjectionPatch](x: Self) {
    
    inline def setItems(value: js.Array[DownwardAPIVolumeFilePatch]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DownwardAPIVolumeFilePatch*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
