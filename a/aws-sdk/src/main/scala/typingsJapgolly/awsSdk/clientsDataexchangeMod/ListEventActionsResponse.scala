package typingsJapgolly.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventActionsResponse extends StObject {
  
  /**
    * The event action objects listed by the request.
    */
  var EventActions: js.UndefOr[ListOfEventActionEntry] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsDataexchangeMod.NextToken] = js.undefined
}
object ListEventActionsResponse {
  
  inline def apply(): ListEventActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventActionsResponse]
  }
  
  extension [Self <: ListEventActionsResponse](x: Self) {
    
    inline def setEventActions(value: ListOfEventActionEntry): Self = StObject.set(x, "EventActions", value.asInstanceOf[js.Any])
    
    inline def setEventActionsUndefined: Self = StObject.set(x, "EventActions", js.undefined)
    
    inline def setEventActionsVarargs(value: EventActionEntry*): Self = StObject.set(x, "EventActions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
