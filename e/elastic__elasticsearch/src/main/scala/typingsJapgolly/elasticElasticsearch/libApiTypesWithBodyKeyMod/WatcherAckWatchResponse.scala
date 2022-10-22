package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherAckWatchResponse extends StObject {
  
  var status: WatcherWatchStatus
}
object WatcherAckWatchResponse {
  
  inline def apply(status: WatcherWatchStatus): WatcherAckWatchResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherAckWatchResponse]
  }
  
  extension [Self <: WatcherAckWatchResponse](x: Self) {
    
    inline def setStatus(value: WatcherWatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
