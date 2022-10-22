package typingsJapgolly.itunesconnectanalytics.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestTask extends StObject {
  
  def completed(error: js.Error, body: String): Unit
  
  var query: String
}
object RequestTask {
  
  inline def apply(completed: (js.Error, String) => Callback, query: String): RequestTask = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2((t0: js.Error, t1: String) => (completed(t0, t1)).runNow()), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTask]
  }
  
  extension [Self <: RequestTask](x: Self) {
    
    inline def setCompleted(value: (js.Error, String) => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: js.Error, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
