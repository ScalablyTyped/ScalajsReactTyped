package typingsJapgolly.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscriptionsResponse extends StObject {
  
  /** If not empty, indicates that there may be more subscriptions that match the request; this value should be passed in a new `ListSubscriptionsRequest` to get more subscriptions. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The subscriptions that match the request. */
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.undefined
}
object ListSubscriptionsResponse {
  
  inline def apply(): ListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionsResponse]
  }
  
  extension [Self <: ListSubscriptionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSubscriptions(value: js.Array[Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
  }
}
