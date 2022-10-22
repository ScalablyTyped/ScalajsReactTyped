package typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1VideoSegment extends StObject {
  
  /** Time-offset, relative to the beginning of the video, corresponding to the end of the segment (inclusive). */
  var endTimeOffset: js.UndefOr[String] = js.undefined
  
  /** Time-offset, relative to the beginning of the video, corresponding to the start of the segment (inclusive). */
  var startTimeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1VideoSegment {
  
  inline def apply(): GoogleCloudVideointelligenceV1p3beta1VideoSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1VideoSegment]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p3beta1VideoSegment](x: Self) {
    
    inline def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
