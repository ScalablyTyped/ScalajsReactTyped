package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingStats extends StObject {
  
  var URI: String
  
  var endpoint: String
  
  def getAveragePayloadSize(topic: String, start: Double, stop: Double, callback: CbCallback): Unit
  
  def getCurrentSubscribers(topic: String, callback: CbCallback): Unit
  
  def getOpenConnections(callback: CbCallback): Unit
  
  var systemKey: String
  
  var user: APIUser
}
object MessagingStats {
  
  inline def apply(
    URI: String,
    endpoint: String,
    getAveragePayloadSize: (String, Double, Double, CbCallback) => Callback,
    getCurrentSubscribers: (String, CbCallback) => Callback,
    getOpenConnections: CbCallback => Callback,
    systemKey: String,
    user: APIUser
  ): MessagingStats = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], getAveragePayloadSize = js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: CbCallback) => (getAveragePayloadSize(t0, t1, t2, t3)).runNow()), getCurrentSubscribers = js.Any.fromFunction2((t0: String, t1: CbCallback) => (getCurrentSubscribers(t0, t1)).runNow()), getOpenConnections = js.Any.fromFunction1((t0: CbCallback) => getOpenConnections(t0).runNow()), systemKey = systemKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingStats]
  }
  
  extension [Self <: MessagingStats](x: Self) {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setGetAveragePayloadSize(value: (String, Double, Double, CbCallback) => Callback): Self = StObject.set(x, "getAveragePayloadSize", js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: CbCallback) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setGetCurrentSubscribers(value: (String, CbCallback) => Callback): Self = StObject.set(x, "getCurrentSubscribers", js.Any.fromFunction2((t0: String, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setGetOpenConnections(value: CbCallback => Callback): Self = StObject.set(x, "getOpenConnections", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
