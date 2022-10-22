package typingsJapgolly.microsoftGraph.mod.CallRecords

import typingsJapgolly.microsoftGraph.mod.Entity
import typingsJapgolly.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session
  extends StObject
     with Entity {
  
  // Endpoint that answered the session.
  var callee: js.UndefOr[NullableOption[Endpoint]] = js.undefined
  
  // Endpoint that initiated the session.
  var caller: js.UndefOr[NullableOption[Endpoint]] = js.undefined
  
  /**
    * UTC time when the last user left the session. The DateTimeOffset type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var endDateTime: js.UndefOr[String] = js.undefined
  
  // Failure information associated with the session if the session failed.
  var failureInfo: js.UndefOr[NullableOption[FailureInfo]] = js.undefined
  
  /**
    * List of modalities present in the session. Possible values are: unknown, audio, video, videoBasedScreenSharing, data,
    * screenSharing, unknownFutureValue.
    */
  var modalities: js.UndefOr[js.Array[Modality]] = js.undefined
  
  // The list of segments involved in the session. Read-only. Nullable.
  var segments: js.UndefOr[NullableOption[js.Array[Segment]]] = js.undefined
  
  /**
    * UTC time when the first user joined the session. The DateTimeOffset type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var startDateTime: js.UndefOr[String] = js.undefined
}
object Session {
  
  inline def apply(): Session = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Session]
  }
  
  extension [Self <: Session](x: Self) {
    
    inline def setCallee(value: NullableOption[Endpoint]): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setCalleeNull: Self = StObject.set(x, "callee", null)
    
    inline def setCalleeUndefined: Self = StObject.set(x, "callee", js.undefined)
    
    inline def setCaller(value: NullableOption[Endpoint]): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerNull: Self = StObject.set(x, "caller", null)
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setEndDateTime(value: String): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setFailureInfo(value: NullableOption[FailureInfo]): Self = StObject.set(x, "failureInfo", value.asInstanceOf[js.Any])
    
    inline def setFailureInfoNull: Self = StObject.set(x, "failureInfo", null)
    
    inline def setFailureInfoUndefined: Self = StObject.set(x, "failureInfo", js.undefined)
    
    inline def setModalities(value: js.Array[Modality]): Self = StObject.set(x, "modalities", value.asInstanceOf[js.Any])
    
    inline def setModalitiesUndefined: Self = StObject.set(x, "modalities", js.undefined)
    
    inline def setModalitiesVarargs(value: Modality*): Self = StObject.set(x, "modalities", js.Array(value*))
    
    inline def setSegments(value: NullableOption[js.Array[Segment]]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsNull: Self = StObject.set(x, "segments", null)
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
