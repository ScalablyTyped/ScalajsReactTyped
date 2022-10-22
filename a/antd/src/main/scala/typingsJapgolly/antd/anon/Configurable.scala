package typingsJapgolly.antd.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configurable extends StObject {
  
  var configurable: Boolean
  
  def get(): Any
}
object Configurable {
  
  inline def apply(configurable: Boolean, get: CallbackTo[Any]): Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = get.toJsFn)
    __obj.asInstanceOf[Configurable]
  }
  
  extension [Self <: Configurable](x: Self) {
    
    inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setGet(value: CallbackTo[Any]): Self = StObject.set(x, "get", value.toJsFn)
  }
}
