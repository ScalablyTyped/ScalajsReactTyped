package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVolumeResult extends StObject {
  
  /**
    * Information about the volume modification.
    */
  var VolumeModification: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.VolumeModification] = js.undefined
}
object ModifyVolumeResult {
  
  inline def apply(): ModifyVolumeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVolumeResult]
  }
  
  extension [Self <: ModifyVolumeResult](x: Self) {
    
    inline def setVolumeModification(value: VolumeModification): Self = StObject.set(x, "VolumeModification", value.asInstanceOf[js.Any])
    
    inline def setVolumeModificationUndefined: Self = StObject.set(x, "VolumeModification", js.undefined)
  }
}
