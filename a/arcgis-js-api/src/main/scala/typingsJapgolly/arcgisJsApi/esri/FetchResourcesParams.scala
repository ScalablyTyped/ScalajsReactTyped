package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.asc_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.created
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.desc_
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchResourcesParams
  extends StObject
     with Object {
  
  /**
    * The maximum number of results to be included in the result set response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var num: js.UndefOr[Double] = js.undefined
  
  /**
    * A field to sort the results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var sortField: js.UndefOr[
    created | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.size | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`type`
  ] = js.undefined
  
  /**
    * The order in which to sort the results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var sortOrder: js.UndefOr[asc_ | desc_] = js.undefined
  
  /**
    * The index of the first entry in the result set response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesParams)
    */
  var start: js.UndefOr[Double] = js.undefined
}
object FetchResourcesParams {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FetchResourcesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FetchResourcesParams]
  }
  
  extension [Self <: FetchResourcesParams](x: Self) {
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
    
    inline def setSortField(
      value: created | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.size | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`type`
    ): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setSortOrder(value: asc_ | desc_): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
