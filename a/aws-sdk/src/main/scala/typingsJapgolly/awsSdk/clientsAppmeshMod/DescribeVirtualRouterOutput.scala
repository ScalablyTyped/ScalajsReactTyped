package typingsJapgolly.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVirtualRouterOutput extends StObject {
  
  /**
    * The full description of your virtual router.
    */
  var virtualRouter: VirtualRouterData
}
object DescribeVirtualRouterOutput {
  
  inline def apply(virtualRouter: VirtualRouterData): DescribeVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualRouterOutput]
  }
  
  extension [Self <: DescribeVirtualRouterOutput](x: Self) {
    
    inline def setVirtualRouter(value: VirtualRouterData): Self = StObject.set(x, "virtualRouter", value.asInstanceOf[js.Any])
  }
}
