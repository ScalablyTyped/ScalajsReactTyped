package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`allow-backtrack`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-and-intersections`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-only`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`from-facility`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`no-backtrack`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`to-facility`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`true-shape-with-measure`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`true-shape`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.centimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.decimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.detailed
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.inches
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.millimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.points
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.simplified
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAreaParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The list of network attribute names to be accumulated with the analysis (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.Array[String] = js.native
  
  /**
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#apiKey)
    */
  var apiKey: String = js.native
  
  /**
    * A set of attribute parameter values that can be parameterized to determine which network elements can be used by a vehicle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.Array[Any] = js.native
  
  /**
    * An array of numbers defining the breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#defaultBreaks)
    */
  var defaultBreaks: js.Array[Double] = js.native
  
  /**
    * An array of network source names to NOT use when generating polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#excludeSourcesFromPolygons)
    */
  var excludeSourcesFromPolygons: js.Array[String] = js.native
  
  /**
    * The set of facilities loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#facilities)
    */
  var facilities: DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
    * The network attribute name used as the impedance attribute in analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: String = js.native
  
  /**
    * If `true`, similar ranges will be merged in the resulting polygons.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#mergeSimilarPolygonRanges)
    */
  var mergeSimilarPolygonRanges: Boolean = js.native
  
  /**
    * The well-known ID of the spatial reference for the geometries returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  
  /**
    * The precision of the output geometry after generalization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: Double = js.native
  
  /**
    * The units of the output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards = js.native
  
  /**
    * The type of output lines to be generated in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputLines)
    */
  var outputLines: none_ | `true-shape` | `true-shape-with-measure` = js.native
  
  /**
    * The type of output polygons to be generated in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputPolygons)
    */
  var outputPolygons: none_ | simplified | detailed = js.native
  
  /**
    * Indicates if the lines should overlap from multiple facilities.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#overlapLines)
    */
  var overlapLines: Boolean = js.native
  
  /**
    * Indicates if the polygons should overlap from multiple facilities.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#overlapPolygons)
    */
  var overlapPolygons: Boolean = js.native
  
  /**
    * The set of point barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#pointBarriers)
    */
  var pointBarriers: DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
    * The set of polygon barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polygonBarriers)
    */
  var polygonBarriers: DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
    * The set of polyline barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polylineBarriers)
    */
  var polylineBarriers: DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
    * Specifies how U-turns should be handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#restrictUTurns)
    */
  var restrictUTurns: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections` = js.native
  
  /**
    * The list of network attribute names to be used as restrictions with the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.Array[String] = js.native
  
  /**
    * If `true`, facilities will be returned with the analysis results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnFacilities)
    */
  var returnFacilities: Boolean = js.native
  
  /**
    * If `true`, point barriers will be returned in the [pointBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaSolveResult.html#pointBarriers) property of the analysis results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPointBarriers)
    */
  var returnPointBarriers: Boolean = js.native
  
  /**
    * If `true`, polygon barriers will be returned in the [polygonBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaSolveResult.html#polygonBarriers) property of the analysis results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPolygonBarriers)
    */
  var returnPolygonBarriers: Boolean = js.native
  
  /**
    * If `true`, polyline barriers will be returned in the [polylineBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaSolveResult.html#polylineBarriers) property of the analysis results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPolylineBarriers)
    */
  var returnPolylineBarriers: Boolean = js.native
  
  /**
    * If `true`, lines will be split at breaks.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#splitLinesAtBreaks)
    */
  var splitLinesAtBreaks: Boolean = js.native
  
  /**
    * If `true`, polygons will be split at breaks.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#splitPolygonsAtBreaks)
    */
  var splitPolygonsAtBreaks: Boolean = js.native
  
  /**
    * Local date and time at the facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#timeOfDay)
    */
  var timeOfDay: js.Date = js.native
  
  /**
    * Options for traveling to or from the facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#travelDirection)
    */
  var travelDirection: `from-facility` | `to-facility` = js.native
  
  /**
    * A travel mode represents a means of transportation, such as driving or walking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#travelMode)
    */
  var travelMode: TravelMode = js.native
  
  /**
    * If `true`, the outermost polygon (at the maximum break value) will be trimmed.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimOuterPolygon)
    */
  var trimOuterPolygon: Boolean = js.native
  
  /**
    * If polygons are being trimmed, provides the distance to trim.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistance)
    */
  var trimPolygonDistance: Double = js.native
  
  /**
    * If polygons are being trimmed, specifies the units of [trimPolygonDistance](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistance).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistanceUnits)
    */
  var trimPolygonDistanceUnits: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards = js.native
  
  /**
    * When `true`, the hierarchy attributes for the network will be used in the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#useHierarchy)
    */
  var useHierarchy: Boolean = js.native
}
