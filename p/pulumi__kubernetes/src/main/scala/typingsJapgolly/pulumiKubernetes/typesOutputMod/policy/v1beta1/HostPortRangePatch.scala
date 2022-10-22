package typingsJapgolly.pulumiKubernetes.typesOutputMod.policy.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.  It requires both the start and end to be defined.
  */
trait HostPortRangePatch extends StObject {
  
  /**
    * max is the end of the range, inclusive.
    */
  var max: Double
  
  /**
    * min is the start of the range, inclusive.
    */
  var min: Double
}
object HostPortRangePatch {
  
  inline def apply(max: Double, min: Double): HostPortRangePatch = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostPortRangePatch]
  }
  
  extension [Self <: HostPortRangePatch](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
