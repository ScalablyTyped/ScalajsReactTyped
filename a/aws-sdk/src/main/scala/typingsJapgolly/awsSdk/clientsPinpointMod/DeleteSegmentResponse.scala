package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSegmentResponse extends StObject {
  
  var SegmentResponse: typingsJapgolly.awsSdk.clientsPinpointMod.SegmentResponse
}
object DeleteSegmentResponse {
  
  inline def apply(SegmentResponse: SegmentResponse): DeleteSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSegmentResponse]
  }
  
  extension [Self <: DeleteSegmentResponse](x: Self) {
    
    inline def setSegmentResponse(value: SegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
  }
}
