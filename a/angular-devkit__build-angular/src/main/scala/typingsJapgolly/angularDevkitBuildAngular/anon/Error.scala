package typingsJapgolly.angularDevkitBuildAngular.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  def error(message: String): Unit
  
  def warn(message: String): Unit
}
object Error {
  
  inline def apply(error: String => Callback, warn: String => Callback): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: String) => error(t0).runNow()), warn = js.Any.fromFunction1((t0: String) => warn(t0).runNow()))
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWarn(value: String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
