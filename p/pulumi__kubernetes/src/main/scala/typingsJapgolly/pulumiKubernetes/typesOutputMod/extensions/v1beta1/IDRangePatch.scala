package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

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
  var max: Double
  
  /**
    * min is the start of the range, inclusive.
    */
  var min: Double
}
object IDRangePatch {
  
  inline def apply(max: Double, min: Double): IDRangePatch = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDRangePatch]
  }
  
  extension [Self <: IDRangePatch](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
