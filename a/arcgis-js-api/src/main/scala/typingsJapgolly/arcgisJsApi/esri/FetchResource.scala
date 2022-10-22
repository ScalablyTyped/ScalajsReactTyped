package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchResource
  extends StObject
     with Object {
  
  /**
    * When the resource was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResource)
    */
  var created: js.Date
  
  /**
    * The fetched resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResource)
    */
  var resource: PortalItemResource
  
  /**
    * The size of the resource in bytes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResource)
    */
  var size: Double
}
object FetchResource {
  
  inline def apply(
    constructor: js.Function,
    created: js.Date,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    resource: PortalItemResource,
    size: Double
  ): FetchResource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resource = resource.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResource]
  }
  
  extension [Self <: FetchResource](x: Self) {
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setResource(value: PortalItemResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
