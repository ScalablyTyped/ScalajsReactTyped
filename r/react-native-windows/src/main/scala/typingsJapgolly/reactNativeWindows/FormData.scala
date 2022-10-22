package typingsJapgolly.reactNativeWindows

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormData
  extends StObject
     with _BodyInit {
  
  def append(name: String, value: Any): Unit
  
  def getParts(): js.Array[FormDataPart]
}
object FormData {
  
  inline def apply(append: (String, Any) => Callback, getParts: CallbackTo[js.Array[FormDataPart]]): FormData = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2((t0: String, t1: Any) => (append(t0, t1)).runNow()), getParts = getParts.toJsFn)
    __obj.asInstanceOf[FormData]
  }
  
  extension [Self <: FormData](x: Self) {
    
    inline def setAppend(value: (String, Any) => Callback): Self = StObject.set(x, "append", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setGetParts(value: CallbackTo[js.Array[FormDataPart]]): Self = StObject.set(x, "getParts", value.toJsFn)
  }
}
