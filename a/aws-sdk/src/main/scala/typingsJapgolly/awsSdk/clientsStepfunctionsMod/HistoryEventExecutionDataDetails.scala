package typingsJapgolly.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryEventExecutionDataDetails extends StObject {
  
  /**
    * Indicates whether input or output was truncated in the response. Always false for API calls.
    */
  var truncated: js.UndefOr[typingsJapgolly.awsSdk.clientsStepfunctionsMod.truncated] = js.undefined
}
object HistoryEventExecutionDataDetails {
  
  inline def apply(): HistoryEventExecutionDataDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryEventExecutionDataDetails]
  }
  
  extension [Self <: HistoryEventExecutionDataDetails](x: Self) {
    
    inline def setTruncated(value: truncated): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
  }
}
