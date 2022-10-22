package typingsJapgolly.phantomjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkRequest extends StObject {
  
  def abort(): Unit
  
  def changeUrl(url: String): Unit
  
  def setHeader(name: String, value: String): Unit
}
object NetworkRequest {
  
  inline def apply(abort: Callback, changeUrl: String => Callback, setHeader: (String, String) => Callback): NetworkRequest = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, changeUrl = js.Any.fromFunction1((t0: String) => changeUrl(t0).runNow()), setHeader = js.Any.fromFunction2((t0: String, t1: String) => (setHeader(t0, t1)).runNow()))
    __obj.asInstanceOf[NetworkRequest]
  }
  
  extension [Self <: NetworkRequest](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setChangeUrl(value: String => Callback): Self = StObject.set(x, "changeUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHeader(value: (String, String) => Callback): Self = StObject.set(x, "setHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
