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

@js.native
trait PortalQueryParams
  extends StObject
     with Accessor {
  
  /**
    * An array of categories stored within the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#categories)
    */
  var categories: js.Array[String | js.Array[String]] = js.native
  
  /**
    * Only relevant when querying for [PortalItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#extent)
    */
  var extent: Extent = js.native
  
  /**
    * Structured filter to use instead of the [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#query) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#filter)
    */
  var filter: String = js.native
  
  /**
    * The maximum number of results to be included in the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html#results) set response.
    *
    * @default 10
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#num)
    */
  var num: Double = js.native
  
  /**
    * The query string used for the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#query)
    */
  var query: String = js.native
  
  /**
    * A comma-delimited list of fields to sort.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortField)
    */
  var sortField: title | uploaded | modified | username | created | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`type` | owner | `avg-rating` | `num-ratings` | `num-comments` | `num-views` = js.native
  
  /**
    * The order in which to sort the results.
    *
    * @default asc
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#sortOrder)
    */
  var sortOrder: asc_ | desc_ = js.native
  
  /**
    * The index of the first entry in the result set response.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html#start)
    */
  var start: Double = js.native
}
