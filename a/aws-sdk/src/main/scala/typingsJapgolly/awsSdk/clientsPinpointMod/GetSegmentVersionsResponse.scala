package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentVersionsResponse extends StObject {
  
  var SegmentsResponse: typingsJapgolly.awsSdk.clientsPinpointMod.SegmentsResponse
}
object GetSegmentVersionsResponse {
  
  inline def apply(SegmentsResponse: SegmentsResponse): GetSegmentVersionsResponse = {
    val __obj = js.Dynamic.literal(SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentVersionsResponse]
  }
  
  extension [Self <: GetSegmentVersionsResponse](x: Self) {
    
    inline def setSegmentsResponse(value: SegmentsResponse): Self = StObject.set(x, "SegmentsResponse", value.asInstanceOf[js.Any])
  }
}
