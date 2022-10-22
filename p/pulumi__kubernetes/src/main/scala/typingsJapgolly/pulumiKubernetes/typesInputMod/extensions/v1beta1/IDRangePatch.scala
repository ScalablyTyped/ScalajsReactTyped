package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IDRange provides a min/max of an allowed range of IDs. Deprecated: use IDRange from policy API Group instead.
  */
trait IDRangePatch extends StObject {
  
  /**
    * max is the end of the range, inclusive.
    */
  var max: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * min is the start of the range, inclusive.
    */
  var min: js.UndefOr[Input[Double]] = js.undefined
}
object IDRangePatch {
  
  inline def apply(): IDRangePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDRangePatch]
  }
  
  extension [Self <: IDRangePatch](x: Self) {
    
    inline def setMax(value: Input[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Input[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
