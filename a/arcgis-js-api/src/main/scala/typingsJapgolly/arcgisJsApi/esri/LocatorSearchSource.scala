package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.rooftop
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.street
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocatorSearchSource
  extends StObject
     with SearchSource {
  
  /**
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#apiKey)
    */
  var apiKey: String = js.native
  
  /**
    * A string array which limits the results to one or more categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#categories)
    */
  var categories: js.Array[String] = js.native
  
  /**
    * Constricts search results to a specified country code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#countryCode)
    */
  var countryCode: String = js.native
  
  /**
    * Sets the scale of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale) for the resulting search result, if the locator service doesn’t return an extent with a scale.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#defaultZoomScale)
    */
  var defaultZoomScale: Double = js.native
  
  /**
    * This property controls prioritization of [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget result candidates depending on the view scale.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#localSearchDisabled)
    */
  var localSearchDisabled: Boolean = js.native
  
  /**
    * Defines the type of location, either `street` or `rooftop`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locationType)
    */
  var locationType: rooftop | street = js.native
  
  /**
    * The name of the source for display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#name)
    */
  var name: String = js.native
  
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#searchTemplate)
    */
  var searchTemplate: String = js.native
  
  /**
    * The field name of the Single Line Address Field in the REST services directory for the locator service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#singleLineFieldName)
    */
  var singleLineFieldName: String = js.native
  
  /**
    * URL to the ArcGIS Server REST resource that represents a locator service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#url)
    */
  var url: String = js.native
}
