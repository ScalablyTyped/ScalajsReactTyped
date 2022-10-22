package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemUpdateParams
  extends StObject
     with Object {
  
  /**
    * **Optional**.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#update)
    */
  var data: String | Any
}
object PortalItemUpdateParams {
  
  inline def apply(
    constructor: js.Function,
    data: String | Any,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PortalItemUpdateParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PortalItemUpdateParams]
  }
  
  extension [Self <: PortalItemUpdateParams](x: Self) {
    
    inline def setData(value: String | Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
