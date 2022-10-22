package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLProperties extends StObject {
  
  def clear(): Unit
  
  def delete(`object`: Any): Unit
  
  def get(`object`: Any): Any
}
object WebGLProperties {
  
  inline def apply(clear: Callback, delete: Any => Callback, get: Any => Any): WebGLProperties = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, delete = js.Any.fromFunction1((t0: Any) => delete(t0).runNow()), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[WebGLProperties]
  }
  
  extension [Self <: WebGLProperties](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDelete(value: Any => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
