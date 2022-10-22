package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientAction extends StObject {
  
  def get_id(): Double
  
  def get_name(): String
  
  def get_path(): ObjectPath
}
object ClientAction {
  
  inline def apply(get_id: CallbackTo[Double], get_name: CallbackTo[String], get_path: CallbackTo[ObjectPath]): ClientAction = {
    val __obj = js.Dynamic.literal(get_id = get_id.toJsFn, get_name = get_name.toJsFn, get_path = get_path.toJsFn)
    __obj.asInstanceOf[ClientAction]
  }
  
  extension [Self <: ClientAction](x: Self) {
    
    inline def setGet_id(value: CallbackTo[Double]): Self = StObject.set(x, "get_id", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setGet_path(value: CallbackTo[ObjectPath]): Self = StObject.set(x, "get_path", value.toJsFn)
  }
}
