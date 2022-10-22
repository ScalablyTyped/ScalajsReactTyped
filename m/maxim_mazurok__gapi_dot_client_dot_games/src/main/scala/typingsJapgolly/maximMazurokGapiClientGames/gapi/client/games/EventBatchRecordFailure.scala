package typingsJapgolly.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBatchRecordFailure extends StObject {
  
  /** The cause for the update failure. */
  var failureCause: js.UndefOr[String] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventBatchRecordFailure`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The time range which was rejected; empty for a request-wide failure. */
  var range: js.UndefOr[EventPeriodRange] = js.undefined
}
object EventBatchRecordFailure {
  
  inline def apply(): EventBatchRecordFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventBatchRecordFailure]
  }
  
  extension [Self <: EventBatchRecordFailure](x: Self) {
    
    inline def setFailureCause(value: String): Self = StObject.set(x, "failureCause", value.asInstanceOf[js.Any])
    
    inline def setFailureCauseUndefined: Self = StObject.set(x, "failureCause", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRange(value: EventPeriodRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
