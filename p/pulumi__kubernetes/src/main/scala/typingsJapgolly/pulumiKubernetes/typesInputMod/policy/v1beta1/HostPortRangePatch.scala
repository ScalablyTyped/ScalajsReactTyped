package typingsJapgolly.pulumiKubernetes.typesInputMod.policy.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var max: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * min is the start of the range, inclusive.
    */
  var min: js.UndefOr[Input[Double]] = js.undefined
}
object HostPortRangePatch {
  
  inline def apply(): HostPortRangePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostPortRangePatch]
  }
  
  extension [Self <: HostPortRangePatch](x: Self) {
    
    inline def setMax(value: Input[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Input[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
