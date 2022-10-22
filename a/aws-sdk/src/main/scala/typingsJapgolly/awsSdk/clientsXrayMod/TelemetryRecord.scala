package typingsJapgolly.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelemetryRecord extends StObject {
  
  /**
    * 
    */
  var BackendConnectionErrors: js.UndefOr[typingsJapgolly.awsSdk.clientsXrayMod.BackendConnectionErrors] = js.undefined
  
  /**
    * 
    */
  var SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * 
    */
  var SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * 
    */
  var SegmentsSentCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * 
    */
  var SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * 
    */
  var Timestamp: js.Date
}
object TelemetryRecord {
  
  inline def apply(Timestamp: js.Date): TelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryRecord]
  }
  
  extension [Self <: TelemetryRecord](x: Self) {
    
    inline def setBackendConnectionErrors(value: BackendConnectionErrors): Self = StObject.set(x, "BackendConnectionErrors", value.asInstanceOf[js.Any])
    
    inline def setBackendConnectionErrorsUndefined: Self = StObject.set(x, "BackendConnectionErrors", js.undefined)
    
    inline def setSegmentsReceivedCount(value: NullableInteger): Self = StObject.set(x, "SegmentsReceivedCount", value.asInstanceOf[js.Any])
    
    inline def setSegmentsReceivedCountUndefined: Self = StObject.set(x, "SegmentsReceivedCount", js.undefined)
    
    inline def setSegmentsRejectedCount(value: NullableInteger): Self = StObject.set(x, "SegmentsRejectedCount", value.asInstanceOf[js.Any])
    
    inline def setSegmentsRejectedCountUndefined: Self = StObject.set(x, "SegmentsRejectedCount", js.undefined)
    
    inline def setSegmentsSentCount(value: NullableInteger): Self = StObject.set(x, "SegmentsSentCount", value.asInstanceOf[js.Any])
    
    inline def setSegmentsSentCountUndefined: Self = StObject.set(x, "SegmentsSentCount", js.undefined)
    
    inline def setSegmentsSpilloverCount(value: NullableInteger): Self = StObject.set(x, "SegmentsSpilloverCount", value.asInstanceOf[js.Any])
    
    inline def setSegmentsSpilloverCountUndefined: Self = StObject.set(x, "SegmentsSpilloverCount", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
