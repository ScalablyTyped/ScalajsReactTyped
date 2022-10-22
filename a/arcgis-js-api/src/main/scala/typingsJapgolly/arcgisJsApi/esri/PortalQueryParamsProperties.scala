package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avg-rating`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`num-comments`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`num-ratings`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`num-views`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.asc_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.created
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.desc_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.modified
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.owner
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.title
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.uploaded
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalQueryParamsProperties extends StObject {
  
  /**
    * An array of categories stored within the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#categories)
    */
  var categories: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
  
  /**
    * Only relevant when querying for [PortalItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * Structured filter to use instead of the [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#query) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#filter)
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to be included in the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#results) set response.
    *
    * @default 10
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#num)
    */
  var num: js.UndefOr[Double] = js.undefined
  
  /**
    * The query string used for the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#query)
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-delimited list of fields to sort.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortField)
    */
  var sortField: js.UndefOr[
    title | uploaded | modified | username | created | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`type` | owner | `avg-rating` | `num-ratings` | `num-comments` | `num-views`
  ] = js.undefined
  
  /**
    * The order in which to sort the results.
    *
    * @default asc
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortOrder)
    */
  var sortOrder: js.UndefOr[asc_ | desc_] = js.undefined
  
  /**
    * The index of the first entry in the result set response.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#start)
    */
  var start: js.UndefOr[Double] = js.undefined
}
object PortalQueryParamsProperties {
  
  inline def apply(): PortalQueryParamsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalQueryParamsProperties]
  }
  
  extension [Self <: PortalQueryParamsProperties](x: Self) {
    
    inline def setCategories(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSortField(
      value: title | uploaded | modified | username | created | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`type` | owner | `avg-rating` | `num-ratings` | `num-comments` | `num-views`
    ): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setSortOrder(value: asc_ | desc_): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
