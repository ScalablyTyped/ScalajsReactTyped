package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base64EncodedByteArray extends StObject {
  
  def append(b: Any): Unit
  
  def getByteAt(index: Double): Any
  
  def get_length(): Double
  
  def setByteAt(index: Double, b: Any): Unit
  
  def toBase64String(): String
}
object Base64EncodedByteArray {
  
  inline def apply(
    append: Any => Callback,
    getByteAt: Double => Any,
    get_length: CallbackTo[Double],
    setByteAt: (Double, Any) => Callback,
    toBase64String: CallbackTo[String]
  ): Base64EncodedByteArray = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1((t0: Any) => append(t0).runNow()), getByteAt = js.Any.fromFunction1(getByteAt), get_length = get_length.toJsFn, setByteAt = js.Any.fromFunction2((t0: Double, t1: Any) => (setByteAt(t0, t1)).runNow()), toBase64String = toBase64String.toJsFn)
    __obj.asInstanceOf[Base64EncodedByteArray]
  }
  
  extension [Self <: Base64EncodedByteArray](x: Self) {
    
    inline def setAppend(value: Any => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGetByteAt(value: Double => Any): Self = StObject.set(x, "getByteAt", js.Any.fromFunction1(value))
    
    inline def setGet_length(value: CallbackTo[Double]): Self = StObject.set(x, "get_length", value.toJsFn)
    
    inline def setSetByteAt(value: (Double, Any) => Callback): Self = StObject.set(x, "setByteAt", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setToBase64String(value: CallbackTo[String]): Self = StObject.set(x, "toBase64String", value.toJsFn)
  }
}
