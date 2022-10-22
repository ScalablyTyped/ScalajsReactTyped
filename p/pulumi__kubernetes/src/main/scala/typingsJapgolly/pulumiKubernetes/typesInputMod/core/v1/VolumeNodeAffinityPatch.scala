package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
  */
trait VolumeNodeAffinityPatch extends StObject {
  
  /**
    * required specifies hard node constraints that must be met.
    */
  var required: js.UndefOr[Input[NodeSelectorPatch]] = js.undefined
}
object VolumeNodeAffinityPatch {
  
  inline def apply(): VolumeNodeAffinityPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeNodeAffinityPatch]
  }
  
  extension [Self <: VolumeNodeAffinityPatch](x: Self) {
    
    inline def setRequired(value: Input[NodeSelectorPatch]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
