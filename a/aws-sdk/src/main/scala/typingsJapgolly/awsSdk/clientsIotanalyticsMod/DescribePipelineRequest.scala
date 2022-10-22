package typingsJapgolly.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipelineRequest extends StObject {
  
  /**
    * The name of the pipeline whose information is retrieved.
    */
  var pipelineName: PipelineName
}
object DescribePipelineRequest {
  
  inline def apply(pipelineName: PipelineName): DescribePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelineRequest]
  }
  
  extension [Self <: DescribePipelineRequest](x: Self) {
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
  }
}
