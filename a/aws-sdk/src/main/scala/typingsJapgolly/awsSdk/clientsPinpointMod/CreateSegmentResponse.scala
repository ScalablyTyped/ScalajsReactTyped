package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSegmentResponse extends StObject {
  
  var SegmentResponse: typingsJapgolly.awsSdk.clientsPinpointMod.SegmentResponse
}
object CreateSegmentResponse {
  
  inline def apply(SegmentResponse: SegmentResponse): CreateSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSegmentResponse]
  }
  
  extension [Self <: CreateSegmentResponse](x: Self) {
    
    inline def setSegmentResponse(value: SegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
  }
}
