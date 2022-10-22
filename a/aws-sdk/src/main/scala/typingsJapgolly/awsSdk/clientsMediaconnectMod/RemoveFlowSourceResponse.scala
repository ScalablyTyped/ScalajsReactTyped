package typingsJapgolly.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFlowSourceResponse extends StObject {
  
  /**
    * The ARN of the flow that is associated with the source you removed.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the source that was removed.
    */
  var SourceArn: js.UndefOr[string] = js.undefined
}
object RemoveFlowSourceResponse {
  
  inline def apply(): RemoveFlowSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFlowSourceResponse]
  }
  
  extension [Self <: RemoveFlowSourceResponse](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setSourceArn(value: string): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
  }
}
