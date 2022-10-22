package typingsJapgolly.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartnerEventSourceAccountsRequest extends StObject {
  
  /**
    * The name of the partner event source to display account information about.
    */
  var EventSourceName: typingsJapgolly.awsSdk.clientsCloudwatcheventsMod.EventSourceName
  
  /**
    * Specifying this limits the number of results returned by this operation. The operation also returns a NextToken which you can use in a subsequent operation to retrieve the next set of results.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  
  /**
    * The token returned by a previous call to this operation. Specifying this retrieves the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudwatcheventsMod.NextToken] = js.undefined
}
object ListPartnerEventSourceAccountsRequest {
  
  inline def apply(EventSourceName: EventSourceName): ListPartnerEventSourceAccountsRequest = {
    val __obj = js.Dynamic.literal(EventSourceName = EventSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartnerEventSourceAccountsRequest]
  }
  
  extension [Self <: ListPartnerEventSourceAccountsRequest](x: Self) {
    
    inline def setEventSourceName(value: EventSourceName): Self = StObject.set(x, "EventSourceName", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: LimitMax100): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
