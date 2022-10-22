package typingsJapgolly.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineStatusResponse extends StObject {
  
  /**
    * A section of the response body that provides information about the pipeline.
    */
  var Pipeline: js.UndefOr[typingsJapgolly.awsSdk.clientsElastictranscoderMod.Pipeline] = js.undefined
}
object UpdatePipelineStatusResponse {
  
  inline def apply(): UpdatePipelineStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipelineStatusResponse]
  }
  
  extension [Self <: UpdatePipelineStatusResponse](x: Self) {
    
    inline def setPipeline(value: Pipeline): Self = StObject.set(x, "Pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "Pipeline", js.undefined)
  }
}
