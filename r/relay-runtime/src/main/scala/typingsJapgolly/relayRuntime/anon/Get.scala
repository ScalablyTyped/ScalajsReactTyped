package typingsJapgolly.relayRuntime.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get extends StObject {
  
  def get(): Any
}
object Get {
  
  inline def apply(get: CallbackTo[Any]): Get = {
    val __obj = js.Dynamic.literal(get = get.toJsFn)
    __obj.asInstanceOf[Get]
  }
  
  extension [Self <: Get](x: Self) {
    
    inline def setGet(value: CallbackTo[Any]): Self = StObject.set(x, "get", value.toJsFn)
  }
}
