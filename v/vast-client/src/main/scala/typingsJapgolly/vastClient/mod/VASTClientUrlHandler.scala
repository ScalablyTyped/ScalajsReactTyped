package typingsJapgolly.vastClient.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vastClient.anon.FnCall
import typingsJapgolly.vastClient.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VASTClientUrlHandler extends StObject {
  
  def get(url: String, options: Timeout, cb: FnCall): Unit
}
object VASTClientUrlHandler {
  
  inline def apply(get: (String, Timeout, FnCall) => Callback): VASTClientUrlHandler = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3((t0: String, t1: Timeout, t2: FnCall) => (get(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[VASTClientUrlHandler]
  }
  
  extension [Self <: VASTClientUrlHandler](x: Self) {
    
    inline def setGet(value: (String, Timeout, FnCall) => Callback): Self = StObject.set(x, "get", js.Any.fromFunction3((t0: String, t1: Timeout, t2: FnCall) => (value(t0, t1, t2)).runNow()))
  }
}
