package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONSupport extends StObject {
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  def toJSON(): Any
}
object JSONSupport {
  
  inline def apply(toJSON: CallbackTo[Any]): JSONSupport = {
    val __obj = js.Dynamic.literal(toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[JSONSupport]
  }
  
  extension [Self <: JSONSupport](x: Self) {
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
