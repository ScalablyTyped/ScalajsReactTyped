package typingsJapgolly.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndPointStateOutput extends StObject {
  
  /**
    * Information about the health of the instances.
    */
  var InstanceStates: js.UndefOr[typingsJapgolly.awsSdk.clientsElbMod.InstanceStates] = js.undefined
}
object DescribeEndPointStateOutput {
  
  inline def apply(): DescribeEndPointStateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndPointStateOutput]
  }
  
  extension [Self <: DescribeEndPointStateOutput](x: Self) {
    
    inline def setInstanceStates(value: InstanceStates): Self = StObject.set(x, "InstanceStates", value.asInstanceOf[js.Any])
    
    inline def setInstanceStatesUndefined: Self = StObject.set(x, "InstanceStates", js.undefined)
    
    inline def setInstanceStatesVarargs(value: InstanceState*): Self = StObject.set(x, "InstanceStates", js.Array(value*))
  }
}
