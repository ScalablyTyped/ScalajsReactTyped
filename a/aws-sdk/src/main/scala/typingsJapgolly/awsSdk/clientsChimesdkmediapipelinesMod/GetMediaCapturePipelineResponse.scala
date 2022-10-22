package typingsJapgolly.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMediaCapturePipelineResponse extends StObject {
  
  /**
    * The media pipeline object.
    */
  var MediaCapturePipeline: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmediapipelinesMod.MediaCapturePipeline] = js.undefined
}
object GetMediaCapturePipelineResponse {
  
  inline def apply(): GetMediaCapturePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMediaCapturePipelineResponse]
  }
  
  extension [Self <: GetMediaCapturePipelineResponse](x: Self) {
    
    inline def setMediaCapturePipeline(value: MediaCapturePipeline): Self = StObject.set(x, "MediaCapturePipeline", value.asInstanceOf[js.Any])
    
    inline def setMediaCapturePipelineUndefined: Self = StObject.set(x, "MediaCapturePipeline", js.undefined)
  }
}
