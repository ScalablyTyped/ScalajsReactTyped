package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

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
  var required: NodeSelectorPatch
}
object VolumeNodeAffinityPatch {
  
  inline def apply(required: NodeSelectorPatch): VolumeNodeAffinityPatch = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeNodeAffinityPatch]
  }
  
  extension [Self <: VolumeNodeAffinityPatch](x: Self) {
    
    inline def setRequired(value: NodeSelectorPatch): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
