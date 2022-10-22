package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
  */
trait LimitRangeSpecPatch extends StObject {
  
  /**
    * Limits is the list of LimitRangeItem objects that are enforced.
    */
  var limits: js.Array[LimitRangeItemPatch]
}
object LimitRangeSpecPatch {
  
  inline def apply(limits: js.Array[LimitRangeItemPatch]): LimitRangeSpecPatch = {
    val __obj = js.Dynamic.literal(limits = limits.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitRangeSpecPatch]
  }
  
  extension [Self <: LimitRangeSpecPatch](x: Self) {
    
    inline def setLimits(value: js.Array[LimitRangeItemPatch]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsVarargs(value: LimitRangeItemPatch*): Self = StObject.set(x, "limits", js.Array(value*))
  }
}
