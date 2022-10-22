package typingsJapgolly.jsprintmanager.mod.JSPM

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientPrinter extends StObject {
  
  var Id: Any
  
  def serialize(): Any
}
object IClientPrinter {
  
  inline def apply(Id: Any, serialize: CallbackTo[Any]): IClientPrinter = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], serialize = serialize.toJsFn)
    __obj.asInstanceOf[IClientPrinter]
  }
  
  extension [Self <: IClientPrinter](x: Self) {
    
    inline def setId(value: Any): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: CallbackTo[Any]): Self = StObject.set(x, "serialize", value.toJsFn)
  }
}
