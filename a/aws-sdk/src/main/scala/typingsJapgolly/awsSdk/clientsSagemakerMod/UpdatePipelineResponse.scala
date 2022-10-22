package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated pipeline.
    */
  var PipelineArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.PipelineArn] = js.undefined
}
object UpdatePipelineResponse {
  
  inline def apply(): UpdatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipelineResponse]
  }
  
  extension [Self <: UpdatePipelineResponse](x: Self) {
    
    inline def setPipelineArn(value: PipelineArn): Self = StObject.set(x, "PipelineArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineArnUndefined: Self = StObject.set(x, "PipelineArn", js.undefined)
  }
}
