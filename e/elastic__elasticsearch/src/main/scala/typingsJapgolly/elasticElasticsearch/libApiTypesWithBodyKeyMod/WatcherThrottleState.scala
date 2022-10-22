package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherThrottleState extends StObject {
  
  var reason: String
  
  var timestamp: DateTime
}
object WatcherThrottleState {
  
  inline def apply(reason: String, timestamp: DateTime): WatcherThrottleState = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherThrottleState]
  }
  
  extension [Self <: WatcherThrottleState](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: DateTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
