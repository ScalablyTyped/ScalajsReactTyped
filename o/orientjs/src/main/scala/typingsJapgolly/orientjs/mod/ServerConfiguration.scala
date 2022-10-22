package typingsJapgolly.orientjs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerConfiguration extends StObject {
  
  def get(name: String): String
  
  def list(): Any
  
  def set(key: String, value: String): String
}
object ServerConfiguration {
  
  inline def apply(get: String => String, list: CallbackTo[Any], set: (String, String) => String): ServerConfiguration = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = list.toJsFn, set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[ServerConfiguration]
  }
  
  extension [Self <: ServerConfiguration](x: Self) {
    
    inline def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setList(value: CallbackTo[Any]): Self = StObject.set(x, "list", value.toJsFn)
    
    inline def setSet(value: (String, String) => String): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
