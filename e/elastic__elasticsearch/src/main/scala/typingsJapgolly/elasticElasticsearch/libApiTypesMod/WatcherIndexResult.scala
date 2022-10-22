package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherIndexResult extends StObject {
  
  var response: WatcherIndexResultSummary
}
object WatcherIndexResult {
  
  inline def apply(response: WatcherIndexResultSummary): WatcherIndexResult = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherIndexResult]
  }
  
  extension [Self <: WatcherIndexResult](x: Self) {
    
    inline def setResponse(value: WatcherIndexResultSummary): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
