package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherGetWatchRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Name
}
object WatcherGetWatchRequest {
  
  inline def apply(id: Name): WatcherGetWatchRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherGetWatchRequest]
  }
  
  extension [Self <: WatcherGetWatchRequest](x: Self) {
    
    inline def setId(value: Name): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
