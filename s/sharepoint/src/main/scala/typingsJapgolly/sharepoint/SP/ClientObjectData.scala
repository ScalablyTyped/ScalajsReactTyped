package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientObjectData extends StObject {
  
  def get_clientObjectProperties(): Any
  
  def get_methodReturnObjects(): Any
  
  def get_properties(): Any
}
object ClientObjectData {
  
  inline def apply(
    get_clientObjectProperties: CallbackTo[Any],
    get_methodReturnObjects: CallbackTo[Any],
    get_properties: CallbackTo[Any]
  ): ClientObjectData = {
    val __obj = js.Dynamic.literal(get_clientObjectProperties = get_clientObjectProperties.toJsFn, get_methodReturnObjects = get_methodReturnObjects.toJsFn, get_properties = get_properties.toJsFn)
    __obj.asInstanceOf[ClientObjectData]
  }
  
  extension [Self <: ClientObjectData](x: Self) {
    
    inline def setGet_clientObjectProperties(value: CallbackTo[Any]): Self = StObject.set(x, "get_clientObjectProperties", value.toJsFn)
    
    inline def setGet_methodReturnObjects(value: CallbackTo[Any]): Self = StObject.set(x, "get_methodReturnObjects", value.toJsFn)
    
    inline def setGet_properties(value: CallbackTo[Any]): Self = StObject.set(x, "get_properties", value.toJsFn)
  }
}
