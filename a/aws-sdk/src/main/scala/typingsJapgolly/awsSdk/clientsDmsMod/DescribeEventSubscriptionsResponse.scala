package typingsJapgolly.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventSubscriptionsResponse extends StObject {
  
  /**
    * A list of event subscriptions.
    */
  var EventSubscriptionsList: js.UndefOr[typingsJapgolly.awsSdk.clientsDmsMod.EventSubscriptionsList] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DescribeEventSubscriptionsResponse {
  
  inline def apply(): DescribeEventSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventSubscriptionsResponse]
  }
  
  extension [Self <: DescribeEventSubscriptionsResponse](x: Self) {
    
    inline def setEventSubscriptionsList(value: EventSubscriptionsList): Self = StObject.set(x, "EventSubscriptionsList", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionsListUndefined: Self = StObject.set(x, "EventSubscriptionsList", js.undefined)
    
    inline def setEventSubscriptionsListVarargs(value: EventSubscription*): Self = StObject.set(x, "EventSubscriptionsList", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
