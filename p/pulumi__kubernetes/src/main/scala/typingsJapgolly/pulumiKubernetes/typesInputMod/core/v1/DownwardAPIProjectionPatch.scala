package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var items: js.UndefOr[Input[js.Array[Input[DownwardAPIVolumeFilePatch]]]] = js.undefined
}
object DownwardAPIProjectionPatch {
  
  inline def apply(): DownwardAPIProjectionPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownwardAPIProjectionPatch]
  }
  
  extension [Self <: DownwardAPIProjectionPatch](x: Self) {
    
    inline def setItems(value: Input[js.Array[Input[DownwardAPIVolumeFilePatch]]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Input[DownwardAPIVolumeFilePatch]*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
