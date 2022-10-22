package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherDeleteWatchRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Name
}
object WatcherDeleteWatchRequest {
  
  inline def apply(id: Name): WatcherDeleteWatchRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherDeleteWatchRequest]
  }
  
  extension [Self <: WatcherDeleteWatchRequest](x: Self) {
    
    inline def setId(value: Name): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
