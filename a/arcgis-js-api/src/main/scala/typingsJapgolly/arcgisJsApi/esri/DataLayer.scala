package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`envelope-intersects`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`index-intersects`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.contains
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.crosses
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.envelope
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.intersects
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.layer
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.overlaps
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.point
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relation
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.touches
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.within
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataLayer
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * If true, restricted network elements should be considered when finding network locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#doNotLocateOnRestrictedElements)
    */
  var doNotLocateOnRestrictedElements: Boolean = js.native
  
  /**
    * The geometry to apply to the spatial filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#geometry)
    */
  var geometry: Geometry_ = js.native
  
  /**
    * The type of geometry specified by the [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#geometry) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#geometryType)
    */
  var geometryType: point | polyline | polygon | envelope | multipoint = js.native
  
  /**
    * The name of the data layer in the map service that is being referenced.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#name)
    */
  var name: String = js.native
  
  /**
    * The spatial relationship to be applied on the input geometry while performing the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#spatialRelationship)
    */
  var spatialRelationship: intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation = js.native
  
  var `type`: layer = js.native
  
  /**
    * A where clause for the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html#where)
    */
  var where: String = js.native
}
