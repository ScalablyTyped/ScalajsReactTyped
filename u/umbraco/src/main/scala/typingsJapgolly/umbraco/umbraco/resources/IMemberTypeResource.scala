package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.memberTypeResource
  * @description Loads in data for member types
  **/
trait IMemberTypeResource extends StObject {
  
  //return all member types
  def getTypes(): Any
}
object IMemberTypeResource {
  
  inline def apply(getTypes: CallbackTo[Any]): IMemberTypeResource = {
    val __obj = js.Dynamic.literal(getTypes = getTypes.toJsFn)
    __obj.asInstanceOf[IMemberTypeResource]
  }
  
  extension [Self <: IMemberTypeResource](x: Self) {
    
    inline def setGetTypes(value: CallbackTo[Any]): Self = StObject.set(x, "getTypes", value.toJsFn)
  }
}
