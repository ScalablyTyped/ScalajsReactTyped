package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.search.QueryInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofsearch extends StObject {
  
  def query(options: QueryInfo, callback: js.Function0[Unit]): Unit
}
object Typeofsearch {
  
  inline def apply(query: (QueryInfo, js.Function0[Unit]) => Callback): Typeofsearch = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction2((t0: QueryInfo, t1: js.Function0[Unit]) => (query(t0, t1)).runNow()))
    __obj.asInstanceOf[Typeofsearch]
  }
  
  extension [Self <: Typeofsearch](x: Self) {
    
    inline def setQuery(value: (QueryInfo, js.Function0[Unit]) => Callback): Self = StObject.set(x, "query", js.Any.fromFunction2((t0: QueryInfo, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
  }
}
