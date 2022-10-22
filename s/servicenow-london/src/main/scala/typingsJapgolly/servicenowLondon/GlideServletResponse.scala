package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideServletResponse extends StObject {
  
  def setContentType(`type`: String): Unit
  
  def setHeader(name: String, value: String): Unit
  
  def setStatus(value: Double): Unit
}
object GlideServletResponse {
  
  inline def apply(
    setContentType: String => Callback,
    setHeader: (String, String) => Callback,
    setStatus: Double => Callback
  ): GlideServletResponse = {
    val __obj = js.Dynamic.literal(setContentType = js.Any.fromFunction1((t0: String) => setContentType(t0).runNow()), setHeader = js.Any.fromFunction2((t0: String, t1: String) => (setHeader(t0, t1)).runNow()), setStatus = js.Any.fromFunction1((t0: Double) => setStatus(t0).runNow()))
    __obj.asInstanceOf[GlideServletResponse]
  }
  
  extension [Self <: GlideServletResponse](x: Self) {
    
    inline def setSetContentType(value: String => Callback): Self = StObject.set(x, "setContentType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHeader(value: (String, String) => Callback): Self = StObject.set(x, "setHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetStatus(value: Double => Callback): Self = StObject.set(x, "setStatus", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
