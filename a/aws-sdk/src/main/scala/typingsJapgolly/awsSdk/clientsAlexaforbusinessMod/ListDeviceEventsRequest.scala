package typingsJapgolly.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceEventsRequest extends StObject {
  
  /**
    * The ARN of a device.
    */
  var DeviceArn: Arn
  
  /**
    * The event type to filter device events. If EventType isn't specified, this returns a list of all device events in reverse chronological order. If EventType is specified, this returns a list of device events for that EventType in reverse chronological order. 
    */
  var EventType: js.UndefOr[DeviceEventType] = js.undefined
  
  /**
    * The maximum number of results to include in the response. The default value is 50. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.MaxResults] = js.undefined
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response only includes results beyond the token, up to the value specified by MaxResults. When the end of results is reached, the response has a value of null.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}
object ListDeviceEventsRequest {
  
  inline def apply(DeviceArn: Arn): ListDeviceEventsRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceEventsRequest]
  }
  
  extension [Self <: ListDeviceEventsRequest](x: Self) {
    
    inline def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: DeviceEventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
