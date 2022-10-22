package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var limits: js.UndefOr[Input[js.Array[Input[LimitRangeItemPatch]]]] = js.undefined
}
object LimitRangeSpecPatch {
  
  inline def apply(): LimitRangeSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LimitRangeSpecPatch]
  }
  
  extension [Self <: LimitRangeSpecPatch](x: Self) {
    
    inline def setLimits(value: Input[js.Array[Input[LimitRangeItemPatch]]]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setLimitsVarargs(value: Input[LimitRangeItemPatch]*): Self = StObject.set(x, "limits", js.Array(value*))
  }
}
