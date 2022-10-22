package typingsJapgolly.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFlowRequest extends StObject {
  
  /**
    * The ARN of the flow that you want to delete.
    */
  var FlowArn: string
}
object DeleteFlowRequest {
  
  inline def apply(FlowArn: string): DeleteFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowRequest]
  }
  
  extension [Self <: DeleteFlowRequest](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
  }
}
